package com.cs.pojo;

import java.io.Serializable;

public class GoodsPackage implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer packageid;

    private Integer goodsid;

    private Integer diffprice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPackageid() {
        return packageid;
    }

    public void setPackageid(Integer packageid) {
        this.packageid = packageid;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Integer getDiffprice() {
        return diffprice;
    }

    public void setDiffprice(Integer diffprice) {
        this.diffprice = diffprice;
    }
}