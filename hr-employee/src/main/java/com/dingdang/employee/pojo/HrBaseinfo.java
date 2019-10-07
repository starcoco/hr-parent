package com.dingdang.employee.pojo;

public class HrBaseinfo {
    private Integer baId;

    private String baName;

    private String baSex;

    private Integer baAge;

    private String baIdcard;

    private String baBirth;

    private String baNation;

    private String baMarriage;

    private String baVisage;

    private String baHome;

    private String baTel;

    private String baAddress;

    private String baCulture;

    private String emIsstock;

    private String emBz;

    public Integer getBaId() {
        return baId;
    }

    public void setBaId(Integer baId) {
        this.baId = baId;
    }

    public String getBaName() {
        return baName;
    }

    public void setBaName(String baName) {
        this.baName = baName == null ? null : baName.trim();
    }

    public String getBaSex() {
        return baSex;
    }

    public void setBaSex(String baSex) {
        this.baSex = baSex == null ? null : baSex.trim();
    }

    public Integer getBaAge() {
        return baAge;
    }

    public void setBaAge(Integer baAge) {
        this.baAge = baAge;
    }

    public String getBaIdcard() {
        return baIdcard;
    }

    public void setBaIdcard(String baIdcard) {
        this.baIdcard = baIdcard == null ? null : baIdcard.trim();
    }

    public String getBaBirth() {
        return baBirth;
    }

    public void setBaBirth(String baBirth) {
        this.baBirth = baBirth == null ? null : baBirth.trim();
    }

    public String getBaNation() {
        return baNation;
    }

    public void setBaNation(String baNation) {
        this.baNation = baNation == null ? null : baNation.trim();
    }

    public String getBaMarriage() {
        return baMarriage;
    }

    public void setBaMarriage(String baMarriage) {
        this.baMarriage = baMarriage == null ? null : baMarriage.trim();
    }

    public String getBaVisage() {
        return baVisage;
    }

    public void setBaVisage(String baVisage) {
        this.baVisage = baVisage == null ? null : baVisage.trim();
    }

    public String getBaHome() {
        return baHome;
    }

    public void setBaHome(String baHome) {
        this.baHome = baHome == null ? null : baHome.trim();
    }

    public String getBaTel() {
        return baTel;
    }

    public void setBaTel(String baTel) {
        this.baTel = baTel == null ? null : baTel.trim();
    }

    public String getBaAddress() {
        return baAddress;
    }

    public void setBaAddress(String baAddress) {
        this.baAddress = baAddress == null ? null : baAddress.trim();
    }

    public String getBaCulture() {
        return baCulture;
    }

    public void setBaCulture(String baCulture) {
        this.baCulture = baCulture == null ? null : baCulture.trim();
    }

    public String getEmIsstock() {
        return emIsstock;
    }

    public void setEmIsstock(String emIsstock) {
        this.emIsstock = emIsstock == null ? null : emIsstock.trim();
    }

    public String getEmBz() {
        return emBz;
    }

    public void setEmBz(String emBz) {
        this.emBz = emBz == null ? null : emBz.trim();
    }
}