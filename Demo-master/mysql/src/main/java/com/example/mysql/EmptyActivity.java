package com.example.mysql;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

//空的界面
public class EmptyActivity extends AppCompatActivity {

    private TextView tv_hide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty);

        tv_hide=(TextView) findViewById(R.id.tv_hide);

        tv_hide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(EmptyActivity.this,MainActivity.class));
            }
        });
    }
}
