package com.example.practicalone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;
    private Button button;
    private boolean isShowing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        initEventListeners();
    }

    private void initUI() {
        isShowing = false;
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
    }

    private void initEventListeners() {
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (isShowing) {
            textView.animate().scaleX(0.2f).scaleY(0.2f).alpha(0).setDuration(500).start();
        } else {
            textView.animate().scaleX(0.8f).scaleY(0.8f).alpha(1).setDuration(500).start();
        }

        isShowing = !isShowing;
    }
}
