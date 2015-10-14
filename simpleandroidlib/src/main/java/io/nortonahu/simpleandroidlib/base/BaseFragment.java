package io.nortonahu.simpleandroidlib.base;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Author:    Hong Yu
 * Version    V1.0
 * Date:      2015/10/14 11:20.
 * Description:
 * Modification  History:
 * Date         	Author        		Version        	Description
 * -----------------------------------------------------------------------------------
 * Why & What is modified:
 */
public abstract class BaseFragment < T extends Fragment> extends Fragment {

    protected String mTitle = "";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDdata();
    }

    public abstract void initDdata();

}
