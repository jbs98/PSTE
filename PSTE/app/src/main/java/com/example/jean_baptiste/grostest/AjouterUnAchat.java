package com.example.jean_baptiste.grostest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AjouterUnAchat extends AppCompatActivity {

    private Button mRetour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajouter_un_achat);

        mRetour = (Button) findViewById(R.id.retour_button);

        mRetour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent retour = new Intent(AjouterUnAchat.this, UserPage.class);
                startActivity(retour);
            }
        });
    }
}
