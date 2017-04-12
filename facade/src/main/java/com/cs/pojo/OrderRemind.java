package com.cs.pojo;

import java.io.Serializable;
import java.util.Date;

public class OrderRemind implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer remindid;

    private Integer orderid;

    private Integer userid;

    private Integer shopid;

    private Byte remindtype;

    private Byte usertype;

    private Date createtime;

    public Integer getRemindid() {
        return remindid;
    }

    public void setRemindid(Integer remindid) {
        this.remindid = remindid;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public Byte getRemindtype() {
        return remindtype;
    }

    public void setRemindtype(Byte remindtype) {
        this.remindtype = remindtype;
    }

    public Byte getUsertype() {
        return usertype;
    }

    public void setUsertype(Byte usertype) {
        this.usertype = usertype;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}