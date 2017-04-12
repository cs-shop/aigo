package com.cs.pojo;

import java.io.Serializable;

public class GoodsScore implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer scoreid;

    private Integer goodsid;

    private Integer shopid;

    private Integer totalscore;

    private Integer totalusers;

    private Integer goodsscore;

    private Integer goodsusers;

    private Integer servicescore;

    private Integer serviceusers;

    private Integer timescore;

    private Integer timeusers;

    public Integer getScoreid() {
        return scoreid;
    }

    public void setScoreid(Integer scoreid) {
        this.scoreid = scoreid;
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

    public Integer getTotalscore() {
        return totalscore;
    }

    public void setTotalscore(Integer totalscore) {
        this.totalscore = totalscore;
    }

    public Integer getTotalusers() {
        return totalusers;
    }

    public void setTotalusers(Integer totalusers) {
        this.totalusers = totalusers;
    }

    public Integer getGoodsscore() {
        return goodsscore;
    }

    public void setGoodsscore(Integer goodsscore) {
        this.goodsscore = goodsscore;
    }

    public Integer getGoodsusers() {
        return goodsusers;
    }

    public void setGoodsusers(Integer goodsusers) {
        this.goodsusers = goodsusers;
    }

    public Integer getServicescore() {
        return servicescore;
    }

    public void setServicescore(Integer servicescore) {
        this.servicescore = servicescore;
    }

    public Integer getServiceusers() {
        return serviceusers;
    }

    public void setServiceusers(Integer serviceusers) {
        this.serviceusers = serviceusers;
    }

    public Integer getTimescore() {
        return timescore;
    }

    public void setTimescore(Integer timescore) {
        this.timescore = timescore;
    }

    public Integer getTimeusers() {
        return timeusers;
    }

    public void setTimeusers(Integer timeusers) {
        this.timeusers = timeusers;
    }
}