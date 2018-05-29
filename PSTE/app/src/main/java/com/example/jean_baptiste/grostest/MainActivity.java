package com.example.jean_baptiste.grostest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mContinuer;
    private Button mQuitter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContinuer = findViewById(R.id.continuer_button);
        mQuitter = findViewById(R.id.quitter_button);

        mContinuer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent userPage = new Intent(MainActivity.this, UserPage.class);
                startActivity(userPage);
            }
        });

        mQuitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            closeContextMenu();
            }
        });
    }
}
