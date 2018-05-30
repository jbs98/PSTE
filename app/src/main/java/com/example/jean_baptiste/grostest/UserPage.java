package com.example.jean_baptiste.grostest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserPage extends AppCompatActivity {

    private Button mRetour;
    private Button mControler;
    private Button mAjouter;
    private Button mHistorique;
    private Button mParametre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_page);

        mRetour = (Button) findViewById(R.id.retour_button);
        mControler = (Button) findViewById(R.id.controler_button);
        mAjouter = (Button) findViewById(R.id.ajouterachat_button);
        mHistorique = (Button) findViewById(R.id.historique_button);
        mParametre = (Button) findViewById(R.id.parametre_button);

        mParametre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Registration = new Intent(UserPage.this, registration.class );
                startActivity(Registration);
            }
        });

        mRetour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MainActivity = new Intent(UserPage.this, com.example.jean_baptiste.grostest.MainActivity.class);
                startActivity(MainActivity);
            }
        });

        mControler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ControlerBudget = new Intent(UserPage.this, com.example.jean_baptiste.grostest.ControlerBudget.class);
                startActivity(ControlerBudget);
            }
        });

        mAjouter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AjouterAchat = new Intent(UserPage.this, com.example.jean_baptiste.grostest.AjouterUnAchat.class);
                startActivity(AjouterAchat);
            }
        });

        mHistorique.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Historique = new Intent(UserPage.this, com.example.jean_baptiste.grostest.Historique.class);
                startActivity(Historique);
            }
        });


    }
}
