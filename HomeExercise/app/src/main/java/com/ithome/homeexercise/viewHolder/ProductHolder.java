package com.ithome.homeexercise.viewHolder;

import android.view.View;
import android.widget.TextView;

import com.ithome.homeexercise.model.Product;
import com.ithome.homeexercise.R;

public class ProductHolder extends BaseViewHolder<Product> {
    private TextView mItem;

    public ProductHolder(View itemView) {
        super(itemView);
        mItem = (TextView) itemView.findViewById(R.id.item);
    }

    @Override
    public void bind(Product object) {
        mItem.setText(object.getTitle());
    }
}