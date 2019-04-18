package com.example.orderpizza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button addPerson;
    Button settings;
    Button calculate;

    ArrayList orders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addPerson = findViewById(R.id.createPerson);
        settings = findViewById(R.id.settings);
        calculate = findViewById(R.id.calculate);

        orders = new ArrayList<pizzaSlice>();
        orders.add(new pizzaSlice("test",1,23));

    }


    public void setAddPerson(View v) {
        Intent intent = new Intent(this, AddOrder.class);
        startActivity(intent);
    }

    public void setSettings(View v) {

    }

    public void setCalculate(View v) {
        Intent intent = new Intent(this, Caculate.class);
        startActivity(intent);
    }

}
