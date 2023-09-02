package com.example.passandodadosentretelas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botao = findViewById(R.id.btn_segundaActivity);
        botao.setOnClickListener(view -> {
            Intent intent = new Intent(this, SegundaActivity.class);
            intent.putExtra("nome", "Marcos");
            startActivity(intent);
        });
    }
}