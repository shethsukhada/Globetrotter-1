package com.example.globetrotter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

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

    }

    public void clickList(View view){
        Intent intent = new Intent(this,checkListActivity.class);
        startActivity(intent);
    }




}
