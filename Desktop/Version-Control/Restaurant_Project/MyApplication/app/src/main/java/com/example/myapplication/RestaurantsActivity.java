package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.myapplication.Adapters.restrauntAdapter;
import com.example.myapplication.objects.restraunts;

import java.util.ArrayList;
import java.util.List;

public class RestaurantsActivity extends AppCompatActivity {
ListView lv;
restrauntAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        lv=(ListView)findViewById(R.id.resList);
        ArrayList<restraunts> restraunts=new ArrayList<>();
        restraunts.add(new restraunts(1,"AL-Jawahar","NFC community center","10% off on your first appointment","Kathi Roll at just ₹95",
                3.5F,R.drawable.res1));
        adapter=new restrauntAdapter(this,restraunts);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(RestaurantsActivity.this,MenuActivity.class);
                startActivity(intent);
            }
        });

    }
}
