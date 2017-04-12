package com.cs.pojo;

import java.io.Serializable;
import java.util.Date;

public class Group implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer groupid;

    private Integer shopid;

    private String groupname;

    private Date starttime;

    private Date endtime;

    private Date createtime;

    private Byte dataflag;

    private Byte groupstatus;

    private String groupdes;

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

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
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

    public Byte getGroupstatus() {
        return groupstatus;
    }

    public void setGroupstatus(Byte groupstatus) {
        this.groupstatus = groupstatus;
    }

    public String getGroupdes() {
        return groupdes;
    }

    public void setGroupdes(String groupdes) {
        this.groupdes = groupdes;
    }
}