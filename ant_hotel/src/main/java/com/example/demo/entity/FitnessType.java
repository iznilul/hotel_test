package com.example.demo.entity;

import java.io.Serializable;

public class FitnessType implements Serializable {
    private String fitnesstoolid;

    private String name;

    private static final long serialVersionUID = 1L;

    public FitnessType(String fitnesstoolid, String name) {
        this.fitnesstoolid = fitnesstoolid;
        this.name = name;
    }

    public FitnessType() {
        super();
    }

    public String getFitnesstoolid() {
        return fitnesstoolid;
    }

    public void setFitnesstoolid(String fitnesstoolid) {
        this.fitnesstoolid = fitnesstoolid == null ? null : fitnesstoolid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fitnesstoolid=").append(fitnesstoolid);
        sb.append(", name=").append(name);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}