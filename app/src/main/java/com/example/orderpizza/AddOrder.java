package com.example.orderpizza;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class AddOrder extends AppCompatActivity {

    ArrayList pizzas;
    ListView lv;
    AddOrderCustomAdapter ca;

    Button submit;

    public Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_order);

        pizzas = new ArrayList<pizzaSlice>();

        pizzas.add(new pizzaSlice("Cheese", 1.5, 0));
        pizzas.add(new pizzaSlice("Pepperoni", 2, 0));

        lv = findViewById(R.id.pizzaTypes);
        ca = new AddOrderCustomAdapter(this, pizzas);
        lv.setAdapter(ca);

        submit = findViewById(R.id.submitOrder);

    }

    public void setSubmit(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
