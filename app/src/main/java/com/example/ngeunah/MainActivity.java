package com.example.ngeunah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button pesanApps;
    private Button pesanPhone;
    //deklarasi btn review


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout  mLinearLayout1 = (LinearLayout)findViewById(R.id.transparanButton);
        mLinearLayout1.setBackgroundColor(Color.TRANSPARENT);

        pesanApps = (Button) findViewById(R.id.btn_pesan_apps);
        pesanApps.setOnClickListener(this);

        pesanPhone = (Button) findViewById(R.id.btn_pesan_phone);
        pesanPhone.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_pesan_apps:
                Intent moveIntent = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.btn_pesan_phone:
                String phoneNumber = "081370860052";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber));
                startActivity(dialPhoneIntent);
                break;
            //pindah act utk btn review
        }
    }
}