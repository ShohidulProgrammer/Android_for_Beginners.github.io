package com.ithome.homeexercisetest;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.ithome.homeexercisetest.model.Training;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    BaseAdapter adapter;
//    List<Training> itemList;
    List<Training> itemList;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recyclerViewId);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        itemList = new ArrayList<>();

        loadData();

    }

    private void loadData() {


        // loading... message
        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Loading...");
        progressDialog.show();

        // fetching Data using Volley
//        String exerciseTypeUrl = "https://api.myjson.com/bins/ipd0g"; // Exercise type: title, image
        String dbUrl = "https://api.myjson.com/bins/1f51a0"; //"https://api.myjson.com/bins/x6gys"; //"https://api.myjson.com/bins/13ayjk";  // "https://api.myjson.com/bins/1f19ec"; // json file url

        //call model table
        final String table = Training.INSTANCE.table(); // final String table = "myData";

        // dburl request or connect to the server
        StringRequest request = new StringRequest(Request.Method.GET, dbUrl, // create request object for accessing table data using StringRequest constructor  // GET is a final or constant method of StringRequest class
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        progressDialog.dismiss(); // loading... message off

                        getIetm(response,table);

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Toast.makeText(MainActivity.this, "Server Error!", Toast.LENGTH_SHORT).show();
            }
        });

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(request); // make request for data by volley request
    }

    private void getIetm(String response, String table) {
        try {

            JSONObject jsonObject = new JSONObject(response); // row object
            JSONArray dbTable = jsonObject.getJSONArray(table); // mydata is a table name

            for (int i=0; i < dbTable.length(); i++)
            {
                JSONObject row = dbTable.getJSONObject(i);

                // call constructor
                Training item = new Training(
                        // get columns value
                        row.getString("title"),
                        row.getString("imageUrl")
                );

                itemList.add(item); // add row value in List<MyItem> itemList = new ArrayList<>();
            }

            // call adapter obj
            adapter = new BaseAdapter(itemList, getApplicationContext()); // create adapter for row value list. --- itemList
            recyclerView.setAdapter(adapter); // set adapter in recycler view.

            Toast.makeText(MainActivity.this, "Data Loaded Successfully!", Toast.LENGTH_SHORT).show();

        }catch (JSONException e){

            e.printStackTrace();

        }
    }
}
