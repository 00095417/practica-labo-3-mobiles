package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    TextView new_activity_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        String message = "Vacio";
        new_activity_text = findViewById(R.id.text_new_activity);

        Intent m_Intent = this.getIntent();

        if (m_Intent != null){
            message = m_Intent.getStringExtra(AppConstants.INTENT_MESSAGE_KEY);
        }

        new_activity_text.setText(message);
    }
}
