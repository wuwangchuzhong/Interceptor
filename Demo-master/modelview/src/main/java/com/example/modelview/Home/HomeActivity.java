package com.example.modelview.Home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.modelview.R;

public class HomeActivity extends AppCompatActivity {

    private Button bt_hide;
    private TextView tv_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        bt_hide=(Button)findViewById(R.id.bt_hide);


        tv_result=(TextView)findViewById(R.id.tv_result);
        //请求数据
        bt_hide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
