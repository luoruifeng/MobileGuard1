package cn.edu.gdmec.android.mobileguard.m1home.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

import cn.edu.gdmec.android.mobileguard.SplashActivity;

/**
 * Created by Jack on 2017/9/28.
 */

public class MyUtils {
    public static String getVersion(Context context){
        PackageManager packageManager = context.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(),0);
            return packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static void installApk(SplashActivity splashActivity, String filename) {


    }
}
