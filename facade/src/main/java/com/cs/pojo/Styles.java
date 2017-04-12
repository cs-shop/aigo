package com.cs.pojo;

import java.io.Serializable;

public class Styles implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String stylesys;

    private String stylename;

    private String styleauthor;

    private String styleshopsite;

    private Integer styleshopid;

    private String stylepath;

    private Byte isuse;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStylesys() {
        return stylesys;
    }

    public void setStylesys(String stylesys) {
        this.stylesys = stylesys;
    }

    public String getStylename() {
        return stylename;
    }

    public void setStylename(String stylename) {
        this.stylename = stylename;
    }

    public String getStyleauthor() {
        return styleauthor;
    }

    public void setStyleauthor(String styleauthor) {
        this.styleauthor = styleauthor;
    }

    public String getStyleshopsite() {
        return styleshopsite;
    }

    public void setStyleshopsite(String styleshopsite) {
        this.styleshopsite = styleshopsite;
    }

    public Integer getStyleshopid() {
        return styleshopid;
    }

    public void setStyleshopid(Integer styleshopid) {
        this.styleshopid = styleshopid;
    }

    public String getStylepath() {
        return stylepath;
    }

    public void setStylepath(String stylepath) {
        this.stylepath = stylepath;
    }

    public Byte getIsuse() {
        return isuse;
    }

    public void setIsuse(Byte isuse) {
        this.isuse = isuse;
    }
}