package com.ithome.myrecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private List<MyItem> myItemList;
    private Context context;

    public MyAdapter(List<MyItem> myItemList, Context context) {
        this.myItemList = myItemList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_layout_of_recycler_view, viewGroup, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder; //return view holder object from adapter
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        final MyItem itemPosition = myItemList.get(i);
        myViewHolder.headText.setText(itemPosition.getHead());
        myViewHolder.descriptionText.setText(itemPosition.getDescription());

        Glide.with(context).load(itemPosition.getImageUrl()).into(myViewHolder.imageView); // gif image load
//        GlideApp.with(this).load("http://goo.gl/gEgYUd").into(imageView);

//        Picasso.get().load("http://i.imgur.com/DvpvklR.png").into(imageView);
//        Picasso.get().load(itemPosition.getImageUrl()).into(myViewHolder.imageView); // image load

        myViewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, itemPosition.getHead(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return myItemList.size(); // return list length
    }
}
