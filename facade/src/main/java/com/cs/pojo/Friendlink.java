package com.cs.pojo;

import java.io.Serializable;

public class Friendlink implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer friendlinkid;

    private String friendlinkico;

    private String friendlinkname;

    private String friendlinkurl;

    private Integer friendlinksort;

    public Integer getFriendlinkid() {
        return friendlinkid;
    }

    public void setFriendlinkid(Integer friendlinkid) {
        this.friendlinkid = friendlinkid;
    }

    public String getFriendlinkico() {
        return friendlinkico;
    }

    public void setFriendlinkico(String friendlinkico) {
        this.friendlinkico = friendlinkico;
    }

    public String getFriendlinkname() {
        return friendlinkname;
    }

    public void setFriendlinkname(String friendlinkname) {
        this.friendlinkname = friendlinkname;
    }

    public String getFriendlinkurl() {
        return friendlinkurl;
    }

    public void setFriendlinkurl(String friendlinkurl) {
        this.friendlinkurl = friendlinkurl;
    }

    public Integer getFriendlinksort() {
        return friendlinksort;
    }

    public void setFriendlinksort(Integer friendlinksort) {
        this.friendlinksort = friendlinksort;
    }
}