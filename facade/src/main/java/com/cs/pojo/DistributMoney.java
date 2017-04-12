package com.cs.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DistributMoney implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer moneyid;

    private Integer shopid;

    private Integer orderid;

    private Integer userid;

    private Integer promoterid;

    private Integer buyerid;

    private String moneyremark;

    private Byte distributtype;

    private Integer dataid;

    private BigDecimal money;

    private BigDecimal distributmoney;

    private Date createtime;

    public Integer getMoneyid() {
        return moneyid;
    }

    public void setMoneyid(Integer moneyid) {
        this.moneyid = moneyid;
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

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getPromoterid() {
        return promoterid;
    }

    public void setPromoterid(Integer promoterid) {
        this.promoterid = promoterid;
    }

    public Integer getBuyerid() {
        return buyerid;
    }

    public void setBuyerid(Integer buyerid) {
        this.buyerid = buyerid;
    }

    public String getMoneyremark() {
        return moneyremark;
    }

    public void setMoneyremark(String moneyremark) {
        this.moneyremark = moneyremark;
    }

    public Byte getDistributtype() {
        return distributtype;
    }

    public void setDistributtype(Byte distributtype) {
        this.distributtype = distributtype;
    }

    public Integer getDataid() {
        return dataid;
    }

    public void setDataid(Integer dataid) {
        this.dataid = dataid;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getDistributmoney() {
        return distributmoney;
    }

    public void setDistributmoney(BigDecimal distributmoney) {
        this.distributmoney = distributmoney;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}