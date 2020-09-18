package com.sematec.android.advanced.shahrivar99;

import android.os.Bundle;

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

    void printHello(){
        System.out.println("Hello");
    }
}