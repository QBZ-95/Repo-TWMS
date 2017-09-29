package com.gree.twms.pojo;

import java.util.Date;

public class Repair {
    private String shift;

    private Date sendtime;

    private String sendpeople;

    private String team;

    private String tname;

    private String tmodel;

    private Integer tid;

    private String sendfaultdescription;

    private String repairfaultdescription;

    private String handmeasures;

    private String repairpeople;

    private String sendmethod;

    private String remark;

    private String remarks1;

    private String remarks2;

    private String remarks3;

    private String remarks4;

    private String remarks5;

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift == null ? null : shift.trim();
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public String getSendpeople() {
        return sendpeople;
    }

    public void setSendpeople(String sendpeople) {
        this.sendpeople = sendpeople == null ? null : sendpeople.trim();
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team == null ? null : team.trim();
    }

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

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getSendfaultdescription() {
        return sendfaultdescription;
    }

    public void setSendfaultdescription(String sendfaultdescription) {
        this.sendfaultdescription = sendfaultdescription == null ? null : sendfaultdescription.trim();
    }

    public String getRepairfaultdescription() {
        return repairfaultdescription;
    }

    public void setRepairfaultdescription(String repairfaultdescription) {
        this.repairfaultdescription = repairfaultdescription == null ? null : repairfaultdescription.trim();
    }

    public String getHandmeasures() {
        return handmeasures;
    }

    public void setHandmeasures(String handmeasures) {
        this.handmeasures = handmeasures == null ? null : handmeasures.trim();
    }

    public String getRepairpeople() {
        return repairpeople;
    }

    public void setRepairpeople(String repairpeople) {
        this.repairpeople = repairpeople == null ? null : repairpeople.trim();
    }

    public String getSendmethod() {
        return sendmethod;
    }

    public void setSendmethod(String sendmethod) {
        this.sendmethod = sendmethod == null ? null : sendmethod.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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