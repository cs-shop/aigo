package com.cs.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class LogSysMoney implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer moneyid;

    private Byte targettype;

    private Integer targetid;

    private Integer datasrc;

    private Integer dataid;

    private Byte moneytype;

    private BigDecimal money;

    private Date createtime;

    private Byte dataflag;

    private String moneyremark;

    public Integer getMoneyid() {
        return moneyid;
    }

    public void setMoneyid(Integer moneyid) {
        this.moneyid = moneyid;
    }

    public Byte getTargettype() {
        return targettype;
    }

    public void setTargettype(Byte targettype) {
        this.targettype = targettype;
    }

    public Integer getTargetid() {
        return targetid;
    }

    public void setTargetid(Integer targetid) {
        this.targetid = targetid;
    }

    public Integer getDatasrc() {
        return datasrc;
    }

    public void setDatasrc(Integer datasrc) {
        this.datasrc = datasrc;
    }

    public Integer getDataid() {
        return dataid;
    }

    public void setDataid(Integer dataid) {
        this.dataid = dataid;
    }

    public Byte getMoneytype() {
        return moneytype;
    }

    public void setMoneytype(Byte moneytype) {
        this.moneytype = moneytype;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
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

    public String getMoneyremark() {
        return moneyremark;
    }

    public void setMoneyremark(String moneyremark) {
        this.moneyremark = moneyremark;
    }
}