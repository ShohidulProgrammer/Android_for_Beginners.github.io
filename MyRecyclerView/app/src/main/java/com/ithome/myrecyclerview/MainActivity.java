package com.ithome.myrecyclerview;

import android.app.ProgressDialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MyAdapter adapter;
    List<MyItem> itemList;
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
        String dbUrl = "https://api.myjson.com/bins/x6gys"; // "https://api.myjson.com/bins/1f19ec"; // json file url

        StringRequest request = new StringRequest(Request.Method.GET, dbUrl, // create request object for accessing table data using StringRequest constructor  // GET is a final or constant method of StringRequest class
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        progressDialog.dismiss(); // loading... message off

                        try {

                            JSONObject jsonObject = new JSONObject(response); // row object
                            JSONArray dbTable = jsonObject.getJSONArray("myData"); // mydata is a table name

                            for (int i=0; i < dbTable.length(); i++)
                            {
                                JSONObject row = dbTable.getJSONObject(i);

                                MyItem item = new MyItem(
                                        // get columns value
                                        row.getString("headerText"),
                                        row.getString("descriptionText"),
                                        row.getString("imageUrl")
                                );

                                itemList.add(item); // add row value in List<MyItem> itemList = new ArrayList<>();
                            }

                            adapter = new MyAdapter(itemList, getApplicationContext()); // create adapter for row value list. --- itemList
                            recyclerView.setAdapter(adapter); // set adapter in recycler view.

                            Toast.makeText(MainActivity.this, "Data Loaded Successfully!", Toast.LENGTH_SHORT).show();

                        }catch (JSONException e){

                            e.printStackTrace();

                        }
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
}





