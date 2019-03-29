package com.wjyt.testactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btn_click;
    private EditText editText;
    private static String query;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_click = (Button) findViewById(R.id.button);
        btn_click.setOnClickListener(click);
        //initView();

    }
    private View.OnClickListener click = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button:
                    gotoActivity();
                    break;

                default:
                    break;
            }
        }
    };

    private void initView() {
        editText = (EditText) findViewById(R.id.editView);
        query = editText.getText().toString();
    }

    private void gotoActivity(){

        //startActivity(new Intent(this,TwoActivity.class));
        initView();
        Intent intent=new Intent();
        intent.putExtra("newsid", query);//设置参数,""
        intent.setClass(MainActivity.this, TwoActivity.class);//从哪里跳到哪里
        MainActivity.this.startActivity(intent);

    }
}
