package com.example.compra;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ComparadorActivity extends AppCompatActivity {
    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comparador);

        Button compararButton = findViewById(R.id.btnComparar);
        EditText produto1Field = findViewById(R.id.textInputEditText2);
        EditText preco1Field = findViewById(R.id.editText3);
        EditText volume1Field = findViewById(R.id.editText4);
        EditText produto2Field = findViewById(R.id.textInputEditText);
        EditText preco2Field = findViewById(R.id.editText);
        EditText volume2Field = findViewById(R.id.editText2);
        EditText produto3Field = findViewById(R.id.textInputEditText4);
        EditText preco3Field = findViewById(R.id.editText5);
        EditText volume3Field = findViewById(R.id.editText6);

        handler = new Handler(Looper.getMainLooper()) {
            @Override
            public void handleMessage(Message msg) {
                if (msg.what == 1) {
                    Bundle bundle = msg.getData();
                    Intent intent = new Intent(ComparadorActivity.this, ComparadoActivity.class);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            }
        };

        compararButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String produto1 = produto1Field.getText().toString();
                String preco1 = preco1Field.getText().toString();
                String volume1 = volume1Field.getText().toString();
                String produto2 = produto2Field.getText().toString();
                String preco2 = preco2Field.getText().toString();
                String volume2 = volume2Field.getText().toString();
                String produto3 = produto3Field.getText().toString();
                String preco3 = preco3Field.getText().toString();
                String volume3 = volume3Field.getText().toString();

                if (produto1.isEmpty() || preco1.isEmpty() || volume1.isEmpty() ||
                        produto2.isEmpty() || preco2.isEmpty() || volume2.isEmpty()) {
                    Toast.makeText(ComparadorActivity.this, "Ao menos 2 dos produtos devem ser preenchidos!", Toast.LENGTH_SHORT).show();
                    return;
                }

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        Bundle bundle = new Bundle();
                        bundle.putString("produto1", produto1);
                        bundle.putString("preco1", preco1);
                        bundle.putString("volume1", volume1);
                        bundle.putString("produto2", produto2);
                        bundle.putString("preco2", preco2);
                        bundle.putString("volume2", volume2);
                        bundle.putString("produto3", produto3);
                        bundle.putString("preco3", preco3);
                        bundle.putString("volume3", volume3);

                        Message message = handler.obtainMessage(1);
                        message.setData(bundle);
                        handler.sendMessage(message);
                    }
                }).start();
            }
        });
    }
}
