package com.example.modelview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.modelview.Home.entity.TextBook;
import com.example.modelview.Home.presenter.Presenter;
import com.example.modelview.Home.presenter.TextBookPresenter;
import com.example.modelview.Home.view.TextBookView;

import org.w3c.dom.ProcessingInstruction;

public class MainActivity extends Activity {

    private TextView tv_button;
    private TextView tv_result;

    private TextBookPresenter bookPresenter=new TextBookPresenter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_button=findViewById(R.id.tv_button);
        tv_result=findViewById(R.id.tv_result);

        tv_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bookPresenter.getBanner();
            }
        });

        bookPresenter.onCreate();
        bookPresenter.attachView(textBook);
    }

    public TextBookView textBook=new TextBookView(){

        @Override
        public void onSuccess(TextBook textBook) {
            tv_result.setVisibility(View.VISIBLE);
            tv_result.setText(textBook.getData().getAds().get(0).getTitle());
        }

        @Override
        public void onError(String result) {
            Toast.makeText(MainActivity.this,result.toString(),Toast.LENGTH_SHORT).show();
        }
    };
}
