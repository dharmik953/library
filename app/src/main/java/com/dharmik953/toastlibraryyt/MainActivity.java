package com.dharmik953.toastlibraryyt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dharmik953.toasty.toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        Button btn_ln = findViewById(R.id.button2);

        btn_ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toasty.Long(MainActivity.this,"toast in long");
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toasty.Short(MainActivity.this,"toast in short");
            }
        });
    }
}