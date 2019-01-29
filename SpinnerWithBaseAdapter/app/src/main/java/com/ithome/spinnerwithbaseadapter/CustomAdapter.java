package com.ithome.spinnerwithbaseadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

class CustomAdapter extends BaseAdapter {

    int[] flags;
    private String[] countryNames;
    private String[] population;
    Context context;

    CustomAdapter(Context context, int[] flags, String[] countryNames, String[] population)
    {
        this.context = context;
        this.flags = flags;
        this.countryNames = countryNames;
        this.population = population;
    }

    @Override
    public int getCount() {
        return countryNames.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view==null)
        {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.sample_view,null,false);
        }

        ImageView imageView = view.findViewById(R.id.sampleImageViewId);
        imageView.setImageResource(flags[i]);

        TextView countryName = view.findViewById(R.id.countryNameTextViewId);
        countryName.setText(countryNames[i]);

        TextView people = view.findViewById(R.id.populationTextViewId);
        people.setText(population[i]);


        return null;
    }
}
