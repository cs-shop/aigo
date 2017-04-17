/* user-reg/1.0.0 register.1130.js Date:2017-03-02 16:10:04 */
define("js/register.1130.js", ["js/placeholder.js", "js/validation.1130.js", "js/suggest.1130.js", "js/dialog.1130.js", "js/countrycode.1130.js", "js/jquery.tinyscrollbar.js", "js/capslock.js"],
function(require, exports, module) {
    require("js/placeholder.js"),
    require("js/validation.1130.js"),
    require("js/suggest.1130.js"),
    require("js/dialog.1130.js");
    var CountryCodeLayer = require("js/countrycode.1130.js");
    var tinyscrollbar = require("js/jquery.tinyscrollbar.js");
    var capslock = require("js/capslock.js");
    var form = $("#register-form");
    var form_account = $("#form-account");
    var form_email = $("#form-email");
    var form_pwd = $("#form-pwd");
    var form_equalTopwd = $("#form-equalTopwd");
    var form_phone = $("#form-phone");
    var btn_getcode = $("#getPhoneCode");
    var auth_code = $("#authCode");
    var imgAuthCode = $("#imgAuthCode");
    var phone_code = $("#phoneCode");
    var state = $("#state");
    var uuid = $("#uuid").val();
    var selectCountry = $("#select-country");
    var icons = {
        def: '<i class="i-def"></i>',
        error: '<i class="i-error"></i>',
        weak: '<i class="i-pwd-weak"></i>',
        medium: '<i class="i-pwd-medium"></i>',
        strong: '<i class="i-pwd-strong"></i>'
    };
    var registerType = "phone";
    var phoneNoWithCountryCode = "";
    var ishidden = $("#authcodeDiv").is(":hidden");
    suggestsList = {};
    var valCountry = {};
    function init() {
        initPlaceholer(),
        setAuthcode(),
        checkAcount(),
        phoneCountry(),
        checkEmail(),
        checkPwd(),
        validate(),
        agreen(),
        preventAutoFillPassword(),
        bindEvent(),
        $("#getPhoneCode").removeAttr("disabled")
    }
    function preventAutoFillPassword() {
        window.setTimeout(function() {
            $(".fakeinput").remove()
        },
        300)
    }
    function getStringLength(a) {
        if (!a) return 0;
        var b = 0;
        for (var c = 0; c < a.length; c++) {
            var d = a.charAt(c);
            b += /^[\u0000-\u00ff]$/.test(d) ? 1 : 2
        }
        return b
    }
    function resetStringLength(a, b) {
        for (b = "#" + b; getStringLength($(b).val()) > a;) $(b).val($(b).val().substring(0, $(b).val().length - 1))
    }
    function bindEvent() {
        $("input").bind("input",
        function() {
            var a = $(this).attr("id");
            switch (a) {
            case "form-equalTopwd":
            case "form-pwd":
                resetStringLength(20, a);
                break;
            case "form-email":
                resetStringLength(50, a);
                break;
            case "form-phone":
                resetStringLength(11, a);
                break;
            case "authCode":
            case "phoneCode":
                resetStringLength(6, a)
            }
        }),
        btn_getcode.bind("click",
        function() {
            ishidden ? getPhoneCode() : validateAuthCode()
        })
    }
    var validator;
    function validate() {
        addrules(),
        validator = form.validate({
            ignore: ".ignore",
            submitHandler: function(a) {
                return formSubmit(a),
                !1
            },
            onkeyup: !1,
            rules: {
                regName: {
                    required: !0,
                    user: !0,
                    rangelength: [4, 20],
                    fullNumber: !0,
                    remote: {
                        url: "../validateuser/isPinEngaged",
                        contentType: "application/x-www-form-urlencoded; charset=utf-8",
                        type: "post",
                        cache: !1,
                        data: {
                            pin: function() {
                                return form_account.val()
                            }
                        },
                        callback: userCallback
                    }
                },
                pwd: {
                    required: !0,
                    rangelength: [6, 20],
                    strength: !0,
                    same: "#form-account"
                },
                pwdRepeat: {
                    required: !0,
                    equalTo: "#form-pwd"
                },
                email: {
                    required: !0,
                    maxlength: 50,
                    email: !0,
                    remote: {
                        cache: !1,
                        url: "../validateuser/isEmailEngaged",
                        callback: emailCallback
                    }
                },
                phone: {
                    required: !0,
                    phone: !0,
                    remote: {
                        url: "../validateuser/isMobileEngaged",
                        cache: !1,
                        data: {
                            mobile: function() {
                                return "+" + selectCountry.attr("country_id") + form_phone.val()
                            }
                        },
                        callback: phoneCallback
                    }
                },
                authCode: {
                    required: !0
                },
                mobileCode: {
                    required: !0
                },
                agreen: {
                    required: !0
                }
            },
            messages: {
                regName: {
                    required: icons.error + "\u8bf7\u8f93\u5165\u7528\u6237\u540d",
                    rangelength: icons.error + "\u957f\u5ea6\u53ea\u80fd\u5728{0}-{1}\u4e2a\u5b57\u7b26\u4e4b\u95f4"
                },
                pwd: {
                    required: icons.error + "\u8bf7\u8f93\u5165\u5bc6\u7801",
                    rangelength: icons.error + "\u957f\u5ea6\u53ea\u80fd\u5728{0}-{1}\u4e2a\u5b57\u7b26\u4e4b\u95f4"
                },
                pwdRepeat: {
                    required: icons.error + "\u8bf7\u518d\u6b21\u8f93\u5165\u5bc6\u7801",
                    equalTo: icons.error + "\u4e24\u6b21\u5bc6\u7801\u8f93\u5165\u4e0d\u4e00\u81f4"
                },
                email: {
                    required: icons.error + "\u8bf7\u8f93\u5165\u90ae\u7bb1",
                    email: icons.error + "\u683c\u5f0f\u9519\u8bef"
                },
                phone: {
                    required: icons.error + "\u8bf7\u8f93\u5165\u624b\u673a\u53f7"
                },
                authCode: {
                    required: icons.error + "\u8bf7\u8f93\u5165\u56fe\u7247\u9a8c\u8bc1\u7801"
                },
                mobileCode: {
                    required: icons.error + "\u8bf7\u8f93\u5165\u77ed\u4fe1\u9a8c\u8bc1\u7801"
                },
                agreen: {
                    required: icons.error + "\u8bf7\u540c\u610f\u534f\u8bae\u5e76\u52fe\u9009"
                }
            }
        })
    }
    function formSubmit(form) {
        $btnRegister = $("#form-register"),
        phoneNoWithCountryCode = selectCountry.attr("country_id") + form_phone.val();
        var seqSid = window._jdtdmap_sessionId;
        var param = $(form).serialize().replace(/phone=\d+/, "phone=" + encodeURIComponent("+") + phoneNoWithCountryCode);
        var ajaxurl = "../register/regService?";
        "email" == registerType && (ajaxurl = "../register/sendRegEmail?"),
        $.ajax({
            type: "post",
            url: ajaxurl + location.search.substring(1),
            contentType: "application/x-www-form-urlencoded; charset=utf-8",
            data: param + "&seqSid=" + seqSid,
            cache: !1,
            beforeSend: function() {
                $btnRegister.text("\u6b63\u5728\u6ce8\u518c..")
            },
            error: function() {
                showDialog("\u7f51\u7edc\u7e41\u5fd9\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5")
            },
            success: function(response) {
                if (response) {
                    var obj = eval(response);
                    if (obj.info && ("\u77ed\u4fe1\u9a8c\u8bc1\u7801\u4e0d\u6b63\u786e\u6216\u5df2\u8fc7\u671f!" == obj.info ? (console.log("showerror"), showMobileCodeError()) : showDialog(obj.info)), obj.noAuth && (window.location = obj.noAuth), 1 == obj.success) {
                        var ssoHost = ""; - 1 != obj.dispatchUrl.indexOf("jdpay.com") ? ssoHost = "sso.jdpay.com": -1 != obj.dispatchUrl.indexOf("jcloud.com") && (ssoHost = "sso.jcloud.com"),
                        -1 != obj.dispatchUrl.indexOf("jdpay.com") || -1 != obj.dispatchUrl.indexOf("jcloud.com") ? jQuery.getJSON("//sso.jd.com/setCookie?t=" + ssoHost + "&callback=?",
                        function() {
                            successRedirectURL(obj.dispatchUrl)
                        }) : successRedirectURL(obj.dispatchUrl)
                    }
                }
                $btnRegister.text("\u7acb\u5373\u6ce8\u518c")
            }
        })
    }
    function phonecodeCallback(a, b, c) {
        var d = !1;
        var e = {};
        var f = c.data;
        return a.value == f ? d = !0 : e[a.name] = icons.error + "\u9a8c\u8bc1\u7801\u9519\u8bef",
        b.showErrors(e),
        d
    }
    function addrules() {
        $.validator.addMethod("user",
        function(a, b) {
            return this.optional(b) || /^[A-Za-z0-9_\-\u4e00-\u9fa5]+$/.test(a)
        },
        icons.error + "\u683c\u5f0f\u9519\u8bef\uff0c\u4ec5\u652f\u6301\u6c49\u5b57\u3001\u5b57\u6bcd\u3001\u6570\u5b57\u3001\u201c-\u201d\u201c_\u201d\u7684\u7ec4\u5408"),
        $.validator.addMethod("fullNumber",
        function(a, b) {
            return this.optional(b) || !/^[0-9]+$/.test(a)
        },
        icons.error + "\u7528\u6237\u540d\u4e0d\u80fd\u662f\u7eaf\u6570\u5b57\uff0c\u8bf7\u91cd\u65b0\u8f93\u5165\uff01"),
        $.validator.addMethod("phone",
        function(a, b) {
            var c = selectCountry.attr("country_id");
            return this.optional(b) || new RegExp(valCountry[c]).test(a)
        },
        icons.error + "\u683c\u5f0f\u6709\u8bef"),
        $.validator.addMethod("strength",
        function(a, b) {
            return this.optional(b) || pwdStrengthRule($(b), a)
        },
        icons.weak + "\u6709\u88ab\u76d7\u98ce\u9669,\u5efa\u8bae\u4f7f\u7528\u5b57\u6bcd\u3001\u6570\u5b57\u548c\u7b26\u53f7\u4e24\u79cd\u53ca\u4ee5\u4e0a\u7ec4\u5408"),
        $.validator.addMethod("same",
        function(a, b, c) {
            var d = $(c);
            return a !== d.val()
        },
        icons.error + "\u5bc6\u7801\u4e0e\u7528\u6237\u540d\u76f8\u4f3c\uff0c\u6709\u88ab\u76d7\u98ce\u9669\uff0c\u8bf7\u66f4\u6362\u5bc6\u7801")
    }
    var weakPwds = ["123456", "123456789", "111111", "5201314", "12345678", "123123", "password", "1314520", "123321", "7758521", "1234567", "5211314", "666666", "520520", "woaini", "520131", "11111111", "888888", "hotmail.com", "112233", "123654", "654321", "1234567890", "a123456", "88888888", "163.com", "000000", "yahoo.com.cn", "sohu.com", "yahoo.cn", "111222tianya", "163.COM", "tom.com", "139.com", "wangyut2", "pp.com", "yahoo.com", "147258369", "123123123", "147258", "987654321", "100200", "zxcvbnm", "123456a", "521521", "7758258", "111222", "110110", "1314521", "11111111", "12345678", "a321654", "111111", "123123", "5201314", "00000000", "q123456", "123123123", "aaaaaa", "a123456789", "qq123456", "11112222", "woaini1314", "a123123", "a111111", "123321", "a5201314", "z123456", "liuchang", "a000000", "1314520", "asd123", "88888888", "1234567890", "7758521", "1234567", "woaini520", "147258369", "123456789a", "woaini123", "q1q1q1q1", "a12345678", "qwe123", "123456q", "121212", "asdasd", "999999", "1111111", "123698745", "137900", "159357", "iloveyou", "222222", "31415926", "123456", "111111", "123456789", "123123", "9958123", "woaini521", "5201314", "18n28n24a5", "abc123", "password", "123qwe", "123456789", "12345678", "11111111", "dearbook", "00000000", "123123123", "1234567890", "88888888", "111111111", "147258369", "987654321", "aaaaaaaa", "1111111111", "66666666", "a123456789", "11223344", "1qaz2wsx", "xiazhili", "789456123", "password", "87654321", "qqqqqqqq", "000000000", "qwertyuiop", "qq123456", "iloveyou", "31415926", "12344321", "0000000000", "asdfghjkl", "1q2w3e4r", "123456abc", "0123456789", "123654789", "12121212", "qazwsxedc", "abcd1234", "12341234", "110110110", "asdasdasd", "123456", "22222222", "123321123", "abc123456", "a12345678", "123456123", "a1234567", "1234qwer", "qwertyui", "123456789a", "qq.com", "369369", "163.com", "ohwe1zvq", "xiekai1121", "19860210", "1984130", "81251310", "502058", "162534", "690929", "601445", "1814325", "as1230", "zz123456", "280213676", "198773", "4861111", "328658", "19890608", "198428", "880126", "6516415", "111213", "195561", "780525", "6586123", "caonima99", "168816", "123654987", "qq776491", "hahabaobao", "198541", "540707", "leqing123", "5403693", "123456", "123456789", "111111", "5201314", "123123", "12345678", "1314520", "123321", "7758521", "1234567", "5211314", "520520", "woaini", "520131", "666666", "RAND#a#8", "hotmail.com", "112233", "123654", "888888", "654321", "1234567890", "a123456"];
    var pwdStrength = {
        1 : {
            reg: /^.*([\W_])+.*$/i,
            msg: icons.weak + "\u6709\u88ab\u76d7\u98ce\u9669,\u5efa\u8bae\u4f7f\u7528\u5b57\u6bcd\u3001\u6570\u5b57\u548c\u7b26\u53f7\u4e24\u79cd\u53ca\u4ee5\u4e0a\u7ec4\u5408"
        },
        2 : {
            reg: /^.*([a-zA-Z])+.*$/i,
            msg: icons.medium + "\u5b89\u5168\u5f3a\u5ea6\u9002\u4e2d\uff0c\u53ef\u4ee5\u4f7f\u7528\u4e09\u79cd\u4ee5\u4e0a\u7684\u7ec4\u5408\u6765\u63d0\u9ad8\u5b89\u5168\u5f3a\u5ea6"
        },
        3 : {
            reg: /^.*([0-9])+.*$/i,
            msg: icons.strong + "\u4f60\u7684\u5bc6\u7801\u5f88\u5b89\u5168"
        }
    };
    function pwdStrengthRule(a, b) {
        var c = 0;
        var d = 0;
        var e = !0;
        var f = getStringLength(b);
        if (6 > f) return a.parent().removeClass("form-item-valid").removeClass("form-item-error"),
        void a.parent().next().find("span").removeClass("error").html($(a).attr("default"));
        for (key in pwdStrength) pwdStrength[key].reg.test(b) && d++;
        return 1 == d ? c = f > 10 ? 2 : 1 : 2 == d ? (11 > f && f > 5 && (c = 2), f > 10 && (c = 3)) : 3 == d && f > 6 && (c = 3),
        -1 !== $.inArray(b, weakPwds) && (e = !1, c = 1),
        e && c > 0 ? a.parent().removeClass("form-item-error").addClass("form-item-valid") : a.parent().addClass("form-item-error").removeClass("form-item-valid"),
        void 0 !== pwdStrength[c] && (pwdStrength[c] > 3 ? pwdStrength[c] = 3 : pwdStrength[c], a.parent().next().html("<span>" + pwdStrength[c].msg + "</span>")),
        e
    }
    function checkEmail() {
        var a = form_email.parents(".item-email-wrap");
        var b = $(".orEmail");
        var c = $(".orPhone");
        a.find("txt").css("line-height", "52px"),
        b.click(function() {
            a.show(),
            b.hide(),
            form_email.removeClass("ignore"),
            registerType = "email"
        }),
        c.click(function() {
            a.hide(),
            b.show(),
            form_email.addClass("ignore"),
            registerType = "phone"
        }),
        emailSuggest()
    }
    function emailSuggest() {
        var a = ["@qq.com", "@163.com", "@126.com", "@Sina.com", "@Sohu.com", "@Gmail.com"];
        form_email.suggest({
            type: "email",
            items: a,
            customerClass: "email-suggest",
            onshow: function() {
                hideError(form_email)
            }
        })
    }
    function checkAcount() {
        form_account.parent();
        var b = /^[A-Za-z0-9_\-\u4e00-\u9fa5]+$/;
        var c = icons.error + "\u683c\u5f0f\u9519\u8bef\uff0c\u4ec5\u652f\u6301\u6c49\u5b57\u3001\u5b57\u6bcd\u3001\u6570\u5b57\u3001\u201c-\u201d\u201c_\u201d\u7684\u7ec4\u5408";
        form_account.on("keyup",
        function(a) {
            if (!filterKey(a)) {
                var d = $(this).val();
                hideError(form_account),
                "" == d || b.test(d) || onKeyupHandler(form_account, c),
                suggestsList.username && suggestsList.username.hide()
            }
        }),
        $("#form-phone,#form-email").on("keyup",
        function(a) {
            if (!filterKey(a)) {
                var b = $(this).val();
                "" == b && hideError($(a.target))
            }
        })
    }
    function filterKey(a) {
        var b = [13, 9, 16, 17, 18, 20, 35, 36, 37, 38, 39, 40, 45, 144, 225];
        return - 1 !== $.inArray(a.keyCode, b)
    }
    function checkPwd() {
        form_pwd.on("keyup",
        function(a) {
            var b = $(this).val();
            13 != a.keyCode && pwdStrengthRule(form_pwd, b)
        })
    }
    function userCallback(a, b, c) {
        var d = !1;
        var e = {};
        var f = c.morePin;
        0 == c.success && (d = !0),
        2 == c.success && (d = !1, b.settings.messages[a.name].remote = e[a.name] = icons.error + "\u7528\u6237\u540d\u5305\u542b\u4e86\u975e\u6cd5\u8bcd"),
        1 == c.success && getStringLength(a.value) > 15 && (d = !1, b.settings.messages[a.name].remote = e[a.name] = icons.error + "\u8be5\u7528\u6237\u540d\u5df2\u88ab\u4f7f\u7528\uff0c\u8bf7\u91cd\u65b0\u8f93\u5165");
        function g() {
            var b = $(a);
            return b.suggest({
                items: f,
                customerClass: "user-suggest"
            })
        }
        if (f && f.length) {
            d = !1,
            b.settings.messages[a.name].remote = e[a.name] = icons.error + "\u8be5\u7528\u6237\u540d\u5df2\u88ab\u4f7f\u7528\uff0c\u8bf7\u91cd\u65b0\u8f93\u5165"; {
                $(a).parent()
            }
            f.unshift({
                value: '<i class="i-error1"></i><span>\u5df2\u6ce8\u518c\uff0c\u63a8\u8350\u60a8\u9009\u62e9</span>',
                disable: !0
            }),
            suggestsList.username ? (suggestsList.username.render(f).show(), $(".suggest-container").closest(".form-item").css("z-index", 15)) : (suggestsList.username = g(), $(".suggest-container").closest(".form-item").css("z-index", 15)),
            b.settings.messages[a.name].remote = function() {
                $(a).focus(),
                suggestsList.username && (suggestsList.username.show(), $(".form-item-account").addClass("form-item-error"))
            }
        }
        return d || ($(a).focus(), b.showErrors(e), $(".form-item-account").addClass("form-item-error")),
        d
    }
    function phoneCallback(a, b, c) {
        var d = !1,
        e = {};
        return 0 == c.success && ($(a).data("isbind", ""), state.val(""), $(a).parent().removeClass("phone-binded"), $(a).parent().next().removeClass("phone-bind-tip").html("<span></span>"), d = !0),
        1 == c.success && (d = !0, $(a).data("isbind", "unbind"), state.val("unbind"), $(a).parent().addClass("phone-binded"), $(a).parent().next().addClass("phone-bind-tip").html('<span><i class="i-info"></i>\u53f7\u7801\u5df2\u5360\u7528\uff0c<a href="//safe.jd.com/findPwd/index.action" class="" clstag="pageclick|keycount|201612011|2">\u627e\u56de\u8d26\u53f7\uff1f</a> \u82e5\u7ee7\u7eed\u6ce8\u518c\u5c06\u4e0e\u539f\u8d26\u53f7\u89e3\u7ed1</span>')),
        2 == c.success && (d = !1, $(a).data("isbind", ""), state.val(""), $(a).parent().removeClass("phone-binded"), b.settings.messages[a.name].remote = e[a.name] = icons.error + "\u8be5\u624b\u673a\u53f7\u5df2\u91cd\u65b0\u6ce8\u518c\u5e76\u7ed1\u5b9a\uff0c" + c.ub + "\u5929\u5185\u4e0d\u53ef\u6539\u7ed1"),
        d || ($(a).focus(), b.showErrors(e)),
        d
    }
    function emailCallback(a, b, c) {
        var d = !1,
        e = {};
        return 0 == c.success && (d = !0),
        1 == c.success && (b.settings.messages[a.name].remote = e[a.name] = icons.error + "\u8be5\u90ae\u7bb1\u5df2\u88ab\u4f7f\u7528\uff0c\u8bf7\u66f4\u6362\u5176\u5b83\u90ae\u7bb1"),
        2 == c.success && (b.settings.messages[a.name].remote = e[a.name] = icons.error + "\u683c\u5f0f\u9519\u8bef"),
        3 == c.success && (b.settings.messages[a.name].remote = e[a.name] = icons.error + "\u8bf7\u66f4\u6362\u5176\u5b83\u90ae\u7bb1"),
        d || ($(a).focus(), b.showErrors(e)),
        d
    }
    function phoneCountry() {
        valCountry = CountryCodeLayer.init()
    }
    function showMobileCodeError() {
        var a = {};
        validator.settings.messages.mobileCode = a.mobileCode = icons.error + "\u9a8c\u8bc1\u7801\u4e0d\u6b63\u786e\u6216\u5df2\u8fc7\u671f\uff0c\u8bf7\u91cd\u65b0\u83b7\u53d6",
        setAuthcode(),
        validator.showErrors(a)
    }
    function validateAuthCode() {
        if (form_phone.valid() && (auth_code.valid() || 1 == ishidden)) {
            if ("" == auth_code.val()) return imgAuthCode.parent().addClass("form-item-error"),
            void imgAuthCode.parent().next().find("span").addClass("error").show().html(icons.error + "\u8bf7\u8f93\u5165\u56fe\u7247\u9a8c\u8bc1\u7801");
            var a = {
                uuid: uuid,
                authCode: auth_code.val()
            };
            $.ajax({
                url: "../validate/validateAuthCode?r=" + Math.random(),
                type: "post",
                dataType: "json",
                contentType: "application/x-www-form-urlencoded; charset=utf-8",
                data: a,
                success: function(a) {
                    var b = !1;
                    return 0 == a.success && (b = !0, $("#authCode").parent().addClass("form-item-valid"), getPhoneCode()),
                    1 == a.success && (imgAuthCode.parent().addClass("form-item-error"), imgAuthCode.parent().next().find("span").addClass("error").show().html(icons.error + "\u9a8c\u8bc1\u7801\u4e0d\u6b63\u786e\u6216\u5df2\u8fc7\u671f")),
                    b ? void 0 : void imgAuthCode.trigger("click")
                }
            })
        }
    }
    function getPhoneCode() {
        if (form_phone.valid() && (auth_code.valid() || 1 == ishidden)) {
            var sendUrl = "../notifyuser/mobileCode";
            $("#getPhoneCode").attr("disabled", !0),
            $.ajax({
                url: sendUrl,
                cache: !1,
                data: {
                    state: form_phone.data("isbind"),
                    mobile: "+" + selectCountry.attr("country_id") + form_phone.val()
                },
                success: function(response) {
                    $("#getPhoneCode").removeAttr("disabled");
                    var response = eval(response);
                    hideError(phone_code),
                    (1 == response.rs || response.remain) && ("mobileConstrain8" == response.rs ? ($("body").dialog({
                        title: null,
                        fixed: !0,
                        width: 420,
                        height: 220,
                        maskClose: !0,
                        type: "html",
                        source: '<div class="registerDialog voiceVerifyDialog">                        <div class="ico"></div>                        <div class="con">                        \u8bf7\u63a5\u542c <span class="blue">028/010/12590</span> \u5f00\u5934\u7684\u6765\u7535 <br/>\u6211\u4eec\u5c06\u901a\u8fc7\u7535\u8bdd\u64ad\u62a5\u8bed\u97f3\u9a8c\u8bc1\u7801                                    </div><a href="javascript:void(0)" class="btn-red">\u77e5\u9053\u4e86</a></div>                                    ',
                        onReady: function() {
                            $(".btn-red").on("click",
                            function() {
                                $.closeDialog()
                            })
                        }
                    }), btn_getcode.parent().next().find("span").show().html(icons.def + "\u6b63\u5728\u8fdb\u884c\u8bed\u97f3\u9a8c\u8bc1\uff0c\u8bf7\u63a5\u542c 028/010/12590 \u5f00\u5934\u7684\u6765\u7535\u3002")) : btn_getcode.parent().next().find("span").show().html(icons.def + (response.remain || "\u9a8c\u8bc1\u7801\u5df2\u53d1\u9001\uff0c120s\u5185\u8f93\u5165\u6709\u6548\u3002")), $("#getPhoneCode").attr("disabled", !0), countdown()),
                    ( - 1 == response.rs || -2 == response.rs) && btn_getcode.parent().next().find("span").show().html(icons.def + "\u7f51\u7edc\u7e41\u5fd9\uff0c\u8bf7\u7a0d\u540e\u91cd\u65b0\u83b7\u53d6\u9a8c\u8bc1\u7801"),
                    response.info && btn_getcode.parent().next().find("span").show().html(icons.def + response.info)
                }
            });
            function countdown() {
                var a = 120;
                var b;
                btn_getcode.html(a + "s\u540e\u91cd\u65b0\u83b7\u53d6").addClass("btn-code-disable"),
                b = setInterval(function() {
                    a--,
                    btn_getcode.html(a + "s\u540e\u91cd\u65b0\u83b7\u53d6"),
                    0 == a && (clearInterval(b), btn_getcode.html("\u83b7\u53d6\u9a8c\u8bc1\u7801").removeClass("btn-code-disable"), $("#getPhoneCode").removeAttr("disabled"))
                },
                1e3)
            }
        }
    }
    function setAuthcode() {
        imgAuthCode.trigger("click"),
        imgAuthCode.click(function() {
            auth_code.val(""),
            auth_code.focus()
        })
    }
    function hideError(a, b) {
        var c = a.parent();
        var b = b || a.attr("default");
        c.removeClass("form-item-error form-item-valid"),
        c.next().find("span").removeClass("error").html(b).show(),
        c.next().removeClass("phone-bind-tip"),
        c.removeClass("phone-binded")
    }
    function onKeyupHandler(a, b) {
        var c = a.parent();
        c.hasClass("form-item-error") || c.addClass("form-item-error"),
        c.removeClass("form-item-valid"),
        c.next().find("span").addClass("error").html(b).show()
    }
    function initPlaceholer() {
        $(".item-email-wrap").show(),
        $("input[placeholder]").placeholder({
            isValue: !0,
            topDiff: 1
        }),
        $(".item-email-wrap").hide()
    }
    function agreen() {
        $("#protocol").click(function() {
            return $("body").dialog({
                fixed: !0,
                width: 947,
                height: 517,
                title: "\u4eac\u4e1c\u7528\u6237\u6ce8\u518c\u534f\u8bae",
                maskClose: !0,
                type: "html",
                source: '<div class="protocol">' + $("#protocoldiv").html() + "</div>",
                onReady: function() {
                    this.content.find(".protocol-button").click(function() {
                        $.closeDialog()
                    })
                }
            }),
            !1
        }),
        $("#payProtocol").click(function() {
            return $("body").dialog({
                fixed: !0,
                width: 987,
                height: 417,
                title: "\u4eac\u4e1c\u94b1\u5305\u670d\u52a1\u534f\u8bae",
                maskClose: !0,
                autoIframe: !0,
                hasContinueBtn: !0,
                scrolling: !0,
                type: "iframe",
                extendMainClass: "jd-iframe",
                source: "//qianbao.jd.com/p/page/h5OLmzQjm11J.htm?t=1480557019477",
                onReady: function() {
                    $(".protocol-button-pay").click(function() {
                        $.closeDialog()
                    })
                }
            }),
            !1
        }),
        $("#qyPayProtocol").click(function() {
            return $("body").dialog({
                fixed: !0,
                width: 987,
                height: 417,
                hasContinueBtn: !0,
                title: "\u4f01\u4e1a\u94b1\u5305\u670d\u52a1\u534f\u8bae",
                maskClose: !0,
                scrolling: !0,
                autoIframe: !0,
                type: "iframe",
                extendMainClass: "jd-iframe",
                source: "//biz.jdpay.com/protocol.htm",
                onReady: function() {
                    $(".protocol-button-pay").click(function() {
                        $.closeDialog()
                    })
                }
            }),
            !1
        }),
        $("#privacyProtocolTrigger").click(function() {
            return $("body").dialog({
                fixed: !0,
                width: 947,
                height: 517,
                title: "\u9690\u79c1\u653f\u7b56",
                maskClose: !0,
                type: "html",
                source: '<div class="protocol">' + $("#privacyProtocol").html() + "</div>",
                onReady: function() {
                    this.content.find(".protocol-button").click(function() {
                        $.closeDialog()
                    })
                }
            }),
            !1
        })
    }
    function showDialog(a) {
        $("body").dialog({
            title: "\u63d0\u793a",
            fixed: !0,
            width: 380,
            maskClose: !0,
            type: "html",
            source: '<div class="registerDialog">                        <div class="ico"></div>                        <div class="con">                        ' + a + "                    </div></div>"
        })
    }
    exports.init = init
});
function successRedirectURL(a) {
    var b = !-[1];
    if (b) {
        var c = document.createElement("a");
        c.href = a,
        c.style.display = "none",
        document.body.appendChild(c),
        c.target = "_top",
        c.click()
    } else window.top.location = a
}