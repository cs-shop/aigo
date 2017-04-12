package com.cs.pojo;

import java.io.Serializable;

public class ShopsCommunitys implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer shopid;

    private Integer areaid1;

    private Integer areaid2;

    private Integer areaid3;

    private Integer communityid;

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

    public Integer getCommunityid() {
        return communityid;
    }

    public void setCommunityid(Integer communityid) {
        this.communityid = communityid;
    }
}