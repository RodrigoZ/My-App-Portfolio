package com.example.rodri.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toastMssg (CharSequence txt){
        Context context = getApplicationContext();
        CharSequence text = txt;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void viewMovies(View view){
        CharSequence display = "This button will launch my Popular Movies app!";
        toastMssg(display);
    }

    public void viewStock(View view){
        CharSequence display = "This button will launch my Stock Hawk app!";
        toastMssg(display);
    }

    public void viewBigger(View view){
        CharSequence display = "This button will launch my Build it Bigger app!";
        toastMssg(display);
    }

    public void viewMaterial(View view){
        CharSequence display = "This button will launch my Make Your App Material app!";
        toastMssg(display);
    }

    public void viewGo(View view){
        CharSequence display = "This button will launch my Go Ubiquitous app!";
        toastMssg(display);
    }

    public void viewCapstone(View view){
        CharSequence display = "This button will launch my Capstone app!";
        toastMssg(display);
    }
}