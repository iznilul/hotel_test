package com.example.demo.entity;

import java.io.Serializable;

public class FitnessRecord implements Serializable {
    private String userid;

    private String name;

    private String fitnessType;

    private String ontime;

    private static final long serialVersionUID = 1L;

    public FitnessRecord(String userid, String name, String fitnessType, String ontime) {
        this.userid = userid;
        this.name = name;
        this.fitnessType = fitnessType;
        this.ontime = ontime;
    }

    public FitnessRecord() {
        super();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getFitnessType() {
        return fitnessType;
    }

    public void setFitnessType(String fitnessType) {
        this.fitnessType = fitnessType == null ? null : fitnessType.trim();
    }

    public String getOntime() {
        return ontime;
    }

    public void setOntime(String ontime) {
        this.ontime = ontime == null ? null : ontime.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", name=").append(name);
        sb.append(", fitnessType=").append(fitnessType);
        sb.append(", ontime=").append(ontime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}