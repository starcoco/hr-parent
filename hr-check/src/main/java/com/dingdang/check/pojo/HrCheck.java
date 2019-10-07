package com.dingdang.check.pojo;

import java.sql.Time;
import java.util.Date;

public class HrCheck {
    private Integer chId;

    private String chDate;

    private String chEmAccount;

    private Time chIntime;

    private Time chOuttime;

    private String chIscheck;

    private String chDz;

    public Integer getChId() {
        return chId;
    }

    public void setChId(Integer chId) {
        this.chId = chId;
    }

    public String getChDate() {
        return chDate;
    }

    public void setChDate(String chDate) {
        this.chDate = chDate == null ? null : chDate.trim();
    }

    public String getChEmAccount() {
        return chEmAccount;
    }

    public void setChEmAccount(String chEmAccount) {
        this.chEmAccount = chEmAccount == null ? null : chEmAccount.trim();
    }

    public Time getChIntime() {
        return chIntime;
    }

    public void setChIntime(Time chIntime) {
        this.chIntime = chIntime;
    }

    public Time getChOuttime() {
        return chOuttime;
    }

    public void setChOuttime(Time chOuttime) {
        this.chOuttime = chOuttime;
    }

    public String getChIscheck() {
        return chIscheck;
    }

    public void setChIscheck(String chIscheck) {
        this.chIscheck = chIscheck == null ? null : chIscheck.trim();
    }

    public String getChDz() {
        return chDz;
    }

    public void setChDz(String chDz) {
        this.chDz = chDz == null ? null : chDz.trim();
    }
}