package com.example.navegandoentrepaginas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Button botao = findViewById(R.id.btn_terceiraActivity);
        botao.setOnClickListener(view -> {
            Intent intent = new Intent(this, TerceiraActivity.class);
            startActivity(intent);
        });
    }
}