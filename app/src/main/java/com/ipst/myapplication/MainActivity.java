package com.ipst.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import com.google.firebase.firestore.FirebaseFirestore;

public class MainActivity extends AppCompatActivity {

    private EditText txtID, txtName, txtOwner, txtAdress;
    private ListView list;
    private Spinner spMascot;

    private FirebaseFirestore db;

    String[] MascotType ={"Dog","Fox","Cat","Raccoon","Horse","Hamster","Turtle","Bird"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LoadListFirestore();
        db = FirebaseFirestore.getInstance();

        txtID = findViewById(R.id.mascotID);
        txtName = findViewById(R.id.mascotName);
        txtOwner =findViewById(R.id.mascotOwner);
        txtAdress = findViewById(R.id.ownerAdress);

        spMascot = findViewById(spMascot);
        list = findViewById(R.id.listShow);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,
                MascotType);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spMascot.setAdapter(adapter);

    }

    public void LoadListFirestore(){

    }
}