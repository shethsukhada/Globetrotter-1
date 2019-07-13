
package com.example.globetrotter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
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
            Toast.makeText(this,"Task Added",Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(this,"Failed To Add Task",Toast.LENGTH_LONG).show();
        }
        Intent intent = new Intent(AddActivity.this, checkListActivity.class) ;
        startActivity(intent);
    }

    //using SQLite
}
