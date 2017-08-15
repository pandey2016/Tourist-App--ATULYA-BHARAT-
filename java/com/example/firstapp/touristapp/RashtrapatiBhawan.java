package com.example.firstapp.touristapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RashtrapatiBhawan extends AppCompatActivity implements View.OnClickListener{

    Button btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rashtrapati_bhawan);
        btn2= (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(this);
        btn3= (Button) findViewById(R.id.button);
        btn3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v==btn2) {
            Toast.makeText(RashtrapatiBhawan.this, "Timings: 9am – 6pm (Tuesday to Sunday)\n" +
                    "\n" +
                    "Entry Fee:\n" +
                    "\n" +
                    "INR 10 (Indians)\n" +
                    "INR 150 (foreigners)\n" +
                    "Audio tour in Hindi/ English INR 60/100\n" +
                    "Photography: Allowed (Video INR 25)", Toast.LENGTH_LONG).show();
        }
        else if(v==btn3){

            Intent i=new Intent(RashtrapatiBhawan.this,Choose.class);
            startActivity(i);
        }
    }
    }

