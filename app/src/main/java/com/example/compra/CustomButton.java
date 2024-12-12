package com.example.compra;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.Button;

public class CustomButton extends Button {

    public CustomButton(Context context) {
        super(context);
        init(context);
    }

    public CustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public CustomButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        // Configuração padrão para a view
        setBackgroundColor(Color.parseColor("#2D802F"));
        setTextColor(Color.WHITE);
        setGravity(Gravity.CENTER);
        setText("Entrar");
    }
}