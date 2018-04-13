package com.example.hunter.mybloodcall;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.facebook.stetho.Stetho;

public class MainActivity extends AppCompatActivity {

    Button findDonor;
    Button beDonor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Stetho.initializeWithDefaults(this);
        setContentView(R.layout.activity_main);

//        findDonor =(Button)findViewById(R.id.findDonor);
//        findDonor.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.d("hey", "Clicked");
//                startActivity(new Intent(MainActivity.this, findDonor.class));
//            }
//        });
//
//        beDonor =(Button)findViewById(R.id.beDonor);
//        beDonor.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.d("help","help");
//                startActivity(new Intent(MainActivity.this, beDonor.class));
//            }
//        });
    }



    public void findDonor(View view) {
        Log.d("hey", "Clicked");
        startActivity(new Intent(MainActivity.this, findDonor.class));

    }

    public void beDonor(View view) {
        Log.d("hey", "Button2 Clicked");
        startActivity(new Intent(MainActivity.this, beDonor.class));
    }
}