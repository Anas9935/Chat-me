package com.example.myapplication.data;

import android.database.Cursor;

public class SQL_HELPER {
public static String insert(String table){
    String cons="";
    String vals="";
    switch (table) {
        case Contract_class.entry.TABLE_USERS:
            cons = Contract_class.entry.USER_NAME + "," + Contract_class.entry.USER_PASSWORD + "," + Contract_class.entry.USER_EMAIL + "," + Contract_class.entry.USER_CONTACT + "," + Contract_class.entry.USER_DESIGNATION + "," + Contract_class.entry.USER_GENDER;
            vals = "\'Ana\',\'12345\',\'anas@gmail.com\',123546789,0,0";
            break;
        case Contract_class.entry.TABLE_MENU:
            cons = Contract_class.entry.MENU_NAME + "," + Contract_class.entry.MENU_VEG + "," + Contract_class.entry.MENU_PRICE + "," + Contract_class.entry.MENU_INFO + "," + Contract_class.entry.MENU_OFFER;
            vals = "\'Halwa\',0,250,\'This is a Very good halwa and it tastes like shit and believe me you dont wnt to eat it\',15";
            break;
        case Contract_class.entry.TABLE_PAYMENT:
            cons = Contract_class.entry.PAYMENT_USER_ID + "," + Contract_class.entry.PAYMENT_TOTAL + "," + Contract_class.entry.PAYMENT_MODE + "," + Contract_class.entry.PAYMENT_STATUS + "," + Contract_class.entry.PAYMENT_TIME;
            vals = "1,250,0,0,125465242";
            break;
    }
    String st=" INSERT INTO "+table+" ("+cons+") VALUES("+vals+")";
    return st;
}
public static String select(String table){
    String st="SELECT * FROM "+table;
    return st;
}
public static String select(String table,String where){
    String st="SELECT "+Contract_class.entry.USER_DESIGNATION+","+Contract_class.entry.USER_PASSWORD+" FROM "+table+" WHERE "+Contract_class.entry.USER_NAME+"=\'"+where+"\'";
    return st;
}
public static String delete(String table,int val){
    String st="DELETE FROM "+table+" WHERE "+Contract_class.entry.MENU_ID+" ="+val;
    return st;
}
}
