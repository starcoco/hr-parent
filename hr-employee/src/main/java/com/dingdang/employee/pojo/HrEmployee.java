package com.dingdang.employee.pojo;

public class HrEmployee {
    private HrBaseinfo embase;

    private Integer emId;

    private String emAccout;

    private String emStartime;

    private HrDepartment emDept;

    private Integer emDeptmentId;

    private String emTypework;

    private Integer emCreateid;

    private String emImg;

    private String emMark;

    public String getEmMark() {
        return emMark;
    }

    public void setEmMark(String emMark) {
        this.emMark = emMark;
    }

    public String getEmImg() {
        return emImg;
    }

    public void setEmImg(String emImg) {
        this.emImg = emImg;
    }

    public HrDepartment getEmDept() {
        return emDept;
    }

    public void setEmDept(HrDepartment emDept) {
        this.emDept = emDept;
    }

    public HrBaseinfo getEmbase() {
        return embase;
    }

    public void setEmbase(HrBaseinfo embase) {
        this.embase = embase;
    }

    public Integer getEmId() {
        return emId;
    }

    public void setEmId(Integer emId) {
        this.emId = emId;
    }

    public String getEmAccout() {
        return emAccout;
    }

    public void setEmAccout(String emAccout) {
        this.emAccout = emAccout == null ? null : emAccout.trim();
    }

    public String getEmStartime() {
        return emStartime;
    }

    public void setEmStartime(String emStartime) {
        this.emStartime = emStartime == null ? null : emStartime.trim();
    }

    public Integer getEmDeptmentId() {
        return emDeptmentId;
    }

    public void setEmDeptmentId(Integer emDeptmentId) {
        this.emDeptmentId = emDeptmentId;
    }

    public String getEmTypework() {
        return emTypework;
    }

    public void setEmTypework(String emTypework) {
        this.emTypework = emTypework == null ? null : emTypework.trim();
    }

    public Integer getEmCreateid() {
        return emCreateid;
    }

    public void setEmCreateid(Integer emCreateid) {
        this.emCreateid = emCreateid;
    }
}