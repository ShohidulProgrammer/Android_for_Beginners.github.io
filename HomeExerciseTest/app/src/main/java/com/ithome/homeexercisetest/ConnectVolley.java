package com.ithome.homeexercisetest;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class ConnectVolley {

    // initialization
    private static ConnectVolley mInstance;
    private RequestQueue requestQueue;
    private static Context context;

    //constructor
    public ConnectVolley(Context context) {
        this.context = context;
        requestQueue = getRequestQueue();
    }

    public RequestQueue getRequestQueue() {
        if (requestQueue == null)
        {
            requestQueue = Volley.newRequestQueue(context.getApplicationContext());
        }
        return requestQueue;
    }

    public static synchronized ConnectVolley getmInstance(Context context)
    {
        if (mInstance == null)
        {
            mInstance = new ConnectVolley(context);
        }
        return mInstance;
    }

    public<T> void addToRequestQueue(Request<T> request)
    {
        requestQueue.add(request);
    }
}
