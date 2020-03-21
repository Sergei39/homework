package com.example.homework;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if (savedInstanceState == null) {
            RecyclerFragment.count = 101;
        }
        else {
            RecyclerFragment.count = savedInstanceState.getInt("data");
        }

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fr, new RecyclerFragment())
                .commit();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putInt("data", RecyclerFragment.count);
        super.onSaveInstanceState(outState);
    }
}
