package com.ithome.homeexercise.model;

public class WorkoutDescription {

//    private String workoutPerformDescriptionCardView;
//    private String workoutPerformDescriptionScrollViewId;
//    private String howToPerformTxtView;
//    private String benefitTxtView;

    private String workoutDescriptionTxtView;
    private String benefitDescriptionTxtView;

    public WorkoutDescription(String workoutDescriptionTxtView, String benefitDescriptionTxtView) {
        this.workoutDescriptionTxtView = workoutDescriptionTxtView;
        this.benefitDescriptionTxtView = benefitDescriptionTxtView;
    }

    public String getWorkoutDescriptionTxtView() {
        return workoutDescriptionTxtView;
    }

    public String getBenefitDescriptionTxtView() {
        return benefitDescriptionTxtView;
    }
}
