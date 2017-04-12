package com.cs.pojo;

import java.io.Serializable;

public class GoodsRelated implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer goodsid;

    private Integer relatedgoodsid;

    private Byte relatedtype;

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

    public Integer getRelatedgoodsid() {
        return relatedgoodsid;
    }

    public void setRelatedgoodsid(Integer relatedgoodsid) {
        this.relatedgoodsid = relatedgoodsid;
    }

    public Byte getRelatedtype() {
        return relatedtype;
    }

    public void setRelatedtype(Byte relatedtype) {
        this.relatedtype = relatedtype;
    }
}