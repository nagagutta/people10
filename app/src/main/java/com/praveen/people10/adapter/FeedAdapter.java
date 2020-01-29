package com.praveen.people10.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.praveen.people10.R;
import com.praveen.people10.databinding.FeedItemBinding;
import com.praveen.people10.model.FeedRow;

import java.util.ArrayList;

public class FeedAdapter extends RecyclerView.Adapter<FeedAdapter.FeedViewHolder> {

    private Context mContext;
    private ArrayList<FeedRow> feedRows;
    public static int staticFeedRows;

    public FeedAdapter(Context context, ArrayList<FeedRow> feedRows) {
        this.mContext = context;
        this.feedRows = feedRows;
    }

    @NonNull
    @Override
    public FeedAdapter.FeedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        FeedItemBinding feedItemBinding = DataBindingUtil.inflate(LayoutInflater.from(mContext),
                R.layout.feed_item, parent, false);
        return new FeedViewHolder(feedItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull FeedAdapter.FeedViewHolder holder, int position) {
        FeedRow feedRow = feedRows.get(position);
        holder.feedItemBinding.setFeedItem(feedRow);
    }

    @Override
    public int getItemCount() {
        staticFeedRows = feedRows.size();
        return feedRows.size();
    }

    public static int getAdapterItemCount(){
        return staticFeedRows;
    }

    class FeedViewHolder extends RecyclerView.ViewHolder {

        FeedItemBinding feedItemBinding;

        FeedViewHolder(@NonNull FeedItemBinding feedItemBinding) {
            super(feedItemBinding.getRoot());
            this.feedItemBinding = feedItemBinding;
        }
    }
}
