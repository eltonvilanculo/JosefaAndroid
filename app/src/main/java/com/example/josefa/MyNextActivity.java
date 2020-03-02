package com.example.josefa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MyNextActivity extends AppCompatActivity {
    private TextView name1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_next);

        name1 = findViewById(R.id.saveNameTextView_Id);

        Intent intent =getIntent();
        Bundle receberDados = intent.getExtras();
        String name = (String) receberDados.get("Nome");
        name1.setText(name);

        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();

    }
}
