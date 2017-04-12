package com.cs.pojo;

import java.io.Serializable;

public class GoodsGallery implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer goodsid;

    private Integer shopid;

    private String goodsimg;

    private String goodsthumbs;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public String getGoodsimg() {
        return goodsimg;
    }

    public void setGoodsimg(String goodsimg) {
        this.goodsimg = goodsimg;
    }

    public String getGoodsthumbs() {
        return goodsthumbs;
    }

    public void setGoodsthumbs(String goodsthumbs) {
        this.goodsthumbs = goodsthumbs;
    }
}