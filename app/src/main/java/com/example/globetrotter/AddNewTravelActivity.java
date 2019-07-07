package com.example.globetrotter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddNewTravelActivity extends AppCompatActivity {

    FirebaseApp mApp;
    FirebaseDatabase mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_travel);
        initFirebase();
        readData();
    }



    private void initFirebase() {
        mApp = FirebaseApp.getInstance();
        mDatabase = FirebaseDatabase.getInstance(mApp);

    }

    private void readData() {
    }

    private void writeData(){
        DatabaseReference ref = mDatabase.getReference("travelD").child("datetime");

    }
}
