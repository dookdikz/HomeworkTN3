package com.example.dookdikz.homeworktn3;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by dookdikz on 8/12/2017.
 */

public class TapActivity extends AppCompatActivity {
    private TextView tvCountTap;
    private ImageView ivBtnTap;
    private int number;
    private int countNumber=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tap);
        setTitle("Tapper");
        number = getIntent().getIntExtra("number", 0);
        initInstance();
    }

    private void initInstance() {
        tvCountTap = (TextView) findViewById(R.id.tvCountTap);
        ivBtnTap = (ImageView) findViewById(R.id.ivBtnTab);
        ivBtnTap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countNumber += 1;
                tvCountTap.setText(String.valueOf(countNumber));
                if(countNumber>=number){
                    Intent intent = new Intent(TapActivity.this,MainActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);
                }
            }
        });
    }
}
