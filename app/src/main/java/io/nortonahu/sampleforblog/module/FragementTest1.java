package io.nortonahu.sampleforblog.module;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.nortonahu.sampleforblog.R;

/**
 * Author:    Hong Yu
 * Version    V1.0
 * Date:      2015/10/26 15:48.
 * Description: Fragment test 1
 * Modification  History:
 * Date         	Author        		Version        	Description
 * -----------------------------------------------------------------------------------
 * Why & What is modified:
 */
public class FragementTest1 extends Fragment {

    private static final String TAG = FragementTest1.class.getSimpleName();

    @Bind(R.id.button)
    Button mBtn;

    public static FragementTest1 newInstance() {
        return new FragementTest1();
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.e(TAG,"onCreate");
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.e(TAG, "onCreateView");
        View rootView = inflater.inflate(R.layout.fragment_test1_view, container, false);
        ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        Log.e(TAG,"onViewCreated");
        super.onViewCreated(view, savedInstanceState);
    }

    @OnClick(R.id.button)
    void onBtnClick() {

    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.e(TAG,"onActivityCreated");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.e(TAG,"onStart");
        super.onStart();
    }

    @Override
    public void onPause() {
        Log.e(TAG,"onPause");
        super.onPause();
    }

    @Override
    public void onResume() {
        Log.e(TAG,"onResume");
        super.onResume();
    }

    @Override
    public void onDestroy() {
        Log.e(TAG,"onDestroy");
        super.onDestroy();
    }
}
