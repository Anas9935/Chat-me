package com.example.myapplication.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.objects.menuitem;

import java.util.ArrayList;

public class menuAdapter extends ArrayAdapter {
    private ArrayList<menuitem> list;
    private ImageView main,type;
    private TextView name,price,plus,minus,quantity;
    private Button add;
    private LinearLayout ll;
    boolean addbtn=false;
    int qty=0;

    public menuAdapter(Context context, ArrayList<menuitem> list){
        super(context,0,list);
        this.list=list;
    }

    @Override
    public View getView(int position, View convertView,ViewGroup parent) {
       View view=convertView;
       if(view==null){
           view= LayoutInflater.from(getContext()).inflate(R.layout.menu_todo,parent,false);
       }
        menuitem current=list.get(position);

        main=(ImageView)view.findViewById(R.id.menuimg);
        type=(ImageView)view.findViewById(R.id.menuveg);
        name=(TextView)view.findViewById(R.id.menuname);
        price=(TextView)view.findViewById(R.id.menuprice);
        plus=(TextView)view.findViewById(R.id.menuaddplus);
        minus=(TextView)view.findViewById(R.id.menuaddminus);
        quantity=(TextView)view.findViewById(R.id.menuqty);
        add=(Button)view.findViewById(R.id.menuadd);
        ll=(LinearLayout)view.findViewById(R.id.menuaddlayout);

      //  main.setImageResource(current.getImgid());
        switch(current.getType()){
            case 0:{
               // type.setImageResource(R.drawable.veg);
                break;
            }
            case 1:{
                //add non veg mark
               // type.setImageResource(R.drawable.nonveg);
                break;
            }
        }
        name.setText(current.getName());
        price.setText(String.valueOf(current.getPrice()));

        if(!addbtn){
            add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    closeadd();
                    increement();
                }
            });
        }
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increement();
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decreement();
            }
        });

       return view;
    }
    private void closeadd(){
        addbtn=true;
        add.setVisibility(View.INVISIBLE);
        ll.setVisibility(View.VISIBLE);
    }
    private void openadd(){
        addbtn=false;
        add.setVisibility(View.VISIBLE);
        ll.setVisibility(View.INVISIBLE);
    }
    void increement(){
     qty++;
     display();
    }
    void decreement(){
        qty--;
        if(qty<1)
            openadd();
        display();
    }
    void display(){
        quantity.setText(String.valueOf(qty));
    }
}
