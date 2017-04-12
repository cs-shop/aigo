package com.cs.pojo;

import java.io.Serializable;
import java.util.Date;

public class Panics implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer panicid;

    private Integer shopid;

    private String panicname;

    private Date starttime;

    private Date endtime;

    private Date createtime;

    private Byte dataflag;

    private Byte panicstatus;

    private String panicdes;

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

    public String getPanicname() {
        return panicname;
    }

    public void setPanicname(String panicname) {
        this.panicname = panicname;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
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

    public Byte getPanicstatus() {
        return panicstatus;
    }

    public void setPanicstatus(Byte panicstatus) {
        this.panicstatus = panicstatus;
    }

    public String getPanicdes() {
        return panicdes;
    }

    public void setPanicdes(String panicdes) {
        this.panicdes = panicdes;
    }
}