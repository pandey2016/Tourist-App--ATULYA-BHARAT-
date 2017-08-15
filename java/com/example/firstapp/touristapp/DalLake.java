package com.example.firstapp.touristapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DalLake extends AppCompatActivity implements View.OnClickListener{

    Button btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dal_lake);

        btn2= (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(this);
        btn3= (Button) findViewById(R.id.button);
        btn3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v==btn2) {
            Toast.makeText(DalLake.this, "Timings: 9am – 6pm (Tuesday to Sunday)\n" +
                    "\n" +
                    "Entry Fee:\n" +
                    "\n" +
                    "INR 200 (Indians)\n" +
                    "INR 1000 (foreigners)\n" +
                    "Audio tour in Hindi/ English INR 60/100\n" +
                    "Photography: Allowed (Video INR 25)", Toast.LENGTH_LONG).show();
        }
        else if(v==btn3){

            Intent i=new Intent(DalLake.this,Choose.class);
            startActivity(i);
        }
    }
}
