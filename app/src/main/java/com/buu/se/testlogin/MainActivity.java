package com.buu.se.testlogin;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    private EditText EtUsername;
    private EditText EtPassword;
    private Button BtnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EtUsername = (EditText) findViewById(R.id.etUsername);
        EtPassword = (EditText) findViewById(R.id.etPassword);
        BtnSubmit = (Button) findViewById(R.id.btnSubmit);

        BtnSubmit.setOnClickListener(OnClickSubmitListener);
    }

    private View.OnClickListener OnClickSubmitListener = new View.OnClickListener() {

        @Override
        public void onClick(View view) {
//            Toast.makeText(getApplicationContext(), EtUsername.getText().toString()
//                    + EtPassword.getText().toString(), Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
            intent.putExtra("name",EtUsername.getText().toString());
            intent.putExtra("pass",EtPassword.getText().toString());
            startActivity(intent);
        }
    };

}
