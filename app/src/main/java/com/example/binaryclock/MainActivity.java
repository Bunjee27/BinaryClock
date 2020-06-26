package com.example.binaryclock;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.annotations.Nullable;
import java.util.*;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button clockButton = findViewById(R.id.submitBtn);
    }


    public void openViewPage(View view){
        Intent viewPage = new Intent(this, ViewingActivity.class);
        startActivity(viewPage);
    }

    public void openSubmitPage(View view){
        Intent submitPage = new Intent(this,FormActivity.class);
        startActivity(submitPage);
    }
}