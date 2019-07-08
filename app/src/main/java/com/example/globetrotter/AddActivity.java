package com.example.globetrotter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddActivity extends AppCompatActivity {

    EditText itemCheck;
    EditText itemAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        itemCheck = findViewById(R.id.item);
        itemAmount = findViewById(R.id.amount);

    }
    public void add(View view){
        String item = itemCheck.getText().toString();
        int amount = Integer.parseInt(itemAmount.getText().toString());

        // saving data
        ListHelper helper = new ListHelper(this);
        ContentValues values = new ContentValues();
        values.put("citem",item);
        values.put("amount",amount);
        long id = helper.getWritableDatabase()
                .insert("checklist",null,values);

        if (id > -1){
            Toast.makeText(this,"adding complete",Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(this,"failed",Toast.LENGTH_LONG).show();
        }
    }

    //using SQLite
}
