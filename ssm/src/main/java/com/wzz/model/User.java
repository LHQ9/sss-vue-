package com.wzz.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName User
 * @Description TODO  用户类
 * @Author AZhen
 * Version 1.0
 **/
public class User implements Serializable {
    private int id;
    private String uid;    //uid
    private String userName;   //用户名
    private String password;    //密码
    private String relName;      //姓名
    private Integer age;    //年龄
    private Integer sex;    //性别
    private Integer score;  //征信分
    private Date   bir;     //出生日期
    private String place;   //出生省份
    private String city;    //出生城市
    private double tel;     //电话号码
    private boolean token;  //登录类型

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getuName() {
        return relName;
    }

    public void setuName(String uName) {
        this.relName = uName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getRelName() {
        return relName;
    }

    public void setRelName(String relName) {
        this.relName = relName;
    }

    public Date getBir() {
        return bir;
    }

    public void setBir(Date bir) {
        this.bir = bir;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getTel() {
        return tel;
    }

    public void setTel(double tel) {
        this.tel = tel;
    }

    public boolean isToken() {
        return token;
    }

    public void setToken(boolean token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", uid='" + uid + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", relName='" + relName + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", score=" + score +
                ", bir=" + bir +
                ", place='" + place + '\'' +
                ", city='" + city + '\'' +
                ", tel=" + tel +
                ", token=" + token +
                '}';
    }
}