package io.nortonahu.sampleforblog.ui;

import io.nortonahu.sampleforblog.AppConstants;
import io.nortonahu.sampleforblog.fragment.FragmentSample;
import io.nortonahu.sampleforblog.fragment.ItemSelectFragment;
import io.nortonahu.sampleforblog.module.FragementTest1;
import io.nortonahu.sampleforblog.module.FragementTest2;

/**
 * Author:    Hong Yu
 * Version    V1.0
 * Date:      2015/10/26 16:28.
 * Description: Fragement 管理类包括Fragment的信息和实例化
 * Modification  History:
 * Date         	Author        		Version        	Description
 * -----------------------------------------------------------------------------------
 * Why & What is modified:
 */
public enum FragmentManager {
    ITEMSELCET(AppConstants.KEY_ITEMSELECT, "示例代码", ItemSelectFragment.class),
    FRAGMENTSAMPLE(AppConstants.KEY_FRAGMENTSAMPLE,"", FragmentSample.class),
    FRAGMENTTEST1(AppConstants.KEY_FRAGMENTTEST1, "Fragment1", FragementTest1.class),
    FRAGMENTTEST2(AppConstants.KEY_FRAGMENTTEST2, "Fragment2", FragementTest2.class);

    private int value;
    private String title;
    private Class<?> cls;

    private FragmentManager(int value, String title, Class<?> cls) {
        this.value = value;
        this.title = title;
        this.cls = cls;
    }

    public int getValue() {
        return value;
    }

    public String getTitle() {
        return title;
    }

    public Class<?> getCls() {
        return cls;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCls(Class<?> cls) {
        this.cls = cls;
    }
    public static FragmentManager getFragmentByValue(int value) {
        for (FragmentManager p : values()) {
            if (p.getValue() == value)
                return p;
        }
        return null;
    }
}
