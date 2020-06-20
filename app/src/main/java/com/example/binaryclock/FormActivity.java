package com.example.binaryclock;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class FormActivity extends AppCompatActivity {

    DatabaseReference databaseProtests;
    EditText titleEditText;
    EditText locationEditText;
    EditText timeEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        titleEditText = findViewById(R.id.protestTitle);
        locationEditText = findViewById(R.id.protestLocation);
        timeEditText = findViewById(R.id.protestTime);

        FirebaseDatabase database = FirebaseDatabase.getInstance();

        databaseProtests = database.getReference().child("protests");
    }

    public void createProtest(View view) {
        //get the string from the edittext field
        //push the message as a child to the messages object in the db
        String title = titleEditText.getText().toString();
        titleEditText.setText("");
        String location = locationEditText.getText().toString();
        locationEditText.setText("");
        String time = timeEditText.getText().toString();
        timeEditText.setText("");
        //TODO: push the message as a child to the messages object in the db
        Protest protest = new Protest(title, location, time);
        databaseProtests.push().setValue(protest);
    }
}
