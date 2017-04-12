package com.cs.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Shop implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer shopid;

    private String shopsn;

    private Integer userid;

    private Integer areaid1;

    private Integer areaid2;

    private Integer areaid3;

    private Integer goodscatid1;

    private Integer goodscatid2;

    private Integer goodscatid3;

    private Byte isself;

    private String shopname;

    private String shopcompany;

    private String shopimg;

    private String shoptel;

    private String shopaddress;

    private BigDecimal avgecostmoney;

    private BigDecimal deliverystartmoney;

    private BigDecimal deliverymoney;

    private BigDecimal deliveryfreemoney;

    private Integer deliverycosttime;

    private String deliverytime;

    private Byte deliverytype;

    private Integer bankid;

    private String bankno;

    private Byte isinvoice;

    private String invoiceremarks;

    private Float servicestarttime;

    private Float serviceendtime;

    private Byte shopstatus;

    private String statusremarks;

    private Byte shopative;

    private Byte shopflag;

    private Date createtime;

    private String latitude;

    private String longitude;

    private Integer maplevel;

    private String qqno;

    private String bankusername;

    private Byte isdistributall;

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public String getShopsn() {
        return shopsn;
    }

    public void setShopsn(String shopsn) {
        this.shopsn = shopsn;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getAreaid1() {
        return areaid1;
    }

    public void setAreaid1(Integer areaid1) {
        this.areaid1 = areaid1;
    }

    public Integer getAreaid2() {
        return areaid2;
    }

    public void setAreaid2(Integer areaid2) {
        this.areaid2 = areaid2;
    }

    public Integer getAreaid3() {
        return areaid3;
    }

    public void setAreaid3(Integer areaid3) {
        this.areaid3 = areaid3;
    }

    public Integer getGoodscatid1() {
        return goodscatid1;
    }

    public void setGoodscatid1(Integer goodscatid1) {
        this.goodscatid1 = goodscatid1;
    }

    public Integer getGoodscatid2() {
        return goodscatid2;
    }

    public void setGoodscatid2(Integer goodscatid2) {
        this.goodscatid2 = goodscatid2;
    }

    public Integer getGoodscatid3() {
        return goodscatid3;
    }

    public void setGoodscatid3(Integer goodscatid3) {
        this.goodscatid3 = goodscatid3;
    }

    public Byte getIsself() {
        return isself;
    }

    public void setIsself(Byte isself) {
        this.isself = isself;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public String getShopcompany() {
        return shopcompany;
    }

    public void setShopcompany(String shopcompany) {
        this.shopcompany = shopcompany;
    }

    public String getShopimg() {
        return shopimg;
    }

    public void setShopimg(String shopimg) {
        this.shopimg = shopimg;
    }

    public String getShoptel() {
        return shoptel;
    }

    public void setShoptel(String shoptel) {
        this.shoptel = shoptel;
    }

    public String getShopaddress() {
        return shopaddress;
    }

    public void setShopaddress(String shopaddress) {
        this.shopaddress = shopaddress;
    }

    public BigDecimal getAvgecostmoney() {
        return avgecostmoney;
    }

    public void setAvgecostmoney(BigDecimal avgecostmoney) {
        this.avgecostmoney = avgecostmoney;
    }

    public BigDecimal getDeliverystartmoney() {
        return deliverystartmoney;
    }

    public void setDeliverystartmoney(BigDecimal deliverystartmoney) {
        this.deliverystartmoney = deliverystartmoney;
    }

    public BigDecimal getDeliverymoney() {
        return deliverymoney;
    }

    public void setDeliverymoney(BigDecimal deliverymoney) {
        this.deliverymoney = deliverymoney;
    }

    public BigDecimal getDeliveryfreemoney() {
        return deliveryfreemoney;
    }

    public void setDeliveryfreemoney(BigDecimal deliveryfreemoney) {
        this.deliveryfreemoney = deliveryfreemoney;
    }

    public Integer getDeliverycosttime() {
        return deliverycosttime;
    }

    public void setDeliverycosttime(Integer deliverycosttime) {
        this.deliverycosttime = deliverycosttime;
    }

    public String getDeliverytime() {
        return deliverytime;
    }

    public void setDeliverytime(String deliverytime) {
        this.deliverytime = deliverytime;
    }

    public Byte getDeliverytype() {
        return deliverytype;
    }

    public void setDeliverytype(Byte deliverytype) {
        this.deliverytype = deliverytype;
    }

    public Integer getBankid() {
        return bankid;
    }

    public void setBankid(Integer bankid) {
        this.bankid = bankid;
    }

    public String getBankno() {
        return bankno;
    }

    public void setBankno(String bankno) {
        this.bankno = bankno;
    }

    public Byte getIsinvoice() {
        return isinvoice;
    }

    public void setIsinvoice(Byte isinvoice) {
        this.isinvoice = isinvoice;
    }

    public String getInvoiceremarks() {
        return invoiceremarks;
    }

    public void setInvoiceremarks(String invoiceremarks) {
        this.invoiceremarks = invoiceremarks;
    }

    public Float getServicestarttime() {
        return servicestarttime;
    }

    public void setServicestarttime(Float servicestarttime) {
        this.servicestarttime = servicestarttime;
    }

    public Float getServiceendtime() {
        return serviceendtime;
    }

    public void setServiceendtime(Float serviceendtime) {
        this.serviceendtime = serviceendtime;
    }

    public Byte getShopstatus() {
        return shopstatus;
    }

    public void setShopstatus(Byte shopstatus) {
        this.shopstatus = shopstatus;
    }

    public String getStatusremarks() {
        return statusremarks;
    }

    public void setStatusremarks(String statusremarks) {
        this.statusremarks = statusremarks;
    }

    public Byte getShopative() {
        return shopative;
    }

    public void setShopative(Byte shopative) {
        this.shopative = shopative;
    }

    public Byte getShopflag() {
        return shopflag;
    }

    public void setShopflag(Byte shopflag) {
        this.shopflag = shopflag;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Integer getMaplevel() {
        return maplevel;
    }

    public void setMaplevel(Integer maplevel) {
        this.maplevel = maplevel;
    }

    public String getQqno() {
        return qqno;
    }

    public void setQqno(String qqno) {
        this.qqno = qqno;
    }

    public String getBankusername() {
        return bankusername;
    }

    public void setBankusername(String bankusername) {
        this.bankusername = bankusername;
    }

    public Byte getIsdistributall() {
        return isdistributall;
    }

    public void setIsdistributall(Byte isdistributall) {
        this.isdistributall = isdistributall;
    }
}