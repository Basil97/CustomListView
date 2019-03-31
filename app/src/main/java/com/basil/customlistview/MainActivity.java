package com.basil.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Products> data = new ArrayList<>();
        data.add(new Products("Iphone 4", "4680 EGP", R.drawable.iphone_4));
        data.add(new Products("Iphone 5", "5550 EGP", R.drawable.iphone_5));
        data.add(new Products("Iphone 6", "6700 EGP", R.drawable.iphone_6));
        data.add(new Products("Iphone 7", "8200 EGP", R.drawable.iphone_7));
        data.add(new Products("Iphone 8", "9850 EGP", R.drawable.iphone_8));
        data.add(new Products("Iphone x", "11500 EGP", R.drawable.iphone_x));

        ListView listView = findViewById(R.id.list_View);
        listView.setAdapter(new MyAdapter(this, data));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, data.get(position).getName() + "\n" + data.get(position).getPrice(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
