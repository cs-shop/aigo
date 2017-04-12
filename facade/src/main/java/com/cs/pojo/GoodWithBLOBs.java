package com.cs.pojo;

import java.io.Serializable;

public class GoodWithBLOBs extends Good implements Serializable {
    private static final long serialVersionUID = 1L;

    private String goodsspec;

    private String goodsdesc;

    public String getGoodsspec() {
        return goodsspec;
    }

    public void setGoodsspec(String goodsspec) {
        this.goodsspec = goodsspec;
    }

    public String getGoodsdesc() {
        return goodsdesc;
    }

    public void setGoodsdesc(String goodsdesc) {
        this.goodsdesc = goodsdesc;
    }
}