package com.example.sensorvalue;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    SensorManager sm;
    float gx, gy, gz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume(){
        super.onResume();
        sm = (SensorManager)getSystemService(SENSOR_SERVICE);
        List<Sensor> sensors = sm.getSensorList(Sensor.TYPE_ACCELEROMETER);
        if(0 < sensors.size()){
            sm.registerListener((SensorEventListener) this, sensors.get(0), SensorManager.SENSOR_DELAY_NORMAL);
        }
    }

    @Override
    protected void onPause(){
        super.onPause();
        sm.unregisterListener((SensorEventListener) this);
    }

    public void onSensorChanged(SensorEvent event){
        gx = event.values[0];
        gy = event.values[1];
        gz = event.values[2];
    }

    public void run() {
        TextView t = (TextView) findViewById(R.id.textView2);
        t.setText("X:" + gx + "\n" + "Y:" + gy + "\n" + "Z:" + gz + "\n");
    }
}
