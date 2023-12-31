package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox cbNotificacoes = findViewById(R.id.cbNotificacoes);
        TextView textNotificacoes = findViewById(R. id.textNotificacoes);

        cbNotificacoes.setOnCheckedChangeListener((compoundButton, b) -> {
            if(b){
                textNotificacoes.setText("ON");
            }
            else{
                textNotificacoes.setText("OFF");
            }
        });
    }
}