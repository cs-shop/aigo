package com.cs.pojo;

import java.io.Serializable;

public class Community implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer communityid;

    private Integer areaid1;

    private Integer areaid2;

    private Integer areaid3;

    private Byte isshow;

    private Byte isservice;

    private String communityname;

    private Integer communitysort;

    private String communitykey;

    private Byte communityflag;

    private String latitude;

    private String longitude;

    private Integer maplevel;

    public Integer getCommunityid() {
        return communityid;
    }

    public void setCommunityid(Integer communityid) {
        this.communityid = communityid;
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

    public Integer getAreaid3() {
        return areaid3;
    }

    public void setAreaid3(Integer areaid3) {
        this.areaid3 = areaid3;
    }

    public Byte getIsshow() {
        return isshow;
    }

    public void setIsshow(Byte isshow) {
        this.isshow = isshow;
    }

    public Byte getIsservice() {
        return isservice;
    }

    public void setIsservice(Byte isservice) {
        this.isservice = isservice;
    }

    public String getCommunityname() {
        return communityname;
    }

    public void setCommunityname(String communityname) {
        this.communityname = communityname;
    }

    public Integer getCommunitysort() {
        return communitysort;
    }

    public void setCommunitysort(Integer communitysort) {
        this.communitysort = communitysort;
    }

    public String getCommunitykey() {
        return communitykey;
    }

    public void setCommunitykey(String communitykey) {
        this.communitykey = communitykey;
    }

    public Byte getCommunityflag() {
        return communityflag;
    }

    public void setCommunityflag(Byte communityflag) {
        this.communityflag = communityflag;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Integer getMaplevel() {
        return maplevel;
    }

    public void setMaplevel(Integer maplevel) {
        this.maplevel = maplevel;
    }
}