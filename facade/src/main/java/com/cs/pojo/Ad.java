package com.cs.pojo;

import java.io.Serializable;
import java.util.Date;

public class Ad implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer adid;

    private Integer adpositionid;

    private Integer areaid1;

    private Integer areaid2;

    private Byte adtype;

    private String adfile;

    private String adname;

    private String adurl;

    private Date adstartdate;

    private Date adenddate;

    private Integer adsort;

    private Integer adclicknum;

    private Byte positiontype;

    private Integer areaid3;

    private Integer communityid;

    public Integer getAdid() {
        return adid;
    }

    public void setAdid(Integer adid) {
        this.adid = adid;
    }

    public Integer getAdpositionid() {
        return adpositionid;
    }

    public void setAdpositionid(Integer adpositionid) {
        this.adpositionid = adpositionid;
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

    public Byte getAdtype() {
        return adtype;
    }

    public void setAdtype(Byte adtype) {
        this.adtype = adtype;
    }

    public String getAdfile() {
        return adfile;
    }

    public void setAdfile(String adfile) {
        this.adfile = adfile;
    }

    public String getAdname() {
        return adname;
    }

    public void setAdname(String adname) {
        this.adname = adname;
    }

    public String getAdurl() {
        return adurl;
    }

    public void setAdurl(String adurl) {
        this.adurl = adurl;
    }

    public Date getAdstartdate() {
        return adstartdate;
    }

    public void setAdstartdate(Date adstartdate) {
        this.adstartdate = adstartdate;
    }

    public Date getAdenddate() {
        return adenddate;
    }

    public void setAdenddate(Date adenddate) {
        this.adenddate = adenddate;
    }

    public Integer getAdsort() {
        return adsort;
    }

    public void setAdsort(Integer adsort) {
        this.adsort = adsort;
    }

    public Integer getAdclicknum() {
        return adclicknum;
    }

    public void setAdclicknum(Integer adclicknum) {
        this.adclicknum = adclicknum;
    }

    public Byte getPositiontype() {
        return positiontype;
    }

    public void setPositiontype(Byte positiontype) {
        this.positiontype = positiontype;
    }

    public Integer getAreaid3() {
        return areaid3;
    }

    public void setAreaid3(Integer areaid3) {
        this.areaid3 = areaid3;
    }

    public Integer getCommunityid() {
        return communityid;
    }

    public void setCommunityid(Integer communityid) {
        this.communityid = communityid;
    }
}