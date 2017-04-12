package com.cs.pojo;

import java.io.Serializable;

public class GoodsCatBrand implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer catid;

    private Integer brandid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCatid() {
        return catid;
    }

    public void setCatid(Integer catid) {
        this.catid = catid;
    }

    public Integer getBrandid() {
        return brandid;
    }

    public void setBrandid(Integer brandid) {
        this.brandid = brandid;
    }
}