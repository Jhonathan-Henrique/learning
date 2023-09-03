package com.example.passandoobjetosentreactivitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private TextView TextNome;
    private Usuario usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        TextNome = findViewById(R.id.text_Nome);
        usuario = (Usuario) getIntent().getSerializableExtra("usuario");

        TextNome.setText("Nome: " + usuario.getNome() + " Idade: " + usuario.getIdade() + " Altura: " + usuario.getAltura());

        Button botao = findViewById(R.id.btn_terceiraActivity);
        botao.setOnClickListener(view -> {
            Intent intent = new Intent(this, TerceiraActivity.class);
            startActivity(intent);
        });
    }
}