package com.example.shael.spotifytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import java.util.ArrayList;
import java.util.List;

public class JoinRoomActivity extends AppCompatActivity {

    private ScrollView roomScrollView;
    private LinearLayout roomLinearLayout;

    private final List<String> rooms = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_room);

        rooms.add("Shane's Party People");
        rooms.add("Abjay's Patty Tings");
        rooms.add("Cho Birthday Party");
        rooms.add("Tina House");
        rooms.add("Cho Birthday Party");

        roomScrollView = (ScrollView) findViewById(R.id.roomScrollView);
        roomLinearLayout = (LinearLayout) roomScrollView.findViewById(R.id.roomLinearLayout);

        for (String s : rooms) {
            Button button = new Button(this);
            button.setText(s);
            button.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

            roomLinearLayout.addView(button);
        }

    }
}
