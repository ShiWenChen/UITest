package com.example.shiwen.uitest;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    private EditText edTest;
    RadioGroup radioGroup;


    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edTest = (EditText)findViewById(R.id.editText);

        Button btn = (Button) findViewById(R.id.btntest);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Context context = getApplicationContext();
                WifiManager wifiManager = (WifiManager)context.getSystemService(Context.WIFI_SERVICE);
                if (wifiManager != null){
                    int wifiState = wifiManager.getWifiState();

                    if (wifiState == WifiManager.WIFI_STATE_DISABLING) {
                        Log.i(TAG, "正在关闭");
                    } else if (wifiState == WifiManager.WIFI_STATE_ENABLING) {
                        Log.i(TAG, "正在打开");
                    } else if (wifiState == WifiManager.WIFI_STATE_DISABLED) {
                        Log.i(TAG, "已经关闭");
                    } else if (wifiState == WifiManager.WIFI_STATE_ENABLED) {
                        Log.i(TAG, "已经打开");
                    } else {
                        Log.i(TAG, "未知状态");
                    }
                }
                Log.d(TAG, "onClick: 最新提交哈哈哈");
//                Intent testInstent = new Intent(MainActivity.this,SecActivity.class);
//                testInstent.putExtra("传递数据",edTest.getText().toString());
//                startActivity(testInstent);
            }
        });


//        RadioGroup绑定事件
        radioGroup = (RadioGroup) findViewById(R.id.searchgroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                Log.d(TAG, "onCheckedChanged: "+checkedId);
//                if (checkedId%10000000 == 419){
//                    Log.d(TAG, "onCheckedChanged: 选项1");
//                }
            }
        });
    }
}
