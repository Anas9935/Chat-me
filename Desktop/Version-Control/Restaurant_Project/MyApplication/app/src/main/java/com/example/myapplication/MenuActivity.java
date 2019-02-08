package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuAdapter;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.myapplication.Adapters.menuAdapter;
import com.example.myapplication.objects.menuitem;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {
Button app,pay;
ListView menulv;
menuAdapter adapter;
ArrayList<menuitem> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        app=(Button)findViewById(R.id.menuappointment);
        pay=(Button)findViewById(R.id.menupay);
        menulv=(ListView)findViewById(R.id.menulist);


        list=new ArrayList<>();
        list.add(new menuitem(R.drawable.res1,0,"Veg Harayanwi Roll",249));
        adapter=new menuAdapter(this,list);
        menulv.setAdapter(adapter);


        app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
