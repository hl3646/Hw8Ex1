package com.example.hw8ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Button btn;
    Switch sw;
    ToggleButton tb;
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb = (ToggleButton) findViewById(R.id.toggleButton);
        sw = (Switch) findViewById(R.id.switch1);
        btn = (Button) findViewById(R.id.button);
        layout = (LinearLayout) findViewById(R.id.linear);
    }

    public void changeBackground(View view)
    {
        if(sw.isChecked() && tb.isChecked())
        {
            layout.setBackgroundResource(R.color.red);
        }
        else if(!(sw.isChecked()) && tb.isChecked())
        {
            layout.setBackgroundResource(R.color.blue);
        }
        else if(sw.isChecked() && !(tb.isChecked()))
        {
            layout.setBackgroundResource(R.color.green);
        }
        else
        {
            layout.setBackgroundResource(R.color.yellow);
        }
    }
}