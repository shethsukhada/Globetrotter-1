package com.example.globetrotter;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddNewTravelActivity extends AppCompatActivity implements View.OnClickListener {

    FirebaseApp mApp;
    FirebaseDatabase mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_travel);

        // Buttons sukhada
        findViewById(R.id.asia).setOnClickListener(this);
        findViewById(R.id.africa).setOnClickListener(this);
        findViewById(R.id.northAmerica).setOnClickListener(this);
        findViewById(R.id.southAmerica).setOnClickListener(this);
        findViewById(R.id.europe).setOnClickListener(this);

        addListenerOnSpinnerItemSelection();

    }

    public void clickList(View view) {
        Intent intent = new Intent(this, checkListActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        Spinner spinner = (Spinner) findViewById(R.id.country_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.europe_array, android.R.layout.simple_spinner_item);

        int i = v.getId();
        if (i == R.id.europe) {
// Create an ArrayAdapter using the string array and a default spinner layout
            adapter = ArrayAdapter.createFromResource(this,
                    R.array.europe_array, android.R.layout.simple_spinner_item);
        } else if (i == R.id.asia) {
            // Create an ArrayAdapter using the string array and a default spinner layout
            adapter = ArrayAdapter.createFromResource(this,
                    R.array.asia_array, android.R.layout.simple_spinner_item);
        } else if (i == R.id.southAmerica) {
// Create an ArrayAdapter using the string array and a default spinner layout
            adapter = ArrayAdapter.createFromResource(this,
                    R.array.south_america_array, android.R.layout.simple_spinner_item);
        } else if (i == R.id.northAmerica) {
// Create an ArrayAdapter using the string array and a default spinner layout
            adapter = ArrayAdapter.createFromResource(this,
                    R.array.north_america_array, android.R.layout.simple_spinner_item);
        } else if (i == R.id.africa) {
// Create an ArrayAdapter using the string array and a default spinner layout
            adapter = ArrayAdapter.createFromResource(this,
                    R.array.africa_array, android.R.layout.simple_spinner_item);
        }

        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
    }


    public void addListenerOnSpinnerItemSelection() {
        Spinner spinner1 = (Spinner) findViewById(R.id.country_spinner);
        spinner1.setOnItemSelectedListener(new CustomOnItemSelectedListener());
    }
}


