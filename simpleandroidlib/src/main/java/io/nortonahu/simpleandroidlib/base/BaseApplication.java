package io.nortonahu.simpleandroidlib.base;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.widget.Toast;

/**
 * Author:    Hong Yu
 * Version    V1.0
 * Date:      2015/10/14 10:49.
 * Description: 框架基类
 * Modification  History:
 * Date         	Author        		Version        	Description
 * -----------------------------------------------------------------------------------
 * Why & What is modified:
 */
public class BaseApplication extends Application {


    private static Context _context;

    private static Resources _resources;

    @Override
    public void onCreate() {
        super.onCreate();
        _context = getApplicationContext();
        _resources = _context.getResources();
    }

    public static BaseApplication getContext() {
        return (BaseApplication) _context;
    }

    public static Resources resources() {
        return _resources;
    }

    public String string(int id) {
        return _resources.getString(id);
    }
//
//    public String string(int id, Objects... object) {
//        return _resources.getString(id, object);
//    }


    public String[] stringArray(int id) {
        return _resources.getStringArray(id);
    }

    public void showToast(String str) {
        Toast.makeText(_context, str, Toast.LENGTH_LONG).show();
    }

    public void showToast(String str, int time) {
        Toast.makeText(_context, str, time).show();
    }
}
