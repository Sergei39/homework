package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if (!RecyclerFragment.isFragment)    // создаем фрагмент если он еще не был создан
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fr, new RecyclerFragment())
                    .commit();

    }
}
