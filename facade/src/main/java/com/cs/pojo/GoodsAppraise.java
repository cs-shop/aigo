package com.cs.pojo;

import java.io.Serializable;
import java.util.Date;

public class GoodsAppraise implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer shopid;

    private Integer orderid;

    private Integer goodsid;

    private Integer goodsattrid;

    private Integer userid;

    private Integer goodsscore;

    private Integer servicescore;

    private Integer timescore;

    private String appraisesannex;

    private Byte isshow;

    private Date createtime;

    private String content;

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

    public Integer getGoodsattrid() {
        return goodsattrid;
    }

    public void setGoodsattrid(Integer goodsattrid) {
        this.goodsattrid = goodsattrid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getGoodsscore() {
        return goodsscore;
    }

    public void setGoodsscore(Integer goodsscore) {
        this.goodsscore = goodsscore;
    }

    public Integer getServicescore() {
        return servicescore;
    }

    public void setServicescore(Integer servicescore) {
        this.servicescore = servicescore;
    }

    public Integer getTimescore() {
        return timescore;
    }

    public void setTimescore(Integer timescore) {
        this.timescore = timescore;
    }

    public String getAppraisesannex() {
        return appraisesannex;
    }

    public void setAppraisesannex(String appraisesannex) {
        this.appraisesannex = appraisesannex;
    }

    public Byte getIsshow() {
        return isshow;
    }

    public void setIsshow(Byte isshow) {
        this.isshow = isshow;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}