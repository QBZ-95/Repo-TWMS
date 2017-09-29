package com.gree.twms.pojo;

import java.util.Date;

public class Version {
    private String pcbid;

    private String oldversion;

    private String newversion;

    private String ictchenge;

    private String fctchenge;

    private Date arrivetime;

    private String ictchengeid;

    private String fctchengeid;

    private String otfchengeid;

    private String icftchengeid;

    private Date chengetime;

    private String completion;

    private String remarks1;

    private String remarks2;

    private String remarks3;

    private String remarks4;

    private String remarks5;

    public String getPcbid() {
        return pcbid;
    }

    public void setPcbid(String pcbid) {
        this.pcbid = pcbid == null ? null : pcbid.trim();
    }

    public String getOldversion() {
        return oldversion;
    }

    public void setOldversion(String oldversion) {
        this.oldversion = oldversion == null ? null : oldversion.trim();
    }

    public String getNewversion() {
        return newversion;
    }

    public void setNewversion(String newversion) {
        this.newversion = newversion == null ? null : newversion.trim();
    }

    public String getIctchenge() {
        return ictchenge;
    }

    public void setIctchenge(String ictchenge) {
        this.ictchenge = ictchenge == null ? null : ictchenge.trim();
    }

    public String getFctchenge() {
        return fctchenge;
    }

    public void setFctchenge(String fctchenge) {
        this.fctchenge = fctchenge == null ? null : fctchenge.trim();
    }

    public Date getArrivetime() {
        return arrivetime;
    }

    public void setArrivetime(Date arrivetime) {
        this.arrivetime = arrivetime;
    }

    public String getIctchengeid() {
        return ictchengeid;
    }

    public void setIctchengeid(String ictchengeid) {
        this.ictchengeid = ictchengeid == null ? null : ictchengeid.trim();
    }

    public String getFctchengeid() {
        return fctchengeid;
    }

    public void setFctchengeid(String fctchengeid) {
        this.fctchengeid = fctchengeid == null ? null : fctchengeid.trim();
    }

    public String getOtfchengeid() {
        return otfchengeid;
    }

    public void setOtfchengeid(String otfchengeid) {
        this.otfchengeid = otfchengeid == null ? null : otfchengeid.trim();
    }

    public String getIcftchengeid() {
        return icftchengeid;
    }

    public void setIcftchengeid(String icftchengeid) {
        this.icftchengeid = icftchengeid == null ? null : icftchengeid.trim();
    }

    public Date getChengetime() {
        return chengetime;
    }

    public void setChengetime(Date chengetime) {
        this.chengetime = chengetime;
    }

    public String getCompletion() {
        return completion;
    }

    public void setCompletion(String completion) {
        this.completion = completion == null ? null : completion.trim();
    }

    public String getRemarks1() {
        return remarks1;
    }

    public void setRemarks1(String remarks1) {
        this.remarks1 = remarks1 == null ? null : remarks1.trim();
    }

    public String getRemarks2() {
        return remarks2;
    }

    public void setRemarks2(String remarks2) {
        this.remarks2 = remarks2 == null ? null : remarks2.trim();
    }

    public String getRemarks3() {
        return remarks3;
    }

    public void setRemarks3(String remarks3) {
        this.remarks3 = remarks3 == null ? null : remarks3.trim();
    }

    public String getRemarks4() {
        return remarks4;
    }

    public void setRemarks4(String remarks4) {
        this.remarks4 = remarks4 == null ? null : remarks4.trim();
    }

    public String getRemarks5() {
        return remarks5;
    }

    public void setRemarks5(String remarks5) {
        this.remarks5 = remarks5 == null ? null : remarks5.trim();
    }
}