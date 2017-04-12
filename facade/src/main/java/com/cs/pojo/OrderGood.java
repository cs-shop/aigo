package com.cs.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class OrderGood implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer orderid;

    private Integer goodsid;

    private Integer goodsnums;

    private BigDecimal goodsprice;

    private Integer goodsattrid;

    private String goodsattrname;

    private String goodsname;

    private String goodsthums;

    private Integer commission;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Integer getGoodsnums() {
        return goodsnums;
    }

    public void setGoodsnums(Integer goodsnums) {
        this.goodsnums = goodsnums;
    }

    public BigDecimal getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(BigDecimal goodsprice) {
        this.goodsprice = goodsprice;
    }

    public Integer getGoodsattrid() {
        return goodsattrid;
    }

    public void setGoodsattrid(Integer goodsattrid) {
        this.goodsattrid = goodsattrid;
    }

    public String getGoodsattrname() {
        return goodsattrname;
    }

    public void setGoodsattrname(String goodsattrname) {
        this.goodsattrname = goodsattrname;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public String getGoodsthums() {
        return goodsthums;
    }

    public void setGoodsthums(String goodsthums) {
        this.goodsthums = goodsthums;
    }

    public Integer getCommission() {
        return commission;
    }

    public void setCommission(Integer commission) {
        this.commission = commission;
    }
}