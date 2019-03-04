package com.example.practicalone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        initEventListeners();
    }

    private void initUI() {
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
    }

    private void initEventListeners() {
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        textView.animate().scaleX(0.8f).scaleY(0.8f).alpha(1).setDuration(1000).start();
    }
}
