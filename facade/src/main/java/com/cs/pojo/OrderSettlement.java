package com.cs.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrderSettlement implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer settlementid;

    private String settlementno;

    private Byte settlementtype;

    private Integer shopid;

    private String accname;

    private String accno;

    private String accuser;

    private BigDecimal ordermoney;

    private BigDecimal settlementmoney;

    private BigDecimal poundagemoney;

    private BigDecimal totalcommission;

    private Date createtime;

    private Byte isfinish;

    private Date finishtime;

    private String remarks;

    public Integer getSettlementid() {
        return settlementid;
    }

    public void setSettlementid(Integer settlementid) {
        this.settlementid = settlementid;
    }

    public String getSettlementno() {
        return settlementno;
    }

    public void setSettlementno(String settlementno) {
        this.settlementno = settlementno;
    }

    public Byte getSettlementtype() {
        return settlementtype;
    }

    public void setSettlementtype(Byte settlementtype) {
        this.settlementtype = settlementtype;
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public String getAccname() {
        return accname;
    }

    public void setAccname(String accname) {
        this.accname = accname;
    }

    public String getAccno() {
        return accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    public String getAccuser() {
        return accuser;
    }

    public void setAccuser(String accuser) {
        this.accuser = accuser;
    }

    public BigDecimal getOrdermoney() {
        return ordermoney;
    }

    public void setOrdermoney(BigDecimal ordermoney) {
        this.ordermoney = ordermoney;
    }

    public BigDecimal getSettlementmoney() {
        return settlementmoney;
    }

    public void setSettlementmoney(BigDecimal settlementmoney) {
        this.settlementmoney = settlementmoney;
    }

    public BigDecimal getPoundagemoney() {
        return poundagemoney;
    }

    public void setPoundagemoney(BigDecimal poundagemoney) {
        this.poundagemoney = poundagemoney;
    }

    public BigDecimal getTotalcommission() {
        return totalcommission;
    }

    public void setTotalcommission(BigDecimal totalcommission) {
        this.totalcommission = totalcommission;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Byte getIsfinish() {
        return isfinish;
    }

    public void setIsfinish(Byte isfinish) {
        this.isfinish = isfinish;
    }

    public Date getFinishtime() {
        return finishtime;
    }

    public void setFinishtime(Date finishtime) {
        this.finishtime = finishtime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}