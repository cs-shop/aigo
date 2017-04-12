package com.cs.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PanicsGoods implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer panicid;

    private Integer shopid;

    private Integer goodsid;

    private BigDecimal panicmoney;

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

    public Integer getPanicid() {
        return panicid;
    }

    public void setPanicid(Integer panicid) {
        this.panicid = panicid;
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

    public BigDecimal getPanicmoney() {
        return panicmoney;
    }

    public void setPanicmoney(BigDecimal panicmoney) {
        this.panicmoney = panicmoney;
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