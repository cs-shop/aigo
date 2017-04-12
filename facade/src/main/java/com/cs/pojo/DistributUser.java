package com.cs.pojo;

import java.io.Serializable;
import java.util.Date;

public class DistributUser implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer distributid;

    private Integer userid;

    private Integer buyerid;

    private String ip;

    private Date createtime;

    public Integer getDistributid() {
        return distributid;
    }

    public void setDistributid(Integer distributid) {
        this.distributid = distributid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getBuyerid() {
        return buyerid;
    }

    public void setBuyerid(Integer buyerid) {
        this.buyerid = buyerid;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}