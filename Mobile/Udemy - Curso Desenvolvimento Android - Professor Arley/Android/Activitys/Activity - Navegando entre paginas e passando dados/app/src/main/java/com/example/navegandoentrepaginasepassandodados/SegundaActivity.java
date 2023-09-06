package com.example.navegandoentrepaginasepassandodados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private TextView TextNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        TextNome = findViewById(R.id.textNome);
        String nome = getIntent().getStringExtra("nome");
        TextNome.setText(nome);

        Button botao = findViewById(R.id.btn_terceiraActivity);
        botao.setOnClickListener(view -> {
            Intent intent = new Intent(this, TerceiraActivity.class);
            startActivity(intent);
        });
    }
}