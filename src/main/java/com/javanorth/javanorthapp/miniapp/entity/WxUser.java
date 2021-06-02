package com.javanorth.javanorthapp.miniapp.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WxUser {
    private String openId;
    private String nickname;
    private String userThumb;
    private Integer gender;
    private String country;
    private String province;
    private String city;

    public WxUser() {
    }

    public WxUser(String openId, String nickname, String userThumb, Integer gender,
                  String country, String province, String city) {
        this.openId = openId;
        this.nickname = nickname;
        this.userThumb = userThumb;
        this.gender = gender;
        this.country = country;
        this.province = province;
        this.city = city;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUserThumb() {
        return userThumb;
    }

    public void setUserThumb(String userThumb) {
        this.userThumb = userThumb;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
