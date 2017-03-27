package com.example.shael.spotifytest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class CreateRoomActivity extends Activity {

    private EditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_room);

        passwordEditText = (EditText) findViewById(R.id.passwordEditText);
    }

    public void enablePasswordEditText(View view) {
        CheckBox checkBox = (CheckBox) view;

        if (checkBox.isChecked()) {
            passwordEditText.setEnabled(true);
        } else {
            passwordEditText.setEnabled(false);
        }
    }

    public void createRoom(View view) {

    }
}
