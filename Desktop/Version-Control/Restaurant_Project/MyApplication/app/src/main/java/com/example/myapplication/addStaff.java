package com.example.myapplication;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.data.Contract_class;
import com.example.myapplication.data.SQL_HELPER;
import com.example.myapplication.data.dbHelper;

public class addStaff extends AppCompatActivity {
EditText name,add1,add2,add3,con1,con2,salary,doj;
dbHelper helper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_staff);

        name=(EditText)findViewById(R.id.staff_nameXML);
        add1=(EditText)findViewById(R.id.staff_add1);
        add2=(EditText)findViewById(R.id.staff_add2);
        add3=findViewById(R.id.staff_add3);
        con1=(EditText)findViewById(R.id.staff_no1);
        con2=(EditText)findViewById(R.id.staff_no2);
        salary=(EditText)findViewById(R.id.staff_salary);
        doj=(EditText)findViewById(R.id.staff_doj);
    }
private void save(){
//insert in the database
    SQLiteDatabase db=helper.getWritableDatabase();
    String inserting= SQL_HELPER.insert(Contract_class.entry.TABLE_STAFF);
    db.execSQL(inserting);
    Toast.makeText(this, "Staff entered", Toast.LENGTH_SHORT).show();

}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.staff_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.action_save:{
                save();
                finish();
                return true;
            }
            default:{
                return super.onOptionsItemSelected(item);
            }
        }
    }
}
