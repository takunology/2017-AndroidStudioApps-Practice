package jp.takunology.tmcit.bit;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends Activity{

    int sum = 0;
    String bynaly, hex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView text2 = (TextView)findViewById(R.id.textView15);
        final TextView text16 = (TextView)findViewById(R.id.textView16);
        final TextView text10 = (TextView)findViewById(R.id.textView14);
        text10.setText(String.valueOf(sum));

        ToggleButton toggleButton = (ToggleButton)findViewById(R.id.toggleButton);
        ToggleButton toggleButton2 = (ToggleButton)findViewById(R.id.toggleButton2);
        ToggleButton toggleButton3 = (ToggleButton)findViewById(R.id.toggleButton3);
        ToggleButton toggleButton4 = (ToggleButton)findViewById(R.id.toggleButton4);
        ToggleButton toggleButton5 = (ToggleButton)findViewById(R.id.toggleButton5);
        ToggleButton toggleButton6 = (ToggleButton)findViewById(R.id.toggleButton6);
        ToggleButton toggleButton7 = (ToggleButton)findViewById(R.id.toggleButton7);
        ToggleButton toggleButton8 = (ToggleButton)findViewById(R.id.toggleButton8);
        ToggleButton toggleButton9 = (ToggleButton)findViewById(R.id.toggleButton9);

        final TextView bool9 = (TextView)findViewById(R.id.bool9);
        final TextView bool8 = (TextView)findViewById(R.id.bool8);
        final TextView bool7 = (TextView)findViewById(R.id.bool7);
        final TextView bool6 = (TextView)findViewById(R.id.bool6);
        final TextView bool5 = (TextView)findViewById(R.id.bool5);
        final TextView bool4 = (TextView)findViewById(R.id.bool4);
        final TextView bool3 = (TextView)findViewById(R.id.bool3);
        final TextView bool2 = (TextView)findViewById(R.id.bool2);
        final TextView bool1 = (TextView)findViewById(R.id.bool1);

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b == true){
                    sum = sum + 1;
                    bool1.setText("1");
                }
                else{
                    sum = sum - 1;
                    bool1.setText("0");
                }
                text10.setText(String.valueOf(sum));
                bynaly = Integer.toBinaryString(sum);
                text2.setText(bynaly);
                hex = Integer.toHexString(sum);
                text16.setText(hex);
            }
        });

        toggleButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b == true){
                    sum += 2;
                    bool2.setText("1");
                }
                else{
                    sum -= 2;
                    bool2.setText("0");
                }
                text10.setText(String.valueOf(sum));
                bynaly = Integer.toBinaryString(sum);
                text2.setText(bynaly);
                hex = Integer.toHexString(sum);
                text16.setText(hex);
            }
        });

        toggleButton3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b == true){
                    sum += 4;
                    bool3.setText("1");
                }
                else{
                    sum -= 4;
                    bool3.setText("0");
                }
                text10.setText(String.valueOf(sum));
                bynaly = Integer.toBinaryString(sum);
                text2.setText(bynaly);
                hex = Integer.toHexString(sum);
                text16.setText(hex);
            }
        });

        toggleButton4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b == true){
                    sum += 8;
                    bool4.setText("1");
                }
                else{
                    sum -= 8;
                    bool4.setText("0");
                }
                text10.setText(String.valueOf(sum));
                bynaly = Integer.toBinaryString(sum);
                text2.setText(bynaly);
                hex = Integer.toHexString(sum);
                text16.setText(hex);
            }
        });

        toggleButton5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b == true){
                    sum += 16;
                    bool5.setText("1");
                }
                else{
                    sum -= 16;
                    bool5.setText("0");
                }
                text10.setText(String.valueOf(sum));
                bynaly = Integer.toBinaryString(sum);
                text2.setText(bynaly);
                hex = Integer.toHexString(sum);
                text16.setText(hex);
            }
        });

        toggleButton6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b == true){
                    sum += 32;
                    bool6.setText("1");
                }
                else{
                    sum -= 32;
                    bool6.setText("0");
                }
                text10.setText(String.valueOf(sum));
                bynaly = Integer.toBinaryString(sum);
                text2.setText(bynaly);
                hex = Integer.toHexString(sum);
                text16.setText(hex);
            }
        });

        toggleButton7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b == true){
                    sum += 64;
                    bool7.setText("1");
                }
                else{
                    sum -= 64;
                    bool7.setText("0");
                }
                text10.setText(String.valueOf(sum));
                bynaly = Integer.toBinaryString(sum);
                text2.setText(bynaly);
                hex = Integer.toHexString(sum);
                text16.setText(hex);
            }
        });

        toggleButton8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b == true){
                    sum += 128;
                    bool8.setText("1");
                }
                else{
                    sum -= 128;
                    bool8.setText("0");
                }
                text10.setText(String.valueOf(sum));
                bynaly = Integer.toBinaryString(sum);
                text2.setText(bynaly);
                hex = Integer.toHexString(sum);
                text16.setText(hex);
            }
        });

        toggleButton9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b == true){
                    sum += 256;
                    bool9.setText("1");
                }
                else{
                    sum -= 256;
                    bool9.setText("0");
                }
                text10.setText(String.valueOf(sum));
                bynaly = Integer.toBinaryString(sum);
                text2.setText(bynaly);
                hex = Integer.toHexString(sum);
                text16.setText(hex);
            }
        });

    }

}
