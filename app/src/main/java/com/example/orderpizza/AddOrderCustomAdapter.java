package com.example.orderpizza;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class AddOrderCustomAdapter extends ArrayAdapter {

    Button add;
    Button remove;

    //constructor method calls superclass constructor
    public AddOrderCustomAdapter(Context context, ArrayList pizzaSlice){
        super(context, 0, pizzaSlice);
    }

    @Override
    public View getView(final int position, View convertView, final ViewGroup parent) {
        //retrieve data from object

         final pizzaSlice type = (pizzaSlice) getItem(position);

        //create the views for this object
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.add_order_custom_adapter, parent, false);

        add = convertView.findViewById(R.id.addSlice);
        remove = convertView.findViewById(R.id.subtractSlice);

        add.setFocusable(false);
        remove.setFocusable(false);

        add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                type.setQuantity(type.getQuantity() + 1);
                update();
            }
        });

        this.notifyDataSetChanged();

        remove.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if (type.getQuantity() == 0) {
                    return;
                }
                type.setQuantity(type.getQuantity() - 1);
                update();
            }
        });

        TextView name = convertView.findViewById(R.id.sliceName);
        TextView price = convertView.findViewById(R.id.pricePerSlice);
        TextView quantity = convertView.findViewById(R.id.sliceAmount);

        //set the display values for the view from object data
        name.setText(type.getName());
        DecimalFormat demim = new DecimalFormat("0.00");
        price.setText("$"+demim.format(type.getPrice()));
        quantity.setText(Double.toString(type.getQuantity()));

        return convertView;

    }

    void update() {
        this.notifyDataSetChanged();
    }
}
