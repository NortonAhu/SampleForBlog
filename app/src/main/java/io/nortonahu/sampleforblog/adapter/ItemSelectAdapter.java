package io.nortonahu.sampleforblog.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import io.nortonahu.sampleforblog.R;

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
        return new TextHolder(mLayoutInflater.inflate(R.layout.item_card_view,parent,false), mContext);
    }

    @Override
    public void onBindViewHolder(TextHolder holder, int position) {
        holder.mTextView.setText(data[position]);
    }

    @Override
    public int getItemCount() {
        return data == null ? 0: data.length;
    }

    public static class TextHolder extends RecyclerView.ViewHolder {

        @Bind(R.id.text_view)
        TextView mTextView;
        public TextHolder(View itemView, Context context) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
