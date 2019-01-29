package com.ithome.homeexercise.viewHolder;

import android.view.View;
import android.widget.TextView;

import com.ithome.homeexercise.R;
import com.ithome.homeexercise.model.Recipe;
import com.ithome.homeexercise.viewHolder.BaseViewHolder;

public class RecipeHolder extends BaseViewHolder<Recipe> {
    private TextView mItem;

    public RecipeHolder(View itemView) {
        super(itemView);
        mItem = (TextView) itemView.findViewById(R.id.item);
    }

    @Override
    public void bind(Recipe object) {
        mItem.setText(object.getTitle());
    }


}