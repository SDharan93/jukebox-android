package com.example.shael.spotifytest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class TestActivity extends Activity {

    private TextView testTextView;
    private Button testButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        testTextView = (TextView) findViewById(R.id.testTextView);
        testButton = (Button) findViewById(R.id.testButton);
    }

    public void testClick(View view) {
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "http://192.168.0.18:4000/requests";
        //String url = "https://www.google.ca";

        StringRequest stringRequest = new StringRequest(Request.Method.POST, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        testTextView.setText("Response: " + response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        testTextView.setText("It didn't work!");
                    }
                }
        ){
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<>();
                params.put("USERNAME", "username");
                params.put("PASSWORD", "password");
                params.put("EMAIL", "email");
                return params;
            }
        };

        queue.add(stringRequest);
    }
}
