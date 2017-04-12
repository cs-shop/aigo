package com.cs.pojo;

import java.io.Serializable;
import java.util.Date;

public class UserScore implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer scoreid;

    private Integer userid;

    private Integer score;

    private Integer datasrc;

    private Integer dataid;

    private Integer scoretype;

    private Date createtime;

    private String dataremarks;

    public Integer getScoreid() {
        return scoreid;
    }

    public void setScoreid(Integer scoreid) {
        this.scoreid = scoreid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getDatasrc() {
        return datasrc;
    }

    public void setDatasrc(Integer datasrc) {
        this.datasrc = datasrc;
    }

    public Integer getDataid() {
        return dataid;
    }

    public void setDataid(Integer dataid) {
        this.dataid = dataid;
    }

    public Integer getScoretype() {
        return scoretype;
    }

    public void setScoretype(Integer scoretype) {
        this.scoretype = scoretype;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getDataremarks() {
        return dataremarks;
    }

    public void setDataremarks(String dataremarks) {
        this.dataremarks = dataremarks;
    }
}