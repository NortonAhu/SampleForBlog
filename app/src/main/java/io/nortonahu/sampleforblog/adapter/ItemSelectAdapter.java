package io.nortonahu.sampleforblog.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.nortonahu.sampleforblog.AppConstants;
import io.nortonahu.sampleforblog.AppContext;
import io.nortonahu.sampleforblog.R;
import io.nortonahu.sampleforblog.ui.ContainActivity;

/**
 * Author:    Hong Yu
 * Version    V1.0
 * Date:      2015/10/14 11:43.
 * Description:
 * Modification  History:
 * Date         	Author        		Version        	Description
 * -----------------------------------------------------------------------------------
 * Why & What is modified:
 */
public class ItemSelectAdapter extends RecyclerView.Adapter<ItemSelectAdapter.TextHolder> {

    private static final String TAG = ItemSelectAdapter.class.getSimpleName();

    private Context mContext;

    private String[] data;

    private LayoutInflater mLayoutInflater;

    public ItemSelectAdapter(Context context, String[] data) {
        mContext = context;
        this.data = data;
        mLayoutInflater = LayoutInflater.from(context);

    }

    @Override
    public TextHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new TextHolder(mLayoutInflater.inflate(R.layout.item_card_view, parent, false), mContext, data);
    }

    @Override
    public void onBindViewHolder(TextHolder holder, int position) {
        holder.mTextView.setText(data[position]);
    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.length;
    }

    public static class TextHolder extends RecyclerView.ViewHolder {

        @Bind(R.id.text_view)
        TextView mTextView;

        private String[] mdatas;
        private Context context;

        public TextHolder(View itemView, Context context, String[] datas) {
            super(itemView);
            mdatas = datas;
            this.context = context;
            ButterKnife.bind(this, itemView);
        }

        @OnClick(R.id.cv_item)
        void itemClick() {
            Log.e(TAG, "getPosition is " + getPosition() + " getLayoutPosition is" + getLayoutPosition()
                    + " getAdapterPosition is" + getAdapterPosition());
            AppContext.getContext().showToast(mdatas[getPosition()]);
            Bundle bundle = new Bundle();
            bundle.putString(AppConstants.KEY_TITLE_CONTENT,mdatas[getPosition()]);
            Intent intent = new Intent(context, ContainActivity.class);
            intent.putExtras(bundle);
            context.startActivity(intent);
        }
    }
}
