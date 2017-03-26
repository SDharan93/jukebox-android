package com.example.shael.spotifytest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View view) {

    }

    public void createAccount(View view) {

    }

    public void guestContinue(View view) {
        Intent intent = new Intent(this, RoomActivity.class);
        startActivity(intent);
    }
}
