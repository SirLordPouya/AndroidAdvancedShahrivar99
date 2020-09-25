package com.sematec.android.advanced.shahrivar99;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    int age = 30;
    long height;  //0
    String name = "Pouya";
    String family; // null
    int weight = 100;
    String address = "";
    final ArrayList<String> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtHello = findViewById(R.id.txtHello);


        MainActivityKotlin koltlin = new MainActivityKotlin();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //
                //
            }
        }, 500);

//        Handler handler = new Handler();
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        }, 500);


        // this == this class
        txtHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "text", Toast.LENGTH_SHORT).show();
            }
        });

        System.out.println(height * 100);

        char a = family.charAt(3);
        System.out.println(family);

        weight = 200;
        address = "alksdjalskj";

        // list = new ArrayList<>();
        list.add("");
    }

    // (visibility modifier) returnType functionName(){}

    String getHello() {
        return "Hello";
    }


    int calculateUserAge(int birthYear) {
        return 2020 - birthYear;
    }

    void printHello() {
        System.out.println("Hello");
    }

    void testSwitch() {
        int a = 5;
        switch (a){
            case 1: //
                //
                break;
            case 2:
                //
                //
                break;
            case 3:
            case 4:
            case 5:
                //
                //
                //
                break;
            default:
                //
                //
        }
    }

    void testFor(){

        // i = i + 2 ======== i+=2
        for (int i = 0; i < 10; i+=2) {

        }
    }
}