package com.example.globetrotter;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class checkListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_list);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(checkListActivity.this, AddActivity.class);
                startActivity(intent);
            }
        });

//        RecyclerView recyclerView = findViewById(R.id.recycler);
//        recyclerView.hasFixedSize();
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        ListHelper helper = new ListHelper(this);
//        Cursor cursor = helper.getReadableDatabase()
//                .query("checklist", null,null,null,null,null,null);
//
//        listAdapter adapter = new listAdapter(cursor);
//        recyclerView.setAdapter(adapter);
//    }
//
//
//    public class listAdapter extends RecyclerView.Adapter<listAdapter.listHolder>{
//
//        Cursor cursor;
//        public listAdapter(Cursor cursor){
//            this.cursor = cursor;
//        }
//        @NonNull
//        @Override
//        public listHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//
//
//            View view = getLayoutInflater().inflate(R.layout.check_item,parent,false);
//            return new listHolder(view);
//        }
//
//        @Override
//        public void onBindViewHolder(@NonNull listHolder holder, int position) {
//            cursor.moveToPosition(position);
//            String item = cursor.getString(cursor.getColumnIndex("cdata"));
//            holder.itemList.setText(item);
//
//        }
//
//        @Override
//        public int getItemCount() {
//            return cursor.getCount();
//        }
//
//        public class listHolder extends RecyclerView.ViewHolder{
//            TextView itemList;
//
//            public listHolder(@NonNull View itemView) {
//                super(itemView);
//                itemList = findViewById(R.id.item1);
//            }
//        }
    }
}
