package com.example.myexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_first = (Button) findViewById(R.id.btn_first);
        Button btn_second = (Button) findViewById(R.id.btn_second);

        btn_first.setOnClickListener(this);
        btn_second.setOnClickListener(this);
    }
        @Override
    public void onClick(View v){
        switch(v.getId()) {
            case R.id.btn_first:
                //do something
                Toast.makeText(this, "로그인 페이지",Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_second:
                //do something
                Toast.makeText(this, "회원가입 페이지",Toast.LENGTH_LONG).show();
                break;
        }
    }
}
