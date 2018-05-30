package com.example.jean_baptiste.grostest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class registration extends AppCompatActivity {

    private Button mRetour;
    private Button mModif;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        mRetour = (Button) findViewById(R.id.retour_button);
        mModif = (Button) findViewById(R.id.modifier_button);


        mRetour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Retour = new Intent(registration.this, UserPage.class);
                startActivity(Retour);
            }
        });

        mModif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Modifier = new Intent(registration.this, ModifierParametre.class);
                startActivity(Modifier);
            }
        });




    }
}
