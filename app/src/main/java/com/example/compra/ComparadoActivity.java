package com.example.compra;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class ComparadoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comparado);

        // Encontrar o botão
        Button buttonVoltar = findViewById(R.id.button);

        // Adicionar ação ao clicar no botão
        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navegar de volta para ComparadorActivity
                Intent intent = new Intent(ComparadoActivity.this, ComparadorActivity.class);
                startActivity(intent);
                // Finaliza a atividade atual para não manter na pilha
                finish();
            }
        });
    }
}
