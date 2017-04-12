package com.cs.pojo;

import java.io.Serializable;
import java.util.Date;

public class Roles implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer roleid;

    private String rolename;

    private Date createtime;

    private Byte roleflag;

    private String grant;

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Byte getRoleflag() {
        return roleflag;
    }

    public void setRoleflag(Byte roleflag) {
        this.roleflag = roleflag;
    }

    public String getGrant() {
        return grant;
    }

    public void setGrant(String grant) {
        this.grant = grant;
    }
}