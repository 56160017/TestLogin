package com.buu.se.testlogin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends Activity {

    private TextView TvResult;
    private LinearLayout LlLove;
    private LinearLayout LlHealthy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TvResult = (TextView) findViewById(R.id.tvresult);
        LlLove = (LinearLayout) findViewById(R.id.llLove);
        LlHealthy = (LinearLayout) findViewById(R.id.llHealthy);


        Intent intent = getIntent();

        //Toast.makeText(getApplicationContext(), intent.getStringExtra("name"), Toast.LENGTH_SHORT).show();
        TvResult.setText("Username:" + intent.getStringExtra("name") + "\n" + "password:" + intent.getStringExtra("pass"));

        LlLove.setOnClickListener(OnClickLoveListener);
        LlHealthy.setOnClickListener(OnClickHealthyListener);

    }

    private View.OnClickListener OnClickLoveListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            TvResult.setText("ิอกหัก");
        }
    };
    private View.OnClickListener OnClickHealthyListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            TvResult.setText("ป่วย");
        }
    };
}
