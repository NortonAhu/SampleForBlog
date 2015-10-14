package io.nortonahu.sampleforblog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import io.nortonahu.sampleforblog.fragment.ItemSelectFragment;

/**
 * Author:    Hong Yu
 * Version    V1.0
 * Date:      2015/10/14 11:16.
 * Description: 启动 Activity
 * Modification  History:
 * Date         	Author        		Version        	Description
 * -----------------------------------------------------------------------------------
 * Why & What is modified:
 */
public class AppStartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_view);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, ItemSelectFragment.newInstance())
                    .commit();
        }
    }
}
