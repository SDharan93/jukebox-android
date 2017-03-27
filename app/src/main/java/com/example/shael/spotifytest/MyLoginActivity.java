package com.example.shael.spotifytest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MyLoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_login);
    }

    //TODO: implement this function
    public void checkCredentials(View view) {
        Intent intent = new Intent(this, RoomActivity.class);
        startActivity(intent);
    }

    //TODO: implement this function
    public void forgotPassword(View view) {

    }

    //TODO: implement this function
    public void sendToAccountCreation(View view) {
        Intent intent = new Intent(this, CreateAccountActivity.class);
        startActivity(intent);
    }
}
