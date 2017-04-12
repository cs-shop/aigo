package com.cs.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Good implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer goodsid;

    private String goodssn;

    private String goodsname;

    private String goodsimg;

    private String goodsthums;

    private Integer brandid;

    private Integer shopid;

    private BigDecimal marketprice;

    private BigDecimal shopprice;

    private Integer goodsstock;

    private Integer salecount;

    private Byte isbook;

    private Integer bookquantity;

    private Integer warnstock;

    private String goodsunit;

    private Byte issale;

    private Byte isbest;

    private Byte ishot;

    private Byte isrecomm;

    private Byte isnew;

    private Byte isadminbest;

    private Byte isadminrecom;

    private String recommdesc;

    private Integer goodscatid1;

    private Integer goodscatid2;

    private Integer goodscatid3;

    private Integer shopcatid1;

    private Integer shopcatid2;

    private Byte isshoprecomm;

    private Byte isindexrecomm;

    private Byte isactivityrecomm;

    private Byte isinnerrecomm;

    private Byte goodsstatus;

    private Date saletime;

    private Integer attrcatid;

    private String goodskeywords;

    private Byte goodsflag;

    private String statusremarks;

    private Date createtime;

    private Integer isdistribut;

    private Integer commission;

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getGoodssn() {
        return goodssn;
    }

    public void setGoodssn(String goodssn) {
        this.goodssn = goodssn;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public String getGoodsimg() {
        return goodsimg;
    }

    public void setGoodsimg(String goodsimg) {
        this.goodsimg = goodsimg;
    }

    public String getGoodsthums() {
        return goodsthums;
    }

    public void setGoodsthums(String goodsthums) {
        this.goodsthums = goodsthums;
    }

    public Integer getBrandid() {
        return brandid;
    }

    public void setBrandid(Integer brandid) {
        this.brandid = brandid;
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public BigDecimal getMarketprice() {
        return marketprice;
    }

    public void setMarketprice(BigDecimal marketprice) {
        this.marketprice = marketprice;
    }

    public BigDecimal getShopprice() {
        return shopprice;
    }

    public void setShopprice(BigDecimal shopprice) {
        this.shopprice = shopprice;
    }

    public Integer getGoodsstock() {
        return goodsstock;
    }

    public void setGoodsstock(Integer goodsstock) {
        this.goodsstock = goodsstock;
    }

    public Integer getSalecount() {
        return salecount;
    }

    public void setSalecount(Integer salecount) {
        this.salecount = salecount;
    }

    public Byte getIsbook() {
        return isbook;
    }

    public void setIsbook(Byte isbook) {
        this.isbook = isbook;
    }

    public Integer getBookquantity() {
        return bookquantity;
    }

    public void setBookquantity(Integer bookquantity) {
        this.bookquantity = bookquantity;
    }

    public Integer getWarnstock() {
        return warnstock;
    }

    public void setWarnstock(Integer warnstock) {
        this.warnstock = warnstock;
    }

    public String getGoodsunit() {
        return goodsunit;
    }

    public void setGoodsunit(String goodsunit) {
        this.goodsunit = goodsunit;
    }

    public Byte getIssale() {
        return issale;
    }

    public void setIssale(Byte issale) {
        this.issale = issale;
    }

    public Byte getIsbest() {
        return isbest;
    }

    public void setIsbest(Byte isbest) {
        this.isbest = isbest;
    }

    public Byte getIshot() {
        return ishot;
    }

    public void setIshot(Byte ishot) {
        this.ishot = ishot;
    }

    public Byte getIsrecomm() {
        return isrecomm;
    }

    public void setIsrecomm(Byte isrecomm) {
        this.isrecomm = isrecomm;
    }

    public Byte getIsnew() {
        return isnew;
    }

    public void setIsnew(Byte isnew) {
        this.isnew = isnew;
    }

    public Byte getIsadminbest() {
        return isadminbest;
    }

    public void setIsadminbest(Byte isadminbest) {
        this.isadminbest = isadminbest;
    }

    public Byte getIsadminrecom() {
        return isadminrecom;
    }

    public void setIsadminrecom(Byte isadminrecom) {
        this.isadminrecom = isadminrecom;
    }

    public String getRecommdesc() {
        return recommdesc;
    }

    public void setRecommdesc(String recommdesc) {
        this.recommdesc = recommdesc;
    }

    public Integer getGoodscatid1() {
        return goodscatid1;
    }

    public void setGoodscatid1(Integer goodscatid1) {
        this.goodscatid1 = goodscatid1;
    }

    public Integer getGoodscatid2() {
        return goodscatid2;
    }

    public void setGoodscatid2(Integer goodscatid2) {
        this.goodscatid2 = goodscatid2;
    }

    public Integer getGoodscatid3() {
        return goodscatid3;
    }

    public void setGoodscatid3(Integer goodscatid3) {
        this.goodscatid3 = goodscatid3;
    }

    public Integer getShopcatid1() {
        return shopcatid1;
    }

    public void setShopcatid1(Integer shopcatid1) {
        this.shopcatid1 = shopcatid1;
    }

    public Integer getShopcatid2() {
        return shopcatid2;
    }

    public void setShopcatid2(Integer shopcatid2) {
        this.shopcatid2 = shopcatid2;
    }

    public Byte getIsshoprecomm() {
        return isshoprecomm;
    }

    public void setIsshoprecomm(Byte isshoprecomm) {
        this.isshoprecomm = isshoprecomm;
    }

    public Byte getIsindexrecomm() {
        return isindexrecomm;
    }

    public void setIsindexrecomm(Byte isindexrecomm) {
        this.isindexrecomm = isindexrecomm;
    }

    public Byte getIsactivityrecomm() {
        return isactivityrecomm;
    }

    public void setIsactivityrecomm(Byte isactivityrecomm) {
        this.isactivityrecomm = isactivityrecomm;
    }

    public Byte getIsinnerrecomm() {
        return isinnerrecomm;
    }

    public void setIsinnerrecomm(Byte isinnerrecomm) {
        this.isinnerrecomm = isinnerrecomm;
    }

    public Byte getGoodsstatus() {
        return goodsstatus;
    }

    public void setGoodsstatus(Byte goodsstatus) {
        this.goodsstatus = goodsstatus;
    }

    public Date getSaletime() {
        return saletime;
    }

    public void setSaletime(Date saletime) {
        this.saletime = saletime;
    }

    public Integer getAttrcatid() {
        return attrcatid;
    }

    public void setAttrcatid(Integer attrcatid) {
        this.attrcatid = attrcatid;
    }

    public String getGoodskeywords() {
        return goodskeywords;
    }

    public void setGoodskeywords(String goodskeywords) {
        this.goodskeywords = goodskeywords;
    }

    public Byte getGoodsflag() {
        return goodsflag;
    }

    public void setGoodsflag(Byte goodsflag) {
        this.goodsflag = goodsflag;
    }

    public String getStatusremarks() {
        return statusremarks;
    }

    public void setStatusremarks(String statusremarks) {
        this.statusremarks = statusremarks;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getIsdistribut() {
        return isdistribut;
    }

    public void setIsdistribut(Integer isdistribut) {
        this.isdistribut = isdistribut;
    }

    public Integer getCommission() {
        return commission;
    }

    public void setCommission(Integer commission) {
        this.commission = commission;
    }
}