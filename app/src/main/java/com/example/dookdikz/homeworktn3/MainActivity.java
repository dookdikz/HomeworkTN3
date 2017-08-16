package com.example.dookdikz.homeworktn3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView btnPlay;
    private EditText etNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initInstance();
    }

    private void initInstance() {
        btnPlay = (ImageView) findViewById(R.id.ivBtnPlay);
        etNumber = (EditText) findViewById(R.id.etNumber);
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!etNumber.getText().toString().equals("")) {
                    int numberInt = 0;
                    try {
                        numberInt = Integer.parseInt(etNumber.getText().toString());
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }

                    Intent intent = new Intent(MainActivity.this,TapActivity.class);
                    intent.putExtra("number", numberInt);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(MainActivity.this,"Please input number",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
