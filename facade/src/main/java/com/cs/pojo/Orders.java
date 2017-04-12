package com.cs.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Orders implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer orderid;

    private String orderno;

    private Integer areaid1;

    private Integer areaid2;

    private Integer areaid3;

    private Integer shopid;

    private Byte orderstatus;

    private BigDecimal totalmoney;

    private BigDecimal delivermoney;

    private Byte paytype;

    private Integer payfrom;

    private Byte isself;

    private Byte ispay;

    private Byte delivertype;

    private Integer userid;

    private String username;

    private Integer communityid;

    private String useraddress;

    private String usertel;

    private String userphone;

    private String userpostcode;

    private Integer orderscore;

    private Byte isinvoice;

    private String invoiceclient;

    private String orderremarks;

    private Date requiretime;

    private Byte isappraises;

    private Date createtime;

    private Byte isclosed;

    private Byte isrefund;

    private String refundremark;

    private String orderunique;

    private Byte ordersrc;

    private Byte orderflag;

    private BigDecimal needpay;

    private String tradeno;

    private Integer settlementid;

    private BigDecimal realtotalmoney;

    private Float poundagerate;

    private BigDecimal poundagemoney;

    private Integer usescore;

    private BigDecimal scoremoney;

    private Date receivetime;

    private Date deliverytime;

    private Byte distributtype;

    private Integer distributorderrate;

    private Integer promoterrate;

    private Integer buyerrate;

    private BigDecimal totalcommission;

    private Integer couponmoney;

    private BigDecimal backmoney;

    private Byte refundsrcstatus;

    private Byte orderfrom;

    private Integer orderfromid;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno;
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

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public Byte getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(Byte orderstatus) {
        this.orderstatus = orderstatus;
    }

    public BigDecimal getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(BigDecimal totalmoney) {
        this.totalmoney = totalmoney;
    }

    public BigDecimal getDelivermoney() {
        return delivermoney;
    }

    public void setDelivermoney(BigDecimal delivermoney) {
        this.delivermoney = delivermoney;
    }

    public Byte getPaytype() {
        return paytype;
    }

    public void setPaytype(Byte paytype) {
        this.paytype = paytype;
    }

    public Integer getPayfrom() {
        return payfrom;
    }

    public void setPayfrom(Integer payfrom) {
        this.payfrom = payfrom;
    }

    public Byte getIsself() {
        return isself;
    }

    public void setIsself(Byte isself) {
        this.isself = isself;
    }

    public Byte getIspay() {
        return ispay;
    }

    public void setIspay(Byte ispay) {
        this.ispay = ispay;
    }

    public Byte getDelivertype() {
        return delivertype;
    }

    public void setDelivertype(Byte delivertype) {
        this.delivertype = delivertype;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getCommunityid() {
        return communityid;
    }

    public void setCommunityid(Integer communityid) {
        this.communityid = communityid;
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress;
    }

    public String getUsertel() {
        return usertel;
    }

    public void setUsertel(String usertel) {
        this.usertel = usertel;
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }

    public String getUserpostcode() {
        return userpostcode;
    }

    public void setUserpostcode(String userpostcode) {
        this.userpostcode = userpostcode;
    }

    public Integer getOrderscore() {
        return orderscore;
    }

    public void setOrderscore(Integer orderscore) {
        this.orderscore = orderscore;
    }

    public Byte getIsinvoice() {
        return isinvoice;
    }

    public void setIsinvoice(Byte isinvoice) {
        this.isinvoice = isinvoice;
    }

    public String getInvoiceclient() {
        return invoiceclient;
    }

    public void setInvoiceclient(String invoiceclient) {
        this.invoiceclient = invoiceclient;
    }

    public String getOrderremarks() {
        return orderremarks;
    }

    public void setOrderremarks(String orderremarks) {
        this.orderremarks = orderremarks;
    }

    public Date getRequiretime() {
        return requiretime;
    }

    public void setRequiretime(Date requiretime) {
        this.requiretime = requiretime;
    }

    public Byte getIsappraises() {
        return isappraises;
    }

    public void setIsappraises(Byte isappraises) {
        this.isappraises = isappraises;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Byte getIsclosed() {
        return isclosed;
    }

    public void setIsclosed(Byte isclosed) {
        this.isclosed = isclosed;
    }

    public Byte getIsrefund() {
        return isrefund;
    }

    public void setIsrefund(Byte isrefund) {
        this.isrefund = isrefund;
    }

    public String getRefundremark() {
        return refundremark;
    }

    public void setRefundremark(String refundremark) {
        this.refundremark = refundremark;
    }

    public String getOrderunique() {
        return orderunique;
    }

    public void setOrderunique(String orderunique) {
        this.orderunique = orderunique;
    }

    public Byte getOrdersrc() {
        return ordersrc;
    }

    public void setOrdersrc(Byte ordersrc) {
        this.ordersrc = ordersrc;
    }

    public Byte getOrderflag() {
        return orderflag;
    }

    public void setOrderflag(Byte orderflag) {
        this.orderflag = orderflag;
    }

    public BigDecimal getNeedpay() {
        return needpay;
    }

    public void setNeedpay(BigDecimal needpay) {
        this.needpay = needpay;
    }

    public String getTradeno() {
        return tradeno;
    }

    public void setTradeno(String tradeno) {
        this.tradeno = tradeno;
    }

    public Integer getSettlementid() {
        return settlementid;
    }

    public void setSettlementid(Integer settlementid) {
        this.settlementid = settlementid;
    }

    public BigDecimal getRealtotalmoney() {
        return realtotalmoney;
    }

    public void setRealtotalmoney(BigDecimal realtotalmoney) {
        this.realtotalmoney = realtotalmoney;
    }

    public Float getPoundagerate() {
        return poundagerate;
    }

    public void setPoundagerate(Float poundagerate) {
        this.poundagerate = poundagerate;
    }

    public BigDecimal getPoundagemoney() {
        return poundagemoney;
    }

    public void setPoundagemoney(BigDecimal poundagemoney) {
        this.poundagemoney = poundagemoney;
    }

    public Integer getUsescore() {
        return usescore;
    }

    public void setUsescore(Integer usescore) {
        this.usescore = usescore;
    }

    public BigDecimal getScoremoney() {
        return scoremoney;
    }

    public void setScoremoney(BigDecimal scoremoney) {
        this.scoremoney = scoremoney;
    }

    public Date getReceivetime() {
        return receivetime;
    }

    public void setReceivetime(Date receivetime) {
        this.receivetime = receivetime;
    }

    public Date getDeliverytime() {
        return deliverytime;
    }

    public void setDeliverytime(Date deliverytime) {
        this.deliverytime = deliverytime;
    }

    public Byte getDistributtype() {
        return distributtype;
    }

    public void setDistributtype(Byte distributtype) {
        this.distributtype = distributtype;
    }

    public Integer getDistributorderrate() {
        return distributorderrate;
    }

    public void setDistributorderrate(Integer distributorderrate) {
        this.distributorderrate = distributorderrate;
    }

    public Integer getPromoterrate() {
        return promoterrate;
    }

    public void setPromoterrate(Integer promoterrate) {
        this.promoterrate = promoterrate;
    }

    public Integer getBuyerrate() {
        return buyerrate;
    }

    public void setBuyerrate(Integer buyerrate) {
        this.buyerrate = buyerrate;
    }

    public BigDecimal getTotalcommission() {
        return totalcommission;
    }

    public void setTotalcommission(BigDecimal totalcommission) {
        this.totalcommission = totalcommission;
    }

    public Integer getCouponmoney() {
        return couponmoney;
    }

    public void setCouponmoney(Integer couponmoney) {
        this.couponmoney = couponmoney;
    }

    public BigDecimal getBackmoney() {
        return backmoney;
    }

    public void setBackmoney(BigDecimal backmoney) {
        this.backmoney = backmoney;
    }

    public Byte getRefundsrcstatus() {
        return refundsrcstatus;
    }

    public void setRefundsrcstatus(Byte refundsrcstatus) {
        this.refundsrcstatus = refundsrcstatus;
    }

    public Byte getOrderfrom() {
        return orderfrom;
    }

    public void setOrderfrom(Byte orderfrom) {
        this.orderfrom = orderfrom;
    }

    public Integer getOrderfromid() {
        return orderfromid;
    }

    public void setOrderfromid(Integer orderfromid) {
        this.orderfromid = orderfromid;
    }
}