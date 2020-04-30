package com.anthotel.admin.entity;

import java.io.Serializable;
import java.util.Date;

public class UserFaceInfo implements Serializable {
    private String userid;

    private Integer groupid;

    private String faceid;

    private String name;

    private Integer age;

    private String email;

    private Short gender;

    private String phonenumber;

    private Date createtime;

    private Date updatetime;

    private String fpath;

    private byte[] facefeature;

    private static final long serialVersionUID = 1L;

    public UserFaceInfo(String userid, Integer groupid, String faceid, String name, Integer age, String email, Short gender, String phonenumber, Date createtime, Date updatetime, String fpath, byte[] facefeature) {
        this.userid = userid;
        this.groupid = groupid;
        this.faceid = faceid;
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
        this.phonenumber = phonenumber;
        this.createtime = createtime;
        this.updatetime = updatetime;
        this.fpath = fpath;
        this.facefeature = facefeature;
    }

    public UserFaceInfo() {
        super();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public String getFaceid() {
        return faceid;
    }

    public void setFaceid(String faceid) {
        this.faceid = faceid == null ? null : faceid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Short getGender() {
        return gender;
    }

    public void setGender(Short gender) {
        this.gender = gender;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getFpath() {
        return fpath;
    }

    public void setFpath(String fpath) {
        this.fpath = fpath == null ? null : fpath.trim();
    }

    public byte[] getFacefeature() {
        return facefeature;
    }

    public void setFacefeature(byte[] facefeature) {
        this.facefeature = facefeature;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", groupid=").append(groupid);
        sb.append(", faceid=").append(faceid);
        sb.append(", name=").append(name);
        sb.append(", age=").append(age);
        sb.append(", email=").append(email);
        sb.append(", gender=").append(gender);
        sb.append(", phonenumber=").append(phonenumber);
        sb.append(", createtime=").append(createtime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", fpath=").append(fpath);
        sb.append(", facefeature=").append(facefeature);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}