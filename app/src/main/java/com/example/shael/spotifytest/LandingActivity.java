package com.example.shael.spotifytest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LandingActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
    }

    public void login(View view) {
        Intent intent = new Intent(this, MyLoginActivity.class);
        startActivity(intent);
    }

    //TODO: implement this function
    public void sendToCreateAccount(View view) {
        Intent intent = new Intent(this, CreateAccountActivity.class);
        startActivity(intent);
    }

    //TODO: implement this function
    public void sendToLogin(View view) {
        Intent intent = new Intent(this, MyLoginActivity.class);
        startActivity(intent);
    }

    public void guestContinue(View view) {
        Intent intent = new Intent(this, ChooseRoomActivity.class);
        startActivity(intent);
    }
}
