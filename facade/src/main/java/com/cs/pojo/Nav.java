package com.cs.pojo;

import java.io.Serializable;
import java.util.Date;

public class Nav implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Byte navtype;

    private Integer areaid1;

    private Integer areaid2;

    private String navtitle;

    private String navurl;

    private Byte isshow;

    private Byte isopen;

    private Integer navsort;

    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getNavtype() {
        return navtype;
    }

    public void setNavtype(Byte navtype) {
        this.navtype = navtype;
    }

    public Integer getAreaid1() {
        return areaid1;
    }

    public void setAreaid1(Integer areaid1) {
        this.areaid1 = areaid1;
    }

    public Integer getAreaid2() {
        return areaid2;
    }

    public void setAreaid2(Integer areaid2) {
        this.areaid2 = areaid2;
    }

    public String getNavtitle() {
        return navtitle;
    }

    public void setNavtitle(String navtitle) {
        this.navtitle = navtitle;
    }

    public String getNavurl() {
        return navurl;
    }

    public void setNavurl(String navurl) {
        this.navurl = navurl;
    }

    public Byte getIsshow() {
        return isshow;
    }

    public void setIsshow(Byte isshow) {
        this.isshow = isshow;
    }

    public Byte getIsopen() {
        return isopen;
    }

    public void setIsopen(Byte isopen) {
        this.isopen = isopen;
    }

    public Integer getNavsort() {
        return navsort;
    }

    public void setNavsort(Integer navsort) {
        this.navsort = navsort;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}