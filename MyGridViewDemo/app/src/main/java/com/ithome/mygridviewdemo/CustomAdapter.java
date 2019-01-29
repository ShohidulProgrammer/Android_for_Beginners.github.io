package com.ithome.mygridviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class CustomAdapter extends BaseAdapter {

    Context context;
    int[] imageArray;
    String[] countryNames;
    LayoutInflater layoutInflater;

    CustomAdapter(Context context, String[] countryNames, int[] imageArray){
        this.context = context;
        this.countryNames = countryNames;
        this.imageArray = imageArray;
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
        if (view==null){
            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.sample_view,viewGroup,false);
        }

        ImageView imageView = view.findViewById(R.id.imageViewId);
        TextView textView = view.findViewById(R.id.list_itemTextViewId);

        imageView.setImageResource(imageArray[i]);
        textView.setText(countryNames[i]);

        return view;
    }
}
