package com.example.passandodadosentretelas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private TextView textNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        textNome = findViewById(R.id.text_nome);
        String nome = getIntent().getStringExtra("nome");

        textNome.setText(nome);

        Button botao = findViewById(R.id.btn_terceiraActivity);
        botao.setOnClickListener(view -> {
            Intent intent = new Intent(this, TerceiraActivity.class);
            startActivity(intent);
        });
    }
}