/**
 * Project: WeChat
 * Package Name: org.zigui.wechat.core.api.user
 * Author: Xuejia
 * Date Time: 2016/4/20 22:31
 * Copyright: 2016 www.zigui.com.cn. All rights reserved.
 **/
package org.zigui.wechat.core.api.user;

/**
 * Class Name: UserInfo
 * Create Date: 2016/4/20 22:31
 * Creator: Xuejia
 * Version: v1.0
 * Updater: Xuejia
 * Date Time:
 * Description:
 * Created by Zigui on 2016/1/18.
 * {
 * "subscribe": 1,
 * "openid": "o6_bmjrPTlm6_2sgVt7hMZOPfL2M",
 * "nickname": "Band",
 * "sex": 1,
 * "language": "zh_CN",
 * "city": "广州",
 * "province": "广东",
 * "country": "中国",
 * "headimgurl":    "http://wx.qlogo.cn/mmopen/g3MonUZtNHkdmzicIlibx6iaFqAc56vxLSUfpb6n5WKSYVY0ChQKkiaJSgQ1dZuTOgvLLrhJbERQQ4eMsv84eavHiaiceqxibJxCfHe/0",
 * "subscribe_time": 1382694957,
 * "unionid": " o6_bmasdasdsad6_2sgVt7hMZOPfL"
 * "remark": "",
 * "groupid": 0
 * }
 */
public class UserInfo {
    // 用户是否订阅该公众号标识，值为0时，代表此用户没有关注该公众号，拉取不到其余信息。
    private int subscribe;
    // 用户的标识，对当前公众号唯一
    private String openid = null;
    // 用户的昵称
    private String nickname = null;
    // 用户的性别，值为1时是男性，值为2时是女性，值为0时是未知
    private int sex;
    // 用户的语言，简体中文为zh_CN
    private String language = null;
    // 用户所在国家
    private String city = null;
    // 用户所在省份
    private String province = null;
    // 用户所在城市
    private String country = null;
    // 用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空。若用户更换头像，原有头像URL将失效。
    private String headimgurl = null;
    // 用户关注时间，为时间戳。如果用户曾多次关注，则取最后关注时间
    private long subscribe_time;
    // 只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段
    private String unionid = null;
    // 公众号运营者对粉丝的备注，公众号运营者可在微信公众平台用户管理界面对粉丝添加备注
    private String remark = null;
    // 用户所在的分组ID
    private int groupid;

    public int getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(int subscribe) {
        this.subscribe = subscribe;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHeadimgurl() {
        return headimgurl;
    }

    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl;
    }

    public long getSubscribe_time() {
        return subscribe_time;
    }

    public void setSubscribe_time(long subscribe_time) {
        this.subscribe_time = subscribe_time;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getGroupid() {
        return groupid;
    }

    public void setGroupid(int groupid) {
        this.groupid = groupid;
    }
}