package com.cs.pojo;

import java.io.Serializable;

public class SysConfigs implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 自增ID
     */
    private Integer configid;

    /**
     * 所属类别ID
     */
    private Integer parentid;

    /**
     * 字段名称
     */
    private String fieldname;

    /**
     * 字段代码
     */
    private String fieldcode;

    /**
     * 字段类型
     */
    private String fieldtype;

    /**
     * 范围值名称
     */
    private String valuerangetxt;

    /**
     * 范围值
     */
    private String valuerange;

    /**
     * 字段提示
     */
    private String fieldtips;

    /**
     * 字段排序
     */
    private Integer fieldsort;

    private String fieldvalue;

    /**
     * @return 自增ID
     */
    public Integer getConfigid() {
        return configid;
    }

    /**
     * @param configid 
	 *            自增ID
     */
    public void setConfigid(Integer configid) {
        this.configid = configid;
    }

    /**
     * @return 所属类别ID
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     * @param parentid 
	 *            所属类别ID
     */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    /**
     * @return 字段名称
     */
    public String getFieldname() {
        return fieldname;
    }

    /**
     * @param fieldname 
	 *            字段名称
     */
    public void setFieldname(String fieldname) {
        this.fieldname = fieldname;
    }

    /**
     * @return 字段代码
     */
    public String getFieldcode() {
        return fieldcode;
    }

    /**
     * @param fieldcode 
	 *            字段代码
     */
    public void setFieldcode(String fieldcode) {
        this.fieldcode = fieldcode;
    }

    /**
     * @return 字段类型
     */
    public String getFieldtype() {
        return fieldtype;
    }

    /**
     * @param fieldtype 
	 *            字段类型
     */
    public void setFieldtype(String fieldtype) {
        this.fieldtype = fieldtype;
    }

    /**
     * @return 范围值名称
     */
    public String getValuerangetxt() {
        return valuerangetxt;
    }

    /**
     * @param valuerangetxt 
	 *            范围值名称
     */
    public void setValuerangetxt(String valuerangetxt) {
        this.valuerangetxt = valuerangetxt;
    }

    /**
     * @return 范围值
     */
    public String getValuerange() {
        return valuerange;
    }

    /**
     * @param valuerange 
	 *            范围值
     */
    public void setValuerange(String valuerange) {
        this.valuerange = valuerange;
    }

    /**
     * @return 字段提示
     */
    public String getFieldtips() {
        return fieldtips;
    }

    /**
     * @param fieldtips 
	 *            字段提示
     */
    public void setFieldtips(String fieldtips) {
        this.fieldtips = fieldtips;
    }

    /**
     * @return 字段排序
     */
    public Integer getFieldsort() {
        return fieldsort;
    }

    /**
     * @param fieldsort 
	 *            字段排序
     */
    public void setFieldsort(Integer fieldsort) {
        this.fieldsort = fieldsort;
    }

    public String getFieldvalue() {
        return fieldvalue;
    }

    public void setFieldvalue(String fieldvalue) {
        this.fieldvalue = fieldvalue;
    }
}