package com.example.quan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button Show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.baicu);
        Show = findViewById(R.id.Button);
        Show.setOnClickListener(new  myButton());
    }
    public void show(){
        Toast.makeText(getApplicationContext(), "Baats ngowf chuwa thawngf ...", Toast.LENGTH_LONG).show();
    }

}