package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
   Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button=(Button)findViewById(R.id.button);
        Toast.makeText(getApplicationContext(),"success",Toast.LENGTH_LONG).show();
    }
}
