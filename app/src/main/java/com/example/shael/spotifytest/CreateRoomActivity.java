package com.example.shael.spotifytest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class CreateRoomActivity extends Activity {

    private static final String EXTRA_ROOMNAME = "com.shael.shah.jukebox.EXTRA_ROOMNAME";
    private static final String EXTRA_HOSTNAME = "com.shael.shah.jukebox.EXTRA_HOSTNAME";
    private static final String EXTRA_PASSWORD = "com.shael.shah.jukebox.EXTRA_PASSWORD";
    private static final String EXTRA_PASSWORD_TEXT = "com.shael.shah.jukebox.EXTRA_PASSWORD_TEXT";

    private EditText roomNameEditText;
    private EditText hostNameEditText;
    private EditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_room);

        roomNameEditText = (EditText) findViewById(R.id.roomNameEditText);
        hostNameEditText = (EditText) findViewById(R.id.hostUsernameEditText);
        passwordEditText = (EditText) findViewById(R.id.passwordEditText);
    }

    public void enablePasswordEditText(View view) {
        CheckBox checkBox = (CheckBox) view;

        if (checkBox.isChecked())
            passwordEditText.setEnabled(true);
        else
            passwordEditText.setEnabled(false);
    }

    public void createRoom(View view) {
        Intent intent = new Intent(this, RoomActivity.class);
        intent.putExtra(EXTRA_ROOMNAME, roomNameEditText.getText().toString());
        intent.putExtra(EXTRA_HOSTNAME, hostNameEditText.getText().toString());

        if (passwordEditText.getText().length() != 0) {
            intent.putExtra(EXTRA_PASSWORD, true);
            intent.putExtra(EXTRA_PASSWORD_TEXT, passwordEditText.getText().toString());
        } else {
            intent.putExtra(EXTRA_PASSWORD, false);
        }

        startActivity(intent);
    }
}
