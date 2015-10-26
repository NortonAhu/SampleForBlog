package io.nortonahu.sampleforblog.fragment;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import io.nortonahu.sampleforblog.AppConstants;
import io.nortonahu.sampleforblog.AppContext;
import io.nortonahu.sampleforblog.R;
import io.nortonahu.simpleandroidlib.base.BaseFragment;

/**
 * Author:    Hong Yu
 * Version    V1.0
 * Date:      2015/10/14 16:06.
 * Description: 学习Fragment操作
 * Modification  History:
 * Date         	Author        		Version        	Description
 * -----------------------------------------------------------------------------------
 * Why & What is modified:
 */
public class FragmentSample extends BaseFragment<FragmentSample> {

    public static FragmentSample newInstance() {
        return new FragmentSample();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_view, container, false);
        ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ActionBar toolbar = ((AppCompatActivity)getActivity()).getSupportActionBar();
        if(TextUtils.isEmpty(mTitle))
        {
            mTitle = AppContext.getContext().string(R.string.app_name);
        }
        toolbar.setTitle(mTitle);
//        toolbar.setDefaultDisplayHomeAsUpEnabled(true);
        toolbar.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void initDdata() {
        Bundle bundle = getArguments();
        if(bundle != null)
        {
            mTitle = bundle.getString(AppConstants.KEY_TITLE_CONTENT, "");
        }
    }
}
