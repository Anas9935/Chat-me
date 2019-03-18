package com.example.myapplication.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.objects.paymentObject;

import java.util.ArrayList;

public class PaymentAdapter extends RecyclerView.Adapter<PaymentAdapter.ViewHolder> {
    private Context context;
    private ArrayList<paymentObject> list;
    public PaymentAdapter(Context con, ArrayList<paymentObject> objs){
    context=con;
    list=objs;
}
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView id,uid,name,amt,status,mode,time;
        public ViewHolder(View view){
            super(view);
            id=view.findViewById(R.id.paymentIdTV);
            uid=view.findViewById(R.id.paymentuserid);
            name=view.findViewById(R.id.paymentuserName);
            amt=view.findViewById(R.id.paymentAmount);
            status=view.findViewById(R.id.paymentStatus);
            mode=view.findViewById(R.id.paymentmode);
            time=view.findViewById(R.id.paymenttime);


        }
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


}
