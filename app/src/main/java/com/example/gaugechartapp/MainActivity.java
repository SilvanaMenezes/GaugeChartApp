package com.example.gaugechartapp;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.github.anastr.speedviewlib.PointerSpeedometer;

public class MainActivity extends AppCompatActivity {

    private PointerSpeedometer gauge;
    private int[] sectionColors;
    private Button btnAumentar;
    private Button btnDiminuir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gauge = findViewById(R.id.gauge);
        sectionColors = getResources().getIntArray(R.array.gaugeColors);

        btnAumentar = findViewById(R.id.btnAumentar);
        btnDiminuir = findViewById(R.id.btnDiminuir);

        btnAumentar.setOnClickListener(view -> {
            float newSpeed = gauge.getSpeed()+10;

            if (newSpeed > gauge.getMaxSpeed()){
                newSpeed = gauge.getMaxSpeed();
            }
            gauge.speedTo(newSpeed);
            updateGaugeColor(newSpeed);
        });

        btnDiminuir.setOnClickListener(view -> {
            float newSpeed = gauge.getSpeed()-10;

            if(newSpeed < gauge.getMinSpeed()){
                newSpeed = gauge.getMinSpeed();
            }
            gauge.speedTo(newSpeed);
            updateGaugeColor(newSpeed);
        });
    }

    private void updateGaugeColor(float speed){
        int colorIndex;
        if(speed <= 33){
            colorIndex = 0;
        } else if (speed <= 66) {
            colorIndex = 1;
        } else {
            colorIndex = 2;
        }
        gauge.setSpeedometerColor(sectionColors[colorIndex]);
    }
}
