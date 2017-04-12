package com.cs.pojo;

import java.io.Serializable;

public class ShopConfigsWithBLOBs extends ShopConfigs implements Serializable {
    private static final long serialVersionUID = 1L;

    private String shopads;

    private String shopadsurl;

    public String getShopads() {
        return shopads;
    }

    public void setShopads(String shopads) {
        this.shopads = shopads;
    }

    public String getShopadsurl() {
        return shopadsurl;
    }

    public void setShopadsurl(String shopadsurl) {
        this.shopadsurl = shopadsurl;
    }
}