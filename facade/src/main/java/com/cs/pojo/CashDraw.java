package com.cs.pojo;

import java.io.Serializable;
import java.util.Date;

public class CashDraw implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer cashid;

    private Byte targettype;

    private Integer targetid;

    private Float money;

    private Byte acctype;

    private String acctargetid;

    private String accno;

    private String accuser;

    private Byte cashsatus;

    private String cashremarks;

    private Date createtime;

    private Date handletime;

    private Integer cashconfigid;

    private Integer areaid2;

    public Integer getCashid() {
        return cashid;
    }

    public void setCashid(Integer cashid) {
        this.cashid = cashid;
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

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public Byte getAcctype() {
        return acctype;
    }

    public void setAcctype(Byte acctype) {
        this.acctype = acctype;
    }

    public String getAcctargetid() {
        return acctargetid;
    }

    public void setAcctargetid(String acctargetid) {
        this.acctargetid = acctargetid;
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

    public Byte getCashsatus() {
        return cashsatus;
    }

    public void setCashsatus(Byte cashsatus) {
        this.cashsatus = cashsatus;
    }

    public String getCashremarks() {
        return cashremarks;
    }

    public void setCashremarks(String cashremarks) {
        this.cashremarks = cashremarks;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getHandletime() {
        return handletime;
    }

    public void setHandletime(Date handletime) {
        this.handletime = handletime;
    }

    public Integer getCashconfigid() {
        return cashconfigid;
    }

    public void setCashconfigid(Integer cashconfigid) {
        this.cashconfigid = cashconfigid;
    }

    public Integer getAreaid2() {
        return areaid2;
    }

    public void setAreaid2(Integer areaid2) {
        this.areaid2 = areaid2;
    }
}