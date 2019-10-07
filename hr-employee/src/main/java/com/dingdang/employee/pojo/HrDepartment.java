package com.dingdang.employee.pojo;

public class HrDepartment {
    private Integer dtId;

    private String dtName;

    private String dtCreatetime;

    private String dtBz;

    private String dtEx;

    public Integer getDtId() {
        return dtId;
    }

    public void setDtId(Integer dtId) {
        this.dtId = dtId;
    }

    public String getDtName() {
        return dtName;
    }

    public void setDtName(String dtName) {
        this.dtName = dtName == null ? null : dtName.trim();
    }

    public String getDtCreatetime() {
        return dtCreatetime;
    }

    public void setDtCreatetime(String dtCreatetime) {
        this.dtCreatetime = dtCreatetime == null ? null : dtCreatetime.trim();
    }

    public String getDtBz() {
        return dtBz;
    }

    public void setDtBz(String dtBz) {
        this.dtBz = dtBz == null ? null : dtBz.trim();
    }

    public String getDtEx() {
        return dtEx;
    }

    public void setDtEx(String dtEx) {
        this.dtEx = dtEx == null ? null : dtEx.trim();
    }
}