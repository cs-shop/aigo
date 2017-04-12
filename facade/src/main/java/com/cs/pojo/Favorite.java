package com.cs.pojo;

import java.io.Serializable;
import java.util.Date;

public class Favorite implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer favoriteid;

    private Integer userid;

    private Byte favoritetype;

    private Integer targetid;

    private Date createtime;

    public Integer getFavoriteid() {
        return favoriteid;
    }

    public void setFavoriteid(Integer favoriteid) {
        this.favoriteid = favoriteid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Byte getFavoritetype() {
        return favoritetype;
    }

    public void setFavoritetype(Byte favoritetype) {
        this.favoritetype = favoritetype;
    }

    public Integer getTargetid() {
        return targetid;
    }

    public void setTargetid(Integer targetid) {
        this.targetid = targetid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}