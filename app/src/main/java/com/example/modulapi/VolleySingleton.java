package com.example.modulapi;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class VolleySingleton {

    private static VolleySingleton aV;
    private RequestQueue mRequestQueue;
    private VolleySingleton(Context context) {
        mRequestQueue = Volley.newRequestQueue(context.getApplicationContext());
    }

    public static VolleySingleton getInstance(Context context) {

        if (aV == null) {

            aV = new VolleySingleton(context);
        }
        return aV;
    }

    public RequestQueue getRequestQueue(){
        return mRequestQueue;
    }

}
