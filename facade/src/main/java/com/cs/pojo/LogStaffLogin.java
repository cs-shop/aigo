package com.cs.pojo;

import java.io.Serializable;
import java.util.Date;

public class LogStaffLogin implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer loginid;

    private Integer staffid;

    private Date logintime;

    private String loginip;

    public Integer getLoginid() {
        return loginid;
    }

    public void setLoginid(Integer loginid) {
        this.loginid = loginid;
    }

    public Integer getStaffid() {
        return staffid;
    }

    public void setStaffid(Integer staffid) {
        this.staffid = staffid;
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    public String getLoginip() {
        return loginip;
    }

    public void setLoginip(String loginip) {
        this.loginip = loginip;
    }
}