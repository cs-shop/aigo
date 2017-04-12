package com.cs.pojo;

import java.io.Serializable;
import java.util.Date;

public class LogOrder implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer logid;

    private Integer orderid;

    private String logcontent;

    private Integer loguserid;

    private Byte logtype;

    private Date logtime;

    public Integer getLogid() {
        return logid;
    }

    public void setLogid(Integer logid) {
        this.logid = logid;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getLogcontent() {
        return logcontent;
    }

    public void setLogcontent(String logcontent) {
        this.logcontent = logcontent;
    }

    public Integer getLoguserid() {
        return loguserid;
    }

    public void setLoguserid(Integer loguserid) {
        this.loguserid = loguserid;
    }

    public Byte getLogtype() {
        return logtype;
    }

    public void setLogtype(Byte logtype) {
        this.logtype = logtype;
    }

    public Date getLogtime() {
        return logtime;
    }

    public void setLogtime(Date logtime) {
        this.logtime = logtime;
    }
}