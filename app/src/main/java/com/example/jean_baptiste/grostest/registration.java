package com.example.jean_baptiste.grostest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class registration extends AppCompatActivity {

    private Button mRetour;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        mRetour = (Button) findViewById(R.id.retour_button);

        mRetour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Retour = new Intent(registration.this, UserPage.class);
                startActivity(Retour);
            }
        });


    }
}
