package com.cs.pojo;

import java.io.Serializable;
import java.util.Date;

public class OrderComplain implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer complainid;

    private Integer orderid;

    private Byte complaintype;

    private Integer complaintargetid;

    private Integer respondtargetid;

    private Byte needrespond;

    private Date deliverrespondtime;

    private String complainannex;

    private Byte complainstatus;

    private Date complaintime;

    private String respondannex;

    private Date respondtime;

    private Date finalresulttime;

    private Integer finalhandlestaffid;

    public Integer getComplainid() {
        return complainid;
    }

    public void setComplainid(Integer complainid) {
        this.complainid = complainid;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Byte getComplaintype() {
        return complaintype;
    }

    public void setComplaintype(Byte complaintype) {
        this.complaintype = complaintype;
    }

    public Integer getComplaintargetid() {
        return complaintargetid;
    }

    public void setComplaintargetid(Integer complaintargetid) {
        this.complaintargetid = complaintargetid;
    }

    public Integer getRespondtargetid() {
        return respondtargetid;
    }

    public void setRespondtargetid(Integer respondtargetid) {
        this.respondtargetid = respondtargetid;
    }

    public Byte getNeedrespond() {
        return needrespond;
    }

    public void setNeedrespond(Byte needrespond) {
        this.needrespond = needrespond;
    }

    public Date getDeliverrespondtime() {
        return deliverrespondtime;
    }

    public void setDeliverrespondtime(Date deliverrespondtime) {
        this.deliverrespondtime = deliverrespondtime;
    }

    public String getComplainannex() {
        return complainannex;
    }

    public void setComplainannex(String complainannex) {
        this.complainannex = complainannex;
    }

    public Byte getComplainstatus() {
        return complainstatus;
    }

    public void setComplainstatus(Byte complainstatus) {
        this.complainstatus = complainstatus;
    }

    public Date getComplaintime() {
        return complaintime;
    }

    public void setComplaintime(Date complaintime) {
        this.complaintime = complaintime;
    }

    public String getRespondannex() {
        return respondannex;
    }

    public void setRespondannex(String respondannex) {
        this.respondannex = respondannex;
    }

    public Date getRespondtime() {
        return respondtime;
    }

    public void setRespondtime(Date respondtime) {
        this.respondtime = respondtime;
    }

    public Date getFinalresulttime() {
        return finalresulttime;
    }

    public void setFinalresulttime(Date finalresulttime) {
        this.finalresulttime = finalresulttime;
    }

    public Integer getFinalhandlestaffid() {
        return finalhandlestaffid;
    }

    public void setFinalhandlestaffid(Integer finalhandlestaffid) {
        this.finalhandlestaffid = finalhandlestaffid;
    }
}