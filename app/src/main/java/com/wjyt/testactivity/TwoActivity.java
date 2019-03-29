package com.wjyt.testactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class TwoActivity extends AppCompatActivity {

    private Button btn_click;
    private Button btn2_click;
    private static String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        Intent intent=getIntent();
        String NewsID=intent.getStringExtra("newsid");
        text = NewsID;
        TextView textView2 =(TextView)findViewById(R.id.textView);
        textView2.setText(NewsID);

        btn_click = (Button) findViewById(R.id.button);
        btn2_click = (Button) findViewById(R.id.button2);
        btn_click.setOnClickListener(click);
        btn2_click.setOnClickListener(click);


    }
    private View.OnClickListener click = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button:
                    gotoActivity();
                    break;
                case R.id.button2:
                    Toast();
                    break;

                default:
                    break;
            }
        }
    };
    private void gotoActivity(){
        startActivity(new Intent(this,MainActivity.class));
    }
    private void Toast(){
        Toast.makeText(TwoActivity.this, text, Toast.LENGTH_SHORT).show();
    }
}
