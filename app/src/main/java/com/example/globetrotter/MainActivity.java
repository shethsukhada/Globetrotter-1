package com.example.globetrotter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.globetrotter.dummy.DummyContent;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity implements MapViewFragment.OnFragmentInteractionListener, TravelPlanFragment.OnListFragmentInteractionListener,NewsFragment.OnListFragmentInteractionListener {

    ViewPager mViewPager;
    FragmentAdapter adapter;
    FirebaseDatabase mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initViewPager();
        initDatabaseTravel();

        FloatingActionButton fab = (FloatingActionButton)findViewById(R.id.flo);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,AddNewTravelActivity.class);
                startActivity(intent);

            }
        });

    }

    private void initDatabaseTravel() {
        mDatabase = FirebaseDatabase.getInstance();
        DatabaseReference ref = mDatabase.getReference("globletrotter");

        ValueEventListener listener = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot child : dataSnapshot.getChildren()){
                    

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
    }

    private void initViewPager() {
        mViewPager = findViewById(R.id.viewPager);
        adapter = new FragmentAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(adapter);
    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void onTravelListFragmentInteraction(DummyContent.DummyItem item) {

    }

    @Override
    public void onNewsListFragmentInteraction(DummyContent.DummyItem item) {

    }
}
