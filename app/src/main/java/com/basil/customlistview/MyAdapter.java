package com.basil.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Products> data;

    public MyAdapter(Context context, ArrayList<Products> data) {
        this.context = context;
        this.data = data;
    }


    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Products getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.list_item, null);

        TextView name = view.findViewById(R.id.name_text);
        TextView price = view.findViewById(R.id.price_text);
        ImageView imageView = view.findViewById(R.id.image);
        //Button btn = view.findViewById(R.id.btn);

        final Products product = getItem(position);
        name.setText(product.getName());
        price.setText(product.getPrice());
        imageView.setImageResource(product.getImage());

        /*
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, product.getName() + "\n" + product.getPrice(), Toast.LENGTH_SHORT).show();
            }
        });
        */
        return view;
    }
}
