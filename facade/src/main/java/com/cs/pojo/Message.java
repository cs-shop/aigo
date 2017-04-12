package com.cs.pojo;

import java.io.Serializable;
import java.util.Date;

public class Message implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Byte msgtype;

    private Integer senduserid;

    private Integer receiveuserid;

    private Date createtime;

    private Byte msgstatus;

    private Byte msgflag;

    private String msgcontent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(Byte msgtype) {
        this.msgtype = msgtype;
    }

    public Integer getSenduserid() {
        return senduserid;
    }

    public void setSenduserid(Integer senduserid) {
        this.senduserid = senduserid;
    }

    public Integer getReceiveuserid() {
        return receiveuserid;
    }

    public void setReceiveuserid(Integer receiveuserid) {
        this.receiveuserid = receiveuserid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Byte getMsgstatus() {
        return msgstatus;
    }

    public void setMsgstatus(Byte msgstatus) {
        this.msgstatus = msgstatus;
    }

    public Byte getMsgflag() {
        return msgflag;
    }

    public void setMsgflag(Byte msgflag) {
        this.msgflag = msgflag;
    }

    public String getMsgcontent() {
        return msgcontent;
    }

    public void setMsgcontent(String msgcontent) {
        this.msgcontent = msgcontent;
    }
}