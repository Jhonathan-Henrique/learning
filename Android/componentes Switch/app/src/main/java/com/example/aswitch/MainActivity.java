package com.example.aswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.switchmaterial.SwitchMaterial;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SwitchMaterial swNotificacoes = findViewById(R.id.sw_notificacoes);
        TextView textNotificacoes = findViewById(R.id.textNotificacoes);

        swNotificacoes.setOnCheckedChangeListener((compoundButton, b) -> {
            if(b){

                textNotificacoes.setText("ON");
            }
            else{
                textNotificacoes.setText("OFF");
            }
        });


    }
}