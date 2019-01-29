package com.ithome.homeexercise.viewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.ithome.homeexercise.R;

public class  WorkoutDescriptionHolder extends RecyclerView.ViewHolder {

    protected CardView   workoutPerformDescriptionCardView;
    protected ScrollView workoutPerformDescriptionScrollViewId;
    protected TextView   howToPerformTxtView;
    protected TextView   workoutDescriptionTxtView;
    protected TextView   benefitTxtView;
    protected TextView   benefitDescriptionTxtView;

    public WorkoutDescriptionHolder(@NonNull View itemView) {
        super(itemView);

        workoutPerformDescriptionCardView = itemView.findViewById(R.id.workoutPerformDescriptionCardViewId);
        workoutPerformDescriptionScrollViewId = itemView.findViewById(R.id.workoutPerformDescriptionScrollViewId);
        howToPerformTxtView = itemView.findViewById(R.id.howToPerformTextViewId);
        workoutDescriptionTxtView = itemView.findViewById(R.id.workoutDescriptionTextViewId);
        benefitTxtView = itemView.findViewById(R.id.benefitTextViewId);
        benefitDescriptionTxtView = itemView.findViewById(R.id.workoutBenefitDescriptionTextViewId);
    }
}




