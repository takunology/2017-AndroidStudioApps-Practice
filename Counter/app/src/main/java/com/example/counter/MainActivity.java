package com.example.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCount(View v){
        TextView t = (TextView)findViewById(R.id.textView);//textviewを参照
        i++;
        t.setText(""+i);//C#と違うのは、安易に.toString()が使えないところ。
    }

    public  void onReset(View v){
        TextView t = (TextView)findViewById(R.id.textView);
        i = 0;
        t.setText(""+i);
    }
}
