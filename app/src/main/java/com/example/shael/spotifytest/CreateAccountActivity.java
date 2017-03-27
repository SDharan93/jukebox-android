package com.example.shael.spotifytest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CreateAccountActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
    }

    //TODO: implement this function
    public void createNewAccount(View view) {
        Intent intent = new Intent(this, RoomActivity.class);
        startActivity(intent);
    }

    //TODO: implement this function
    public void sendToAccountLogin(View view) {
        Intent intent = new Intent(this, MyLoginActivity.class);
        startActivity(intent);
    }
}
