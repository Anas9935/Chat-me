package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //Buttons for different types of users
    b1=(Button)findViewById(R.id.user);
    b2=(Button)findViewById(R.id.staff);

    //setting onClick listener on both buttons
        b1.setOnClickListener(new View.OnClickListener() {      //user
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,RestaurantsActivity.class);
                startActivity(intent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {      //staff
            @Override
            public void onClick(View v) {

            }
        });

    }

}
