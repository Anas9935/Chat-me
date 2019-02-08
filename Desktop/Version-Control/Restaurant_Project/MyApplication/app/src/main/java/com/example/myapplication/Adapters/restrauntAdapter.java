package com.example.myapplication.Adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.R;
import com.example.myapplication.objects.restraunts;

import java.util.ArrayList;

public class restrauntAdapter extends ArrayAdapter {
ArrayList<restraunts> list;
TextView name,address,offer,rating,offer2;
ImageView img;
    public restrauntAdapter(Context context, ArrayList<restraunts> list){
        super(context,0,list);
        this.list=list;
    }

    @Override
    public View getView(int position, View convertView,ViewGroup parent) {
        View view=convertView;
        if(view==null){
            view= LayoutInflater.from(getContext()).inflate(R.layout.restaurants_todo,parent,false);
        }
        restraunts current=list.get(position);
        name=(TextView)view.findViewById(R.id.resname);
        address=(TextView)view.findViewById(R.id.resaddress);
        offer=(TextView)view.findViewById(R.id.resoffer1);
        offer2=(TextView)view.findViewById(R.id.resoffer2);
        rating=(TextView)view.findViewById(R.id.resrating);
        img=(ImageView)view.findViewById(R.id.resimg);

        name.setText(current.getName());
        String ad;
        if(current.getAddress2().equals("")){
            ad=current.getAddress();
        }
        else ad=current.getAddress()+","+current.getAddress2();

        address.setText(ad);
        offer.setText(current.getOffer());
        offer2.setText(current.getOffer2());
        rating.setText(String.valueOf(current.getRating()));
       // Log.e("LOGTAG","id-"+current.getImgId()+":"+R.drawable.res1);
         img.setImageResource(current.getImgId());
        return view;
    }
}
