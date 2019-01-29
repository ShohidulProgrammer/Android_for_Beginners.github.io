package com.ithome.homeexercise.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ithome.homeexercise.viewHolder.ProductHolder;
import com.ithome.homeexercise.model.BaseModel;
import com.ithome.homeexercise.viewHolder.BaseViewHolder;

import java.util.List;

public class InventoryAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    private List<? extends BaseModel> mList;
    private LayoutInflater mInflator;

    public InventoryAdapter(List<? extends BaseModel> list, Context context) {
        this.mList = list;
        this.mInflator = LayoutInflater.from(context);
    }

    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

//        return new ProductHolder(mInflator.inflate(R.layout.type_product,parent,false));

        View view = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
        ProductHolder viewHolder = new ProductHolder(view);


//        switch (viewType) {
////            case ViewType.COLLECTION_TYPE:
////                return new DayCardViewHolder(mInflator.inflate(R.layout.day_cardview,parent,false));
////            case ViewType.PRODUCT:
////                return new ProductHolder(mInflator.inflate(R.layout.type_product,parent,false));
////            case ViewType.RECIPE_TYPE:
////                return new RecipeHolder(mInflator.inflate(R.layout.type_recipe,parent,false));
//        }
        return viewHolder; //return view holder object from adapter
    }

    @Override
    @SuppressWarnings("unchecked")
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.bind(mList.get(position));
    }


    @Override
    public int getItemViewType(int position) {
        return mList.get(position).getViewType();
    }

    public int getItemCount() {
        return mList.size();
    }

}