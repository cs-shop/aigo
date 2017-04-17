<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="/pages/common/common.jsp"%>
<title>cs-shop注册</title>
<meta charset="utf-8">
<link rel="stylesheet" type="text/css"
	href="${ctx}/css/user/jdregister.css">
<script type="text/javascript" src="${ctx}/js/user/register.js"></script>
<script type="text/javascript" src="${ctx}/js/capslock.js"></script>
<script type="text/javascript" src="${ctx}/js/register.1130.js"></script>
<script type="text/javascript" src="${ctx}/js/validation.1130.js"></script>
</head>
<body>
	<div id="form-header" class="header">
		<div class="logo-con w clearfix">
			<a href="${ctx}" class="logo"> </a>
			<div class="logo-title">欢迎注册</div>
			<div class="have-account">
				已有账号？ <a href="${ctx}/pages/user/login.jsp">请登录</a>
			</div>
		</div>

	</div>
	<div class="container w">

		<div class="main clearfix" id="form-main">
			<div class="reg-form fl">
				<form action="" id="register-form" method="post">
					<input type="hidden" name="new" value="new_person_reg" /> <input
						type="hidden" id="localmisc" name="localmisc" value="" /> <input
						type="hidden" name="regType" id="regType" value="person" /> <input
						type="hidden" name="uuid" id="uuid"
						value="3cdcb471-16a3-4453-bb87-670340160c28" /> <input
						type="hidden" name="verifymc" id="verifymc" value="" /> <input
						type="hidden" name="emailMg" id="emailMg" /> <input type="hidden"
						name="authcodeMg" id="authcodeMg" /> <input type="hidden"
						name="state" id="state" value="" /> <input type="hidden"
						name="tgId" id="tgId" value="" /> <input type="hidden" name="eid"
						id="eid" value="" /> <input type="hidden" name="fp" id="sessionId"
						value="" /> <input type="hidden" id="jcloud" name="jcloud"
						value="" /> <input type="hidden" id="ucJcloud" name="ucJcloud"
						value="" /> <input type="hidden" id="regPage" name="regPage"
						value="regPage1492158392950" /> <input type="hidden" value="-1"
						id="hnschool" class="hide" /> <input type="hidden"
						name="yJBpuCVQcz" value="cviJx" /> <input type="hidden"
						id="schoolid" name="schoolid" class="hide" />
					<!--chrome autocomplete off bug hack-->
					<input style="display: none" name="hack" /> <input type="password"
						style="display: none" name="hack1" />

					<div class="form-item form-item-account" id="form-item-account">
						<label>用 户 名</label> <input type="text" id="form-account"
							name="regName" class="field" autocomplete="off" maxlength="20"
							placeholder="您的账户名和登录名"
							default='<i class="i-def"></i>支持中文、字母、数字、“-”“_”的组合，4-20个字符' /> <i
							class="i-status"></i>
					</div>
					<div class="input-tip">
						<span></span>
					</div>
					<div class="form-item">
						<label>设 置 密 码</label> <input style="display: none"
							type="password" name="pwd" class="fakeinput" /> <input
							type="password" name="pwd" id="form-pwd" class="field"
							maxlength="20" placeholder="建议至少使用两种字符组合"
							default="<i class=i-def></i>建议使用字母、数字和符号两种及以上的组合，6-20个字符" /> <i
							class="i-status"></i>
					</div>
					<div class="input-tip">
						<span></span>
					</div>
					<div class="form-item">
						<label>确 认 密 码</label> <input style="display: none"
							type="password" name="pwdRepeat" class="fakeinput" /> <input
							type="password" name="pwdRepeat" id="form-equalTopwd"
							class="field" placeholder="请再次输入密码" maxlength="20"
							default='<i class="i-def"></i>请再次输入密码' /> <i class="i-status"></i>
					</div>
					<div class="input-tip">
						<span></span>
					</div>
					<div class="item-email-wrap">
						<div class="form-item">
							<label>邮 箱 验 证</label> <input type="text" name="email"
								id="form-email" class="field ignore" autocomplete="off"
								placeholder="建议使用常用邮箱" id="email-input"
								default='<i class="i-def"></i>完成验证后，你可以用该邮箱登录和找回密码' /> <i
								class="i-status"></i>
						</div>
						<div class="input-tip">
							<span></span>
						</div>
						<div class="orPhone">
							<a href="javascript:;">手机验证</a>
						</div>
					</div>
					<div class="item-phone-wrap">
						<div class="form-item form-item-phone">
							<label class="select-country" id="select-country"
								country_id="0086">中国 0086<a href="javascript:void(0) "
								tabindex="-1" class="arrow"></a></label> <input type="text"
								id="form-phone" name="phone" class="field"
								placeholder="建议使用常用手机" autocomplete="off" maxlength="11"
								default='<i class="i-def"></i>完成验证后，你可以用该手机登录和找回密码' /> <i
								class="i-status"></i>
						</div>
						<div class="input-tip">
							<span></span>
						</div>
						<div class="orEmail">
							<a href="javascript:;" tabindex="-1">邮箱验证</a>
						</div>
					</div>
					<div class="form-item form-item-authcode">
						<label>验 证 码</label> <input type="text" autocomplete="off"
							name="authCode" id="authCode" maxlength="6"
							class="field form-authcode" placeholder="请输入验证码"
							default='<i class="i-def"></i>看不清？点击图片更换验证码' /> <img
							class="img-code" title="换一换" id="imgAuthCode"
							onclick="this.src= document.location.protocol +'//authcode.jd.com/verify/image?a=0&amp;acid=3cdcb471-16a3-4453-bb87-670340160c28&amp;uid=3cdcb471-16a3-4453-bb87-670340160c28&amp;srcid=reg&amp;is=889c64ae11ee7e5ba5e2afd61aecb439&amp;yys='+new Date().getTime()"
							ver_colorofnoisepoint="#888888" />
					</div>
					<div class="input-tip">
						<span></span>
					</div>
					<div class="form-item form-item-phonecode">
						<label>手机验证码</label> <input type="text" name="mobileCode"
							maxlength="6" id="phoneCode" class="field phonecode"
							placeholder="请输入手机验证码" autocomplete="off" />
						<button id="getPhoneCode" class="btn-phonecode" type="button">获取验证码</button>
						<i class="i-status"></i>
					</div>
					<div class="input-tip">
						<span></span>
					</div>
					<div class="form-agreen">
						<div>
							<input type="checkbox" name="agreen" checked="" />阅读并同意<a
								href="javascript:;" id="protocol">《京东用户注册协议》</a> <a
								href="javascript:;" class="blue" id="privacyProtocolTrigger">《隐私政策》</a>


						</div>
						<div class="input-tip">
							<span></span>
						</div>
					</div>
					<div>
						<button type="submit" class="btn-register">立即注册</button>
					</div>

				</form>
			</div>
			<div id="form-company" class="reg-other" style="display: none">
				<div class="company-reg">
					<a href="../reg/company" target="_blank"
						clstag="pageclick|keycount|201612011|3"> <i class="i-company"></i>
						<span>企业用户注册</span>
					</a>
				</div>
				<div class="inter-cust">
					<a href="//reg.joybuy.com/reg/person.html" target="_blank"
						clstag="pageclick|keycount|201612011|4"> <i class="i-global"></i>
						<span>INTERNATIONAL<br />CUSTOMERS
					</span>
					</a>
				</div>
			</div>
		</div>
		<div id="privacyProtocol" style="display: none">
			<div class="protocol-con">

				<p class="MsoNormal" align="center"
					style="text-align: centerline-height:150%">
					<b> <span style="line-height: 150%;">隐私政策</span>
					</b> <span style="line-height: 150%;"></span>
				</p>

				<p class="MsoNormal" style="line-height: 150%">
					<span style="line-height: 150%;"> </span>
				</p>

				<p class="MsoNormal" style="line-height: 150%">
					<span style="line-height: 150%;">京东（以下或称“我们”）注重保护用户个人信息及个人隐私。本隐私政策解释了用户（“您”）个人信息收集（以下或称“信息”）和使用的有关情况，本隐私政策适用于京东向您提供的所有相关服务（包括但不限于电子商务、网络资讯、网络社交、互联网金融服务等，以下称“京东服务”或“服务”）。<b
						style="mso-bidi-font-weight: normal">如果您不同意本隐私政策的任何内容，您应立即停止使用京东服务。当您使用京东提供的任一服务时，即表示您已同意我们按照本隐私政策来合法使用和保护您的个人信息。</b><span></span></span>
				</p>

				<p class="MsoNormal" style="line-height: 150%">
					<span style="font-size: 12.0pt; line-height: 150%;"></span>
				</p>

				<p class="MsoNormal" style="line-height: 150%">
					<b><span style="line-height: 150%;">一、您个人信息的收集</span></b><span
						style="line-height: 150%;"></span>
				</p>

				<p class="MsoNormal" style="line-height: 150%">
					<span style="font-size: 12.0pt; line-height: 150%;"></span>
				</p>

				<p class="MsoNormal" style="line-height: 150%">
					<span style="line-height: 150%;">我们收集信息是为了向您提供更好以及更个性化的服务，并努力提高您的用户体验。我们收集信息的种类如下：<span></span></span>
				</p>

				<p class="MsoNormal" style="line-height: 150%">
					<b><span style="line-height: 150%;">1</span></b><b><span
						style="line-height: 150%;">、您向我们提供的信息</span></b><span
						style="line-height: 150%;"></span>
				</p>

				<p class="MsoNormal" style="line-height: 150%">
					<span style="line-height: 150%;">当您注册京东账户及您在使用相关京东服务时填写、提交及<span>/</span>或其他任何方式提供的信息，包括您的姓名、性别、出生年月日、身份证号码、护照姓、护照名、护照号码、电话号码、电子邮箱、收货地址、京东钱包或网银在线账号、银行卡信息及相关附加信息（如您地址中的所在的省份和城市、邮政编码等）。<b
						style="mso-bidi-font-weight: normal">您可以选择不提供某一或某些信息，但是这样可能使您无法使用京东的许多特色服务。</b>请您理解，我们使用您提供的信息是为了回应您的要求，为您在京东购物或享受服务提供便利，完善京东网站以及与您进行信息沟通。另外，我们可能会将您所提供的信息与您的京东账户关联，用以识别您的身份。<span></span></span>
				</p>

				<p class="MsoNormal" style="line-height: 150%">
					<b><span style="line-height: 150%;">2</span></b><b><span
						style="line-height: 150%;">、我们在您使用服务过程中获得的信息<span></span></span></b>
				</p>

				<p class="MsoNormal" style="line-height: 150%">
					<span style="line-height: 150%;">为了提高服务质量和用户体验，我们会留存您使用服务以及使用方式的相关信息，这类信息包括：<span></span></span>
				</p>

				<p class="MsoNormal" style="line-height: 150%">
					<b style="mso-bidi-font-weight: normal"><span
						style="line-height: 150%;">（<span>1</span>）您的浏览器和计算机上的信息。
					</span></b><span style="line-height: 150%;">在您访问京东网站或使用京东服务时，京东系统自动接收并记录的您的浏览器和计算机上的信息（包括但不限于您的<span>IP</span>地址、浏览器的类型、使用的语言、访问日期和时间、软硬件特征信息及您需求的网页记录等数据）。<span></span></span>
				</p>

				<p class="MsoNormal" style="line-height: 150%">
					<b style="mso-bidi-font-weight: normal"><span
						style="line-height: 150%;">（<span>2</span>）您的位置信息。
					</span></b><span style="line-height: 150%;">当您下载或使用京东、其关联方及合作伙伴开发的应用程序（例如京东<span>APP</span>），或访问移动网页使用京东服务时，京东可能会读取您的位置（大多数移动设备将允许您关闭定位服务，具体建议您联系您的移动设备的服务商或生产商）。<span></span></span>
				</p>

				<p class="MsoNormal" style="line-height: 150%">
					<span style="line-height: 150%;">（<span>1</span>）京东通过在京东网站上使用网络<span>beacon</span>，计算用户访问数量，并通过访问<span>
							cookie </span>辨认注册用户。 <span></span></span>
				</p>

				<p class="MsoNormal" style="line-height: 150%">
					<span style="line-height: 150%;">（<span>2</span>）京东通过得到的<span>cookie</span>信息，可以在京东网站提供个性化服务。<span></span></span>
				</p>

				<p class="MsoNormal" style="line-height: 150%">
					<span style="font-size: 12.0pt; line-height: 150%;"></span>
				</p>

				<p class="MsoNormal" style="line-height: 150%">
					<b><span style="line-height: 150%;">七、未成年人的个人信息保护</span></b><span
						style="line-height: 150%;"></span>
				</p>

				<p class="MsoNormal" style="line-height: 150%">
					<span style="font-size: 12.0pt; line-height: 150%;"></span>
				</p>

				<p class="MsoNormal" style="line-height: 150%">
					<span style="line-height: 150%;">京东非常重视对未成年人个人信息的保护。若您是<span>18</span>周岁以下的未成年人，在使用京东服务前，应事先取得您家长或法定监护人的书面同意。京东根据国家相关法律法规的规定保护未成年人的个人信息。<span></span></span>
				</p>

				<p class="MsoNormal" style="line-height: 150%">
					<span style="font-size: 12.0pt; line-height: 150%;"></span>
				</p>

				<p class="MsoNormal" style="line-height: 150%">
					<b style="mso-bidi-font-weight: normal"><span
						style="line-height: 150%;">八、通知和修订<span></span></span></b>
				</p>

				<p class="MsoNormal" style="line-height: 150%">
					<span style="font-size: 12.0pt; line-height: 150%;"></span>
				</p>

				<p class="MsoNormal" style="line-height: 150%">
					<span style="line-height: 150%;">为给你提供更好的服务，京东的业务将不时变化，本隐私政策也将随之调整。京东会通过在京东网站、移动端上发出更新版本并提醒您相关内容的更新，也请您访问京东以便及时了解最新的隐私政策。如果您对于本隐私政策或在使用京东服务时对于您的个人信息或隐私情况有任何问题，请联系京东客服并作充分描述，京东将尽力解决。</span>
				</p>
			</div>
			<div class="protocol-button">
				<button>同意并继续</button>
			</div>
		</div>
	</div>
	<div id="form-footer" class="footer w">
		<div class="links">
			<a rel="nofollow" target="_blank"
				href="//www.jd.com/intro/about.aspx"> 关于我们</a>| <a rel="nofollow"
				target="_blank" href="//www.jd.com/contact/">联系我们</a>| <a
				rel="nofollow" target="_blank" href="//zhaopin.jd.com/">人才招聘</a>| <a
				rel="nofollow" target="_blank"
				href="//www.jd.com/contact/joinin.aspx">商家入驻</a>| <a rel="nofollow"
				target="_blank" href="//www.jd.com/intro/service.aspx">广告服务</a>| <a
				rel="nofollow" target="_blank" href="//app.jd.com/">手机京东</a>| <a
				target="_blank" href="//club.jd.com/links.aspx">友情链接</a>| <a
				target="_blank" href="//media.jd.com">销售联盟</a>| <a
				href="//club.jd.com/" target="_blank">京东社区</a>| <a
				href="//gongyi.jd.com" target="_blank">京东公益</a>| <a target="_blank"
				href="//en.jd.com/" clstag="pageclick|keycount|20150112ABD|9">English
				Site</a>
		</div>
		<div class="copyright">
			Copyright&copy;2004-2016&nbsp;&nbsp;京东JD.com&nbsp;版权所有</div>
	</div>


<script type="text/javascript">
    var localmisc = $("#localmisc");
    debugger;
    if(0==localmisc.val()){
    	debugger;
        seajs.use('/js/register.1130', function (reg) {
        	debugger;
            reg.init();
        })
    }else{
    	debugger;
        seajs.use('//misc.360buyimg.com/user/reg/1.0.0/js/register.1130', function (reg) {
            reg.init();
        })
    }
</script>
<!-- <script type="text/javascript" src="//seq.jd.com/jseqf.html?bizId=JD_register_pc&platform=js&version=1"></script>
        <script src="//payrisk.jd.com/js/td.js"></script>
    <script type="text/javascript">
        $(function () {
            getJdEid(function (eid, fpid) {
                $("#eid").val(eid);
                $("#sessionId").val(fpid);
            });
        });
    </script> -->
    <a target="_blank" href="//surveys.jd.com/index.php?r=survey/index/sid/447941/lang/zh-Hans" class="feedback"
   style="margin-top: -85px; position: fixed; right: 0px; bottom: 50%;"></a>
</body>
</html>