package com.cs.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class GoodsAttribute implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer shopid;

    private Integer goodsid;

    private Integer attrid;

    private BigDecimal attrprice;

    private Integer attrstock;

    private Byte isrecomm;

    private String attrval;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Integer getAttrid() {
        return attrid;
    }

    public void setAttrid(Integer attrid) {
        this.attrid = attrid;
    }

    public BigDecimal getAttrprice() {
        return attrprice;
    }

    public void setAttrprice(BigDecimal attrprice) {
        this.attrprice = attrprice;
    }

    public Integer getAttrstock() {
        return attrstock;
    }

    public void setAttrstock(Integer attrstock) {
        this.attrstock = attrstock;
    }

    public Byte getIsrecomm() {
        return isrecomm;
    }

    public void setIsrecomm(Byte isrecomm) {
        this.isrecomm = isrecomm;
    }

    public String getAttrval() {
        return attrval;
    }

    public void setAttrval(String attrval) {
        this.attrval = attrval;
    }
}