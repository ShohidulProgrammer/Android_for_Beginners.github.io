package com.ithome.homeexercise;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.ithome.homeexercise.R;
import com.ithome.homeexercise.TrainingTypeCardViewHolder;
import com.ithome.homeexercise.model.Training;
import com.squareup.picasso.Picasso;

import java.util.List;

public class BaseAdapter extends RecyclerView.Adapter<TrainingTypeCardViewHolder> {

    private List<Training> trainingList;
    private Context context;


    public BaseAdapter(List<Training> trainingList, Context context) {
        this.trainingList = trainingList;
        this.context = context;
    }

    @NonNull
    @Override
    public TrainingTypeCardViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.training_type_cardview, viewGroup, false);
        TrainingTypeCardViewHolder viewHolder = new TrainingTypeCardViewHolder(view);
        return viewHolder; //return view holder object from adapter
    }

    @Override
    public void onBindViewHolder(@NonNull TrainingTypeCardViewHolder trainingTypeCardViewHolder, int i) {

        final Training  trainingIndex = trainingList.get(i);
        trainingTypeCardViewHolder.title.setText( trainingIndex.getTitle());


//        Glide.with(context).load(itemPosition.getImageUrl()).into(trainingTypeCardViewHolder); // gif image load
//        GlideApp.with(this).load("http://goo.gl/gEgYUd").into(trainingTypeImag);

//        Picasso.get().load("http://i.imgur.com/DvpvklR.png").into(imageView);
        Picasso.get().load(trainingIndex.getImageUrl()).into(trainingTypeCardViewHolder.trainingTypeImage); // image load

        trainingTypeCardViewHolder.traingTypeCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,  trainingIndex.getTitle(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return trainingList.size(); // return list length
    }
}
