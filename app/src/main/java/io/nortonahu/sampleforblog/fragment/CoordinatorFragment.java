package io.nortonahu.sampleforblog.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.Bind;
import butterknife.ButterKnife;
import io.nortonahu.sampleforblog.R;
import io.nortonahu.simpleandroidlib.base.BaseFragment;

/**
 * Author:    Hong Yu
 * Version    V1.0
 * Date:      2015/10/14 14:29.
 * Description: Coordinator Layout 图层学习
 * Modification  History:
 * Date         	Author        		Version        	Description
 * -----------------------------------------------------------------------------------
 * Why & What is modified:
 */
public class CoordinatorFragment extends BaseFragment<CoordinatorFragment> {

    @Bind(R.id.toolbar)
    Toolbar mToolBar;

    public static CoordinatorFragment newInstance() {
        return new CoordinatorFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_view, container, false);
        ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void initDdata() {
        Bundle bundle = getArguments();
        if(bundle != null)
        {

        }
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onPause() {
        super.onPause();
    }
}
