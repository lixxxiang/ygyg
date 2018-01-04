package com.example.lixiang.dailypic2_android.util;

import android.text.TextUtils;

/**
 * Created by lixiang on 2017/10/23.
 */

public class Constants {
    public static final String UrlPrefix = "http://59.110.164.214:8024/";
    public static final String tempUrlPrefix = "http://10.10.90.11:8080/";
    private static long lastClickTime;
    public static final String APP_ID = "wxf781731ab68a2888";
    public static final String SharePicUrlPrefix = "http://10.10.90.3:8097";
    public static final String ShareVideoUrlPrefix = "http://10.10.90.3:8092";
    public static boolean isMobileNO(String mobiles) {
        String telRegex = "[1][34578]\\d{9}";
        if (TextUtils.isEmpty(mobiles)) return false;
        else return mobiles.matches(telRegex);
    }

    public static boolean isFastDoubleClick() {
        long time = System.currentTimeMillis();
        long timeD = time - lastClickTime;
        if (0 < timeD && timeD < 800) {
            return true;
        }
        lastClickTime = time;
        return false;
    }
}
