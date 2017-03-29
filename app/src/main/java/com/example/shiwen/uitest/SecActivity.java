package com.example.shiwen.uitest;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(getIntent().getStringExtra("传递数据"));
        ImageView ivTest = (ImageView) findViewById(R.id.ivTest);
        ivTest.setBackgroundResource(R.drawable.starimage);

    }
}
