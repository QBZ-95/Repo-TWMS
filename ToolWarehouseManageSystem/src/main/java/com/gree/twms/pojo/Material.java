package com.gree.twms.pojo;

import java.util.Date;

public class Material {
    private String tname;

    private String tmodel;

    private String producer;

    private Date productiontime;

    private String enclosureurl;

    private String remarks;

    private String remarks1;

    private String remarks2;

    private String remarks3;

    private String remarks4;

    private String remarks5;

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    public String getTmodel() {
        return tmodel;
    }

    public void setTmodel(String tmodel) {
        this.tmodel = tmodel == null ? null : tmodel.trim();
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer == null ? null : producer.trim();
    }

    public Date getProductiontime() {
        return productiontime;
    }

    public void setProductiontime(Date productiontime) {
        this.productiontime = productiontime;
    }

    public String getEnclosureurl() {
        return enclosureurl;
    }

    public void setEnclosureurl(String enclosureurl) {
        this.enclosureurl = enclosureurl == null ? null : enclosureurl.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
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