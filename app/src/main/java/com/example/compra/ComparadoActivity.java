package com.example.compra;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ComparadoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comparado);

        // Recupera os elementos da tela
        TextView produto1View = findViewById(R.id.textInputEditText2);
        TextView preco1View = findViewById(R.id.editText3);
        TextView volume1View = findViewById(R.id.editText4);
        TextView produto2View = findViewById(R.id.textInputEditText);
        TextView preco2View = findViewById(R.id.editText);
        TextView volume2View = findViewById(R.id.editText2);
        TextView produto3View = findViewById(R.id.textInputEditText4);
        TextView preco3View = findViewById(R.id.editText5);
        TextView volume3View = findViewById(R.id.editText6);

        // Configura os valores recebidos via Intent
        String produto1 = getIntent().getStringExtra("produto1");
        String preco1 = getIntent().getStringExtra("preco1");
        String volume1 = getIntent().getStringExtra("volume1");
        String produto2 = getIntent().getStringExtra("produto2");
        String preco2 = getIntent().getStringExtra("preco2");
        String volume2 = getIntent().getStringExtra("volume2");
        String produto3 = getIntent().getStringExtra("produto3");
        String preco3 = getIntent().getStringExtra("preco3");
        String volume3 = getIntent().getStringExtra("volume3");

        produto1View.setText(produto1);
        preco1View.setText(preco1);
        volume1View.setText(volume1);
        produto2View.setText(produto2);
        preco2View.setText(preco2);
        volume2View.setText(volume2);
        produto3View.setText(produto3);
        preco3View.setText(preco3);
        volume3View.setText(volume3);

        // Botão para voltar à tela anterior
        Button buttonVoltar = findViewById(R.id.button);
        buttonVoltar.setOnClickListener(view -> {
            Intent intent = new Intent(ComparadoActivity.this, ComparadorActivity.class);
            startActivity(intent);
            finish();
        });

    }
}
