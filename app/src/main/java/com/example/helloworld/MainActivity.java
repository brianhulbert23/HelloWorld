package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        public void on_click(View v) {
            TextView tv = (TextView) findViewById(R.id.msg);
            Button btn = (Button) findViewById(R.id.clickherebtn);

            tv.setText("Hello World");
        }
}