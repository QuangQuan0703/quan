package com.example.quan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.BaseBundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private EditText editText;
    private Button button, buttonShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.baicu);
        init();
        button.setOnClickListener(new buttonEvent());
        buttonShow.setOnClickListener(new buttonEvent());
    }

    public void init(){
        textView = (TextView) findViewById(R.id.textView);
        editText = (EditText) findViewById(R.id.eText);
        button = (Button) findViewById(R.id.Button);
        buttonShow = (Button)  findViewById(R.id.ButtonContent);
    }
}