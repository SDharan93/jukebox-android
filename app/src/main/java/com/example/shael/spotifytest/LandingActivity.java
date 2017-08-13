package com.example.shael.spotifytest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toolbar;

public class LandingActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        Toolbar toolbar = (Toolbar) findViewById(R.id.landingActivityToolbar);
        setActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.landing_activity_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.open_test_activity:
                Intent openSettingsIntent = new Intent(this, TestActivity.class);
                startActivity(openSettingsIntent);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
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
