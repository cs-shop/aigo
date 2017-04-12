package com.cs.pojo;

import java.io.Serializable;

public class ShopConfigs implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer configid;

    private Integer shopid;

    private String shoptitle;

    private String shopkeywords;

    private String shopdesc;

    private String shopbanner;

    private Byte isdistribut;

    private Byte distributtype;

    private Integer distributorderrate;

    private Integer promoterrate;

    private Integer buyerrate;

    public Integer getConfigid() {
        return configid;
    }

    public void setConfigid(Integer configid) {
        this.configid = configid;
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public String getShoptitle() {
        return shoptitle;
    }

    public void setShoptitle(String shoptitle) {
        this.shoptitle = shoptitle;
    }

    public String getShopkeywords() {
        return shopkeywords;
    }

    public void setShopkeywords(String shopkeywords) {
        this.shopkeywords = shopkeywords;
    }

    public String getShopdesc() {
        return shopdesc;
    }

    public void setShopdesc(String shopdesc) {
        this.shopdesc = shopdesc;
    }

    public String getShopbanner() {
        return shopbanner;
    }

    public void setShopbanner(String shopbanner) {
        this.shopbanner = shopbanner;
    }

    public Byte getIsdistribut() {
        return isdistribut;
    }

    public void setIsdistribut(Byte isdistribut) {
        this.isdistribut = isdistribut;
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
}