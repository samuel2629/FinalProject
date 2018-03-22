package com.silho.ideo.myandroidjokeslib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static final String INTENT_JOKE = "intent_joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        String joke = getIntent().getStringExtra(INTENT_JOKE);
        TextView textViewJoke = findViewById(R.id.textview_joke);
        textViewJoke.setText(joke);
    }
}
