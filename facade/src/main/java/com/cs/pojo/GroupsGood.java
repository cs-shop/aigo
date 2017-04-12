package com.cs.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class GroupsGood implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer groupid;

    private Integer shopid;

    private Integer goodsid;

    private BigDecimal groupmoney;

    private Integer goodsstock;

    private Integer virtualbuycnt;

    private Integer salecnt;

    private Byte goodsstatus;

    private Date createtime;

    private Byte dataflag;

    private Integer sortno;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public BigDecimal getGroupmoney() {
        return groupmoney;
    }

    public void setGroupmoney(BigDecimal groupmoney) {
        this.groupmoney = groupmoney;
    }

    public Integer getGoodsstock() {
        return goodsstock;
    }

    public void setGoodsstock(Integer goodsstock) {
        this.goodsstock = goodsstock;
    }

    public Integer getVirtualbuycnt() {
        return virtualbuycnt;
    }

    public void setVirtualbuycnt(Integer virtualbuycnt) {
        this.virtualbuycnt = virtualbuycnt;
    }

    public Integer getSalecnt() {
        return salecnt;
    }

    public void setSalecnt(Integer salecnt) {
        this.salecnt = salecnt;
    }

    public Byte getGoodsstatus() {
        return goodsstatus;
    }

    public void setGoodsstatus(Byte goodsstatus) {
        this.goodsstatus = goodsstatus;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Byte getDataflag() {
        return dataflag;
    }

    public void setDataflag(Byte dataflag) {
        this.dataflag = dataflag;
    }

    public Integer getSortno() {
        return sortno;
    }

    public void setSortno(Integer sortno) {
        this.sortno = sortno;
    }
}