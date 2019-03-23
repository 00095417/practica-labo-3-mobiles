package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {

    TextView m_sahred_text;
    private String text_shared;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        m_sahred_text = findViewById(R.id.text_shared);
        text_shared = "no hay texto compartido";

        Intent new_intent = getIntent();

        if (new_intent != null){
            text_shared = new_intent.getStringExtra(Intent.EXTRA_TEXT);
        }

        m_sahred_text.setText(text_shared);
    }
}
