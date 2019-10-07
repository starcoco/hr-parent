package com.dingdang.check.pojo;

public class HrChsum {
    private Integer sId;

    private String sAccount;

    private String sName;

    private Integer sDeptId;

    private Integer sDate;

    private Integer sTruedate;

    private Integer sChidao;

    private Integer sZaotui;

    private Float sKuang;

    private Float sQing;

    private Integer sBu;

    private String sBz;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsAccount() {
        return sAccount;
    }

    public void setsAccount(String sAccount) {
        this.sAccount = sAccount == null ? null : sAccount.trim();
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public Integer getsDeptId() {
        return sDeptId;
    }

    public void setsDeptId(Integer sDeptId) {
        this.sDeptId = sDeptId;
    }

    public Integer getsDate() {
        return sDate;
    }

    public void setsDate(Integer sDate) {
        this.sDate = sDate;
    }

    public Integer getsTruedate() {
        return sTruedate;
    }

    public void setsTruedate(Integer sTruedate) {
        this.sTruedate = sTruedate;
    }

    public Integer getsChidao() {
        return sChidao;
    }

    public void setsChidao(Integer sChidao) {
        this.sChidao = sChidao;
    }

    public Integer getsZaotui() {
        return sZaotui;
    }

    public void setsZaotui(Integer sZaotui) {
        this.sZaotui = sZaotui;
    }

    public Float getsKuang() {
        return sKuang;
    }

    public void setsKuang(Float sKuang) {
        this.sKuang = sKuang;
    }

    public Float getsQing() {
        return sQing;
    }

    public void setsQing(Float sQing) {
        this.sQing = sQing;
    }

    public Integer getsBu() {
        return sBu;
    }

    public void setsBu(Integer sBu) {
        this.sBu = sBu;
    }

    public String getsBz() {
        return sBz;
    }

    public void setsBz(String sBz) {
        this.sBz = sBz == null ? null : sBz.trim();
    }
}