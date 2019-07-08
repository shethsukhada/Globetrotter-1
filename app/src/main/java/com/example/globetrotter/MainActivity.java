package com.example.globetrotter;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private static final int RESULT_LOGIN = 50;
    public boolean login = false;

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if (requestCode == RESULT_LOGIN){
//            if (resultCode != RESULT_OK){
//                finish();
//            }
//        }
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (!login){
            Intent intent = new Intent(this,registerActivity.class);
            startActivityForResult(intent,RESULT_LOGIN);
        }



        FloatingActionButton fab = (FloatingActionButton)findViewById(R.id.flo);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,AddNewTravelActivity.class);
                startActivity(intent);
            }
        });

    }


}
