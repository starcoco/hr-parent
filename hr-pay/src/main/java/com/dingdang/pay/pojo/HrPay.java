package com.dingdang.pay.pojo;

public class HrPay {
    private Integer payId;

    private String payAccount;

    private String payEmname;

    private String payDeptId;

    private Integer payBasemoney;

    private Integer payOvertime;

    private Integer payMore;

    private Integer payCheck;

    private Float payAbsent;

    private Float paySafety;

    private Float payPoint;

    private Float payLbmoney;

    private Float payFulimoney;

    private Float payAllcut;

    private String payMark;

    private String payBz;

    private String payBs;

    private String dt_name;

    public Integer getPayId() {
        return payId;
    }

    public void setPayId(Integer payId) {
        this.payId = payId;
    }

    public String getPayAccount() {
        return payAccount;
    }

    public void setPayAccount(String payAccount) {
        this.payAccount = payAccount == null ? null : payAccount.trim();
    }

    public String getPayEmname() {
        return payEmname;
    }

    public void setPayEmname(String payEmname) {
        this.payEmname = payEmname == null ? null : payEmname.trim();
    }

    public String getPayDeptId() {
        return payDeptId;
    }

    public void setPayDeptId(String payDeptId) {
        this.payDeptId = payDeptId == null ? null : payDeptId.trim();
    }

    public Integer getPayBasemoney() {
        return payBasemoney;
    }

    public void setPayBasemoney(Integer payBasemoney) {
        this.payBasemoney = payBasemoney;
    }

    public Integer getPayOvertime() {
        return payOvertime;
    }

    public void setPayOvertime(Integer payOvertime) {
        this.payOvertime = payOvertime;
    }

    public Integer getPayMore() {
        return payMore;
    }

    public void setPayMore(Integer payMore) {
        this.payMore = payMore;
    }

    public Integer getPayCheck() {
        return payCheck;
    }

    public void setPayCheck(Integer payCheck) {
        this.payCheck = payCheck;
    }

    public Float getPayAbsent() {
        return payAbsent;
    }

    public void setPayAbsent(Float payAbsent) {
        this.payAbsent = payAbsent;
    }

    public Float getPaySafety() {
        return paySafety;
    }

    public void setPaySafety(Float paySafety) {
        this.paySafety = paySafety;
    }

    public Float getPayPoint() {
        return payPoint;
    }

    public void setPayPoint(Float payPoint) {
        this.payPoint = payPoint;
    }

    public Float getPayLbmoney() {
        return payLbmoney;
    }

    public void setPayLbmoney(Float payLbmoney) {
        this.payLbmoney = payLbmoney;
    }

    public Float getPayFulimoney() {
        return payFulimoney;
    }

    public void setPayFulimoney(Float payFulimoney) {
        this.payFulimoney = payFulimoney;
    }

    public Float getPayAllcut() {
        return payAllcut;
    }

    public void setPayAllcut(Float payAllcut) {
        this.payAllcut = payAllcut;
    }

    public String getPayMark() {
        return payMark;
    }

    public void setPayMark(String payMark) {
        this.payMark = payMark == null ? null : payMark.trim();
    }

    public String getPayBz() {
        return payBz;
    }

    public void setPayBz(String payBz) {
        this.payBz = payBz == null ? null : payBz.trim();
    }

    public String getPayBs() {
        return payBs;
    }

    public void setPayBs(String payBs) {
        this.payBs = payBs == null ? null : payBs.trim();
    }
}