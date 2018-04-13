package com.example.hunter.mybloodcall;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by HuNter on 4/2/2018.
 */

public class beDonor extends AppCompatActivity {
    dbhelper mydb;
    DatabaseReference databaseDonor;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.bedonor);
//        Log.d("Hey","Im wanna be Donor");
        mydb = new dbhelper(this);
        databaseDonor = FirebaseDatabase.getInstance().getReference("donors");
    }

    public void Donorform(View view) {

        EditText name = (EditText) findViewById(R.id.et_Name);
        EditText sex = (EditText) findViewById(R.id.et_sex);
        EditText city = (EditText) findViewById(R.id.dropdownCity);
        EditText bloodGroup = (EditText) findViewById(R.id.dropdownGroup);
        EditText phNumber = (EditText) findViewById(R.id.edt_mobileNumber);

        String Name = name.getText().toString().toUpperCase();
        String Sex = sex.getText().toString().toUpperCase();
        String City = city.getText().toString().toUpperCase();
        String BloodGroup = bloodGroup.getText().toString().toUpperCase();
        String Phoneno = phNumber.getText().toString();
//        Log.d("Name",Name);
//      boolean isInserted =  mydb.insertDonor(Name,Sex,City,BloodGroup,Phoneno);
//        if (isInserted == true) {
//            Toast.makeText(beDonor.this, "Data Inserted", Toast.LENGTH_LONG).show();
//        } else {
//            Toast.makeText(beDonor.this, "Data Insert Failed", Toast.LENGTH_LONG).show();
//            }
//        }

        if(Name != null || Sex != null || City != null || BloodGroup != null || Phoneno != null)
        {
              String id = databaseDonor.push().getKey();
              firebaseDBhelper donorDB = new firebaseDBhelper(id,Name,Sex,City,BloodGroup,Phoneno);
              databaseDonor.child(City).child(BloodGroup).push().setValue(donorDB);
              Toast.makeText(this,"Data Inserted",Toast.LENGTH_LONG).show();

        }else{
            Toast.makeText(this,"Enter Proper Data",Toast.LENGTH_LONG).show();
        }
    }


}
