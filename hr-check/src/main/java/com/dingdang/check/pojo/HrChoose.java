package com.dingdang.check.pojo;

import java.sql.Time;
import java.util.Date;

public class HrChoose {
    private Integer coId;

    private Integer coIsornot;

    private String coWeek;

    private Time coOntime;

    private Time coOuttime;

    private Date coDate;

    private String coType;

    private String coBz;

    public Integer getCoId() {
        return coId;
    }

    public void setCoId(Integer coId) {
        this.coId = coId;
    }

    public Integer getCoIsornot() {
        return coIsornot;
    }

    public void setCoIsornot(Integer coIsornot) {
        this.coIsornot = coIsornot;
    }

    public String getCoWeek() {
        return coWeek;
    }

    public void setCoWeek(String coWeek) {
        this.coWeek = coWeek == null ? null : coWeek.trim();
    }

    public Date getCoOntime() {
        return coOntime;
    }

    public void setCoOntime(Time coOntime) {
        this.coOntime = coOntime;
    }

    public Time getCoOuttime() {
        return coOuttime;
    }

    public void setCoOuttime(Time coOuttime) {
        this.coOuttime = coOuttime;
    }

    public Date getCoDate() {
        return coDate;
    }

    public void setCoDate(Date coDate) {
        this.coDate = coDate;
    }

    public String getCoType() {
        return coType;
    }

    public void setCoType(String coType) {
        this.coType = coType == null ? null : coType.trim();
    }

    public String getCoBz() {
        return coBz;
    }

    public void setCoBz(String coBz) {
        this.coBz = coBz == null ? null : coBz.trim();
    }
}