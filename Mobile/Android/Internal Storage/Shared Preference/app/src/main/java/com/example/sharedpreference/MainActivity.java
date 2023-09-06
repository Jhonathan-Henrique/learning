package com.example.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String ARQUIVO_PREFERENCIA = "ArquivoPreferencia";

    private EditText edit_nome;
    private TextView text_nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_nome = findViewById(R.id.edit_nome);
        text_nome = findViewById(R.id.text_nome);

        recuperarDados();
    }

    public void salvarDados(View view){

        String nome = edit_nome.getText().toString();
        
        if(!nome.isEmpty()){
            SharedPreferences sharedPreferences = getSharedPreferences(ARQUIVO_PREFERENCIA, 0);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("meu_nome", nome);
            editor.apply();

        }else{
            edit_nome.setError("Informe seu nome");
        }

    }

    private void recuperarDados(){
        SharedPreferences sharedPreferences = getSharedPreferences(ARQUIVO_PREFERENCIA, 0);

        String nomeRecuperado = sharedPreferences.getString("meu_nome", "");

        text_nome.setText(nomeRecuperado);

    }
}