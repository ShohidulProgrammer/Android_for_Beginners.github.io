package com.ithome.mylistviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.lang.reflect.Field;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listView;
    private SearchView searchView;
    ArrayAdapter<String> adapter;
    private String[] countryNames;
    private int[] flags = {
//            R.drawable.bangladesh_flag,
//            R.drawable.india_flag,
//            R.drawable.pakistan_flag
            R.drawable.ic_settings_applications_black_24dp,
            R.drawable.ic_sentiment_satisfied_black_24dp,
            R.drawable.ic_launcher_foreground
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countryNames = getResources().getStringArray(R.array.country_names);

        listView = findViewById(R.id.list_itemId);
        searchView = findViewById(R.id.search_ViewId);

//        final String[] countryNames = getResources().getStringArray(R.array.country_names);

//        try {
//            Class res = R.drawable.class;
//            Field field = res.getField("drawableName");
//            int drawableId = field.getInt(null);
//        }
//        catch (Exception e) {
//            Log.e("MyTag", "Failure to get drawable id.", e);
//        }


//        final CustomAdapter adapter = new CustomAdapter(this, countryNames, flags);
        adapter = new ArrayAdapter<String>(MainActivity.this,R.layout.sample_view, R.id.countryNameId,countryNames);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                adapter.getFilter().filter(s);
                return false;
            }
        });

//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                String value = countryNames[i];
//
//                Toast.makeText(MainActivity.this, "Country Position: "+i+" Country: "+ value, Toast.LENGTH_SHORT).show();
//            }
//        });
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String value = countryNames[i];
        Toast.makeText(MainActivity.this, "Country Position: "+i+" Country: "+ value, Toast.LENGTH_SHORT).show();
    }
}
