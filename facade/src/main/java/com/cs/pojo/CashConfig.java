package com.cs.pojo;

import java.io.Serializable;
import java.util.Date;

public class CashConfig implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer userid;

    private Byte acctype;

    private Integer acctargetid;

    private String accno;

    private String accuser;

    private Date createtime;

    private Byte dataflag;

    private Integer areaid2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Byte getAcctype() {
        return acctype;
    }

    public void setAcctype(Byte acctype) {
        this.acctype = acctype;
    }

    public Integer getAcctargetid() {
        return acctargetid;
    }

    public void setAcctargetid(Integer acctargetid) {
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

    public Integer getAreaid2() {
        return areaid2;
    }

    public void setAreaid2(Integer areaid2) {
        this.areaid2 = areaid2;
    }
}