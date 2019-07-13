package com.example.globetrotter;

import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.example.globetrotter.Travel;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class firebasedatabasehelper_temp {

    private FirebaseDatabase mDatabase;
    private DatabaseReference mReferenceTravel;
    private List<Travel> travel =  new ArrayList<>();


    public firebasedatabasehelper_temp(){

        mDatabase = FirebaseDatabase.getInstance();
        mReferenceTravel = mDatabase.getReference("globletrotter");
        Log.d("adadsa","object creation");


    }

    public interface DataStatus{
        void DataIsLoaded(List<Travel> travel, List<String> keys);
        void DataIsInserted();
        void DataIsUpdated();
        void DataIsDeleted();
    }

    public void read_travel(final DataStatus dataStatus) {
        mReferenceTravel.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                travel.clear();
                List<String> keys = new ArrayList<>();
                for(DataSnapshot keyNode : dataSnapshot.getChildren()){
                    keys.add(keyNode.getKey());
                    Travel travel_l = keyNode.getValue(Travel.class);
                    Log.d("adadsa" , travel_l.getCity());
                    travel.add(travel_l);
                }
                dataStatus.DataIsLoaded(travel,keys);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    public void add_tarvel_fb(Travel travel, final DataStatus dataStatus ){
        String key = mReferenceTravel.push().getKey();
        mReferenceTravel.child(key).setValue(travel)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        dataStatus.DataIsInserted();
                    }
                });
     Log.d("adadsa" , key);
    }
}
