package com.cs.pojo;

import java.io.Serializable;
import java.util.Date;

public class Coupon implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer couponid;

    private Integer shopid;

    private String couponname;

    private Byte coupontype;

    private Integer couponmoney;

    private Integer spendmoney;

    private Integer sendnum;

    private Integer receivenum;

    private Date sendstarttime;

    private Date sendendtime;

    private Date validstarttime;

    private Date validendtime;

    private Date createtime;

    private Byte dataflag;

    private String coupondes;

    public Integer getCouponid() {
        return couponid;
    }

    public void setCouponid(Integer couponid) {
        this.couponid = couponid;
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public String getCouponname() {
        return couponname;
    }

    public void setCouponname(String couponname) {
        this.couponname = couponname;
    }

    public Byte getCoupontype() {
        return coupontype;
    }

    public void setCoupontype(Byte coupontype) {
        this.coupontype = coupontype;
    }

    public Integer getCouponmoney() {
        return couponmoney;
    }

    public void setCouponmoney(Integer couponmoney) {
        this.couponmoney = couponmoney;
    }

    public Integer getSpendmoney() {
        return spendmoney;
    }

    public void setSpendmoney(Integer spendmoney) {
        this.spendmoney = spendmoney;
    }

    public Integer getSendnum() {
        return sendnum;
    }

    public void setSendnum(Integer sendnum) {
        this.sendnum = sendnum;
    }

    public Integer getReceivenum() {
        return receivenum;
    }

    public void setReceivenum(Integer receivenum) {
        this.receivenum = receivenum;
    }

    public Date getSendstarttime() {
        return sendstarttime;
    }

    public void setSendstarttime(Date sendstarttime) {
        this.sendstarttime = sendstarttime;
    }

    public Date getSendendtime() {
        return sendendtime;
    }

    public void setSendendtime(Date sendendtime) {
        this.sendendtime = sendendtime;
    }

    public Date getValidstarttime() {
        return validstarttime;
    }

    public void setValidstarttime(Date validstarttime) {
        this.validstarttime = validstarttime;
    }

    public Date getValidendtime() {
        return validendtime;
    }

    public void setValidendtime(Date validendtime) {
        this.validendtime = validendtime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Byte getDataflag() {
        return dataflag;
    }

    public void setDataflag(Byte dataflag) {
        this.dataflag = dataflag;
    }

    public String getCoupondes() {
        return coupondes;
    }

    public void setCoupondes(String coupondes) {
        this.coupondes = coupondes;
    }
}