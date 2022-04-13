package com.mirea.sumachev.clickbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvOut;
    private Button btnOk;
    private Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOut = findViewById(R.id.tvOut);
        btnOk = findViewById(R.id.btnOk);
        btnCancel = findViewById(R.id.btnCancel);

        View.OnClickListener oclBtnOk = view -> tvOut.setText("Нажата кнопка OK");
        btnOk.setOnClickListener(oclBtnOk);

        View.OnClickListener oclBtnCancel = view -> tvOut.setText("Нажата кнопка Cancel");
        btnCancel.setOnClickListener(oclBtnCancel);

    }
}