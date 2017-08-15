package com.example.firstapp.touristapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Choose extends AppCompatActivity implements ListView.OnItemClickListener {
  String str[]={"Red Fort","Golden Temple","Rashtrapati Bhavan","Raj Ghat","Qutub Minar","Akshardham","India Gate",
          "Gateway Of India","Dal Lake","Hawa Mahal","Taj Mahal"};
  ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose);

        listview=(ListView) findViewById(R.id.listView);//find view by id :)


        ArrayAdapter<String> adapter=new  ArrayAdapter<String>(this,android.R.layout.select_dialog_singlechoice,str);

        listview.setAdapter(adapter);
        listview.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long l) {


            if(i==0) {
                Intent i1 = new Intent(Choose.this,RedFort.class);
                startActivity(i1);
                Toast.makeText(Choose.this,"Red Fort", Toast.LENGTH_SHORT).show();
            }
             else if(i==1) {
             Intent i1 = new Intent(Choose.this,GoldenTemple.class);
             startActivity(i1);
                Toast.makeText(Choose.this,"Golden Temple", Toast.LENGTH_SHORT).show();

            }
            else if(i==2) {
                Intent i1 = new Intent(Choose.this,RashtrapatiBhawan.class);
                startActivity(i1);
                Toast.makeText(Choose.this,"Rashtrpati Bhavan", Toast.LENGTH_SHORT).show();

            }
            else if(i==3) {
                Intent i1 = new Intent(Choose.this,RajGhat.class);
                startActivity(i1);
                Toast.makeText(Choose.this,"Raj Ghat", Toast.LENGTH_SHORT).show();

            }
            else if(i==4) {
                Intent i1 = new Intent(Choose.this,QutubMinar.class);
                startActivity(i1);
                Toast.makeText(Choose.this,"Qutub Minar", Toast.LENGTH_SHORT).show();

            }
            else if(i==5) {
                Intent i1 = new Intent(Choose.this,Akshardham.class);
                startActivity(i1);
                Toast.makeText(Choose.this,"Akshardham", Toast.LENGTH_SHORT).show();

            } else if(i==6) {
                Intent i1 = new Intent(Choose.this,IndiaGate.class);
                startActivity(i1);
                Toast.makeText(Choose.this,"India Gate", Toast.LENGTH_SHORT).show();

            } else if(i==7) {
                Intent i1 = new Intent(Choose.this,GatewayOfIndia.class);
                startActivity(i1);
                Toast.makeText(Choose.this,"Gateway Of India", Toast.LENGTH_SHORT).show();

            }
            else if(i==8) {
                Intent i1 = new Intent(Choose.this,DalLake.class);
                startActivity(i1);
                Toast.makeText(Choose.this,"Dal Lake", Toast.LENGTH_SHORT).show();

            }
            else if(i==9) {
                Intent i1 = new Intent(Choose.this,HawaMahal.class);
                startActivity(i1);
                Toast.makeText(Choose.this,"Hawa Mahal", Toast.LENGTH_SHORT).show();

            }else if(i==10) {
                Intent i1 = new Intent(Choose.this,TajMahal.class);
                startActivity(i1);
                Toast.makeText(Choose.this,"Taj Mahal", Toast.LENGTH_SHORT).show();

            }

    }
}
