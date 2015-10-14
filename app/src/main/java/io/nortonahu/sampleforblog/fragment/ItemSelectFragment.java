package io.nortonahu.sampleforblog.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.Bind;
import butterknife.ButterKnife;
import io.nortonahu.sampleforblog.AppContext;
import io.nortonahu.sampleforblog.R;
import io.nortonahu.sampleforblog.adapter.ItemSelectAdapter;
import io.nortonahu.simpleandroidlib.base.BaseFragment;

/**
 * Author:    Hong Yu
 * Version    V1.0
 * Date:      2015/10/14 11:19.
 * Description:
 * Modification  History:
 * Date         	Author        		Version        	Description
 * -----------------------------------------------------------------------------------
 * Why & What is modified:
 */
public class ItemSelectFragment extends BaseFragment<ItemSelectFragment> {

    @Bind(R.id.recycle_view)
    RecyclerView mRecycleView;

    @Bind(R.id.toolbar)
    Toolbar mToolbar;

    public static ItemSelectFragment newInstance() {
        return new ItemSelectFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_select_view, container,false);
        ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mToolbar.setTitle(AppContext.getContext().string(R.string.app_name));
        ((AppCompatActivity)getActivity()).setSupportActionBar(mToolbar);

        mRecycleView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecycleView.setAdapter(new ItemSelectAdapter(getActivity(), AppContext.getContext().stringArray(R.array.main_data)));
    }
}
