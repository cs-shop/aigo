package com.cs.pojo;

import java.io.Serializable;
import java.util.Date;

public class UserRanks implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer rankid;

    private String rankname;

    private Integer startscore;

    private Integer endscore;

    private Integer rebate;

    private Date createtime;

    public Integer getRankid() {
        return rankid;
    }

    public void setRankid(Integer rankid) {
        this.rankid = rankid;
    }

    public String getRankname() {
        return rankname;
    }

    public void setRankname(String rankname) {
        this.rankname = rankname;
    }

    public Integer getStartscore() {
        return startscore;
    }

    public void setStartscore(Integer startscore) {
        this.startscore = startscore;
    }

    public Integer getEndscore() {
        return endscore;
    }

    public void setEndscore(Integer endscore) {
        this.endscore = endscore;
    }

    public Integer getRebate() {
        return rebate;
    }

    public void setRebate(Integer rebate) {
        this.rebate = rebate;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}