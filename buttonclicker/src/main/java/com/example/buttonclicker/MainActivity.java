package com.example.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
   //Button button = findViewById(R.id.btnItIsNotMe);
    //TextView textView = findViewById(R.id.tvOut);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void onButtonClick (View view) {
            Toast.makeText(this, "Мой номер по списку № X", Toast.LENGTH_SHORT).show();
            TextView textView = findViewById(R.id.tvOut);
            textView.setText("И ЧЁ?!");
        }
        public void onButtonClick2 (View view) {
            Toast.makeText(this, "Это не я сделал", Toast.LENGTH_SHORT).show();
            TextView textView = findViewById(R.id.tvOut);
            textView.setText("ТОГДА КТО?!");


        }


    }
