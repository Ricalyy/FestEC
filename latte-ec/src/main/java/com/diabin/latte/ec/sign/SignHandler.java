package com.diabin.latte.ec.sign;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.diabin.latte.app.AccountManager;
import com.diabin.latte.ec.database.DataBaseManager;
import com.diabin.latte.ec.database.UserProfile;

/**
 * Created by 黄陈聪 on 2018/9/25.
 */
public class SignHandler {

    public static void onSignIn(String response, ISignListener signListener) {
        final JSONObject profileJson = JSON.parseObject(response).getJSONObject("data");
        final long userId = profileJson.getLong("userId");
        final String name = profileJson.getString("name");
        final String avatar = profileJson.getString("avatar");
        final String gender = profileJson.getString("gender");
        final String address = profileJson.getString("address");

        final UserProfile profile = new UserProfile(userId, name, avatar, gender, address);
        DataBaseManager.getInstance().getDao().insert(profile);

        //已经注册成功并登录
        AccountManager.setSignState(true);
        signListener.onSignInSuccess();
    }

    public static void onSignUp(String response, ISignListener signListener) {
        final JSONObject profileJson = JSON.parseObject(response).getJSONObject("data");
        final long userId = profileJson.getLong("userId");
        final String name = profileJson.getString("name");
        final String avatar = profileJson.getString("avatar");
        final String gender = profileJson.getString("gender");
        final String address = profileJson.getString("address");

        final UserProfile profile = new UserProfile(userId, name, avatar, gender, address);
        DataBaseManager.getInstance().getDao().insert(profile);

        //已经注册成功并登录
        AccountManager.setSignState(true);
        signListener.onSignUpSuccess();
    }
}
