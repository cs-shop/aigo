package com.cs.pojo;

import java.io.Serializable;

public class Cart implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer cartid;

    private Integer userid;

    private Byte ischeck;

    private Integer goodsid;

    private Integer goodsattrid;

    private Integer goodscnt;

    private Integer packageid;

    private Long batchno;

    public Integer getCartid() {
        return cartid;
    }

    public void setCartid(Integer cartid) {
        this.cartid = cartid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Byte getIscheck() {
        return ischeck;
    }

    public void setIscheck(Byte ischeck) {
        this.ischeck = ischeck;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Integer getGoodsattrid() {
        return goodsattrid;
    }

    public void setGoodsattrid(Integer goodsattrid) {
        this.goodsattrid = goodsattrid;
    }

    public Integer getGoodscnt() {
        return goodscnt;
    }

    public void setGoodscnt(Integer goodscnt) {
        this.goodscnt = goodscnt;
    }

    public Integer getPackageid() {
        return packageid;
    }

    public void setPackageid(Integer packageid) {
        this.packageid = packageid;
    }

    public Long getBatchno() {
        return batchno;
    }

    public void setBatchno(Long batchno) {
        this.batchno = batchno;
    }
}