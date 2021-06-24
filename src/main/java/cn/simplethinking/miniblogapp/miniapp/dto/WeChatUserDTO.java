package cn.simplethinking.miniblogapp.miniapp.dto;

import cn.simplethinking.miniblogapp.miniapp.entity.WeChatUser;

/**
 * @author <a href="hefengen@hotmail.com">finen</a>
 * @description WeChat User Request
 * @see WeChatUser
 * @since 1.0.0
 */
public class WeChatUserDTO {
    /**
     * 用户昵称
     */
    private String nickName;

    /**
     * 用户头像缩略图
     */
    private String avatarUrl;

    /**
     * 用户性别
     */
    private Integer gender;

    /**
     * 用户国家
     */
    private String country;

    /**
     * 用户省份
     */
    private String province;

    /**
     * 用户城市
     */
    private String city;

    /**
     * 用户语言
     */
    private String language;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "WeChatUserDTO{" +
                "nickName='" + nickName + '\'' +
                ", avatarUrl='" + avatarUrl + '\'' +
                ", gender=" + gender +
                ", country='" + country + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
