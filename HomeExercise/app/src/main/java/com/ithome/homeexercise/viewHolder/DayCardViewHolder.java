package com.ithome.homeexercise.viewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.ithome.homeexercise.model.Product;
import com.ithome.homeexercise.R;

public class DayCardViewHolder extends RecyclerView.ViewHolder {

    private TextView dayCount;
    private TextView exercisePercent;
    private ProgressBar progressCircle;
    private TextView mItem;

    public DayCardViewHolder(@NonNull View itemView) {
        super(itemView);

        dayCount = itemView.findViewById(R.id.dayCountTextViewId);
        exercisePercent = itemView.findViewById(R.id.exercisePercentTextViewId);
        progressCircle = itemView.findViewById(R.id.progress_circularId);

    }

    public void bind(Product object) {
        mItem.setText(object.getTitle());
    }
}
