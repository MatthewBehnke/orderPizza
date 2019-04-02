package com.example.orderpizza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button addPerson;
    Button restart;
    Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addPerson = findViewById(R.id.createPerson);
        restart = findViewById(R.id.reset);
        calculate = findViewById(R.id.calculate);
    }


    public void setAddPerson(View v) {
        Intent intent = new Intent(this, AddPerson.class);
        startActivity(intent);
    }

    public void setRestart(View v) {

    }

    public void setCalculate(View v) {
        Intent intent = new Intent(this, Caculate.class);
        startActivity(intent);
    }

}
