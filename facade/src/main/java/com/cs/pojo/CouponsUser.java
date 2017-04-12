package com.cs.pojo;

import java.io.Serializable;
import java.util.Date;

public class CouponsUser implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer couponid;

    private Integer userid;

    private Date receivetime;

    private Byte couponstatus;

    private Byte dataflag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCouponid() {
        return couponid;
    }

    public void setCouponid(Integer couponid) {
        this.couponid = couponid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getReceivetime() {
        return receivetime;
    }

    public void setReceivetime(Date receivetime) {
        this.receivetime = receivetime;
    }

    public Byte getCouponstatus() {
        return couponstatus;
    }

    public void setCouponstatus(Byte couponstatus) {
        this.couponstatus = couponstatus;
    }

    public Byte getDataflag() {
        return dataflag;
    }

    public void setDataflag(Byte dataflag) {
        this.dataflag = dataflag;
    }
}