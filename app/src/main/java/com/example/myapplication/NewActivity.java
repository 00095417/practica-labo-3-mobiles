package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    TextView new_activity_text;
    Button btn_share;
    String message = "Vacio";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        new_activity_text = findViewById(R.id.text_new_activity);
        btn_share = findViewById(R.id.btn_share);

        Intent m_Intent = this.getIntent();

        if (m_Intent != null){
            message = m_Intent.getStringExtra(AppConstants.INTENT_MESSAGE_KEY);
        }

        new_activity_text.setText(message);

        btn_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m_intent_share = new Intent();

                m_intent_share.setAction(Intent.ACTION_SEND);
                m_intent_share.setType("text/plain");
                m_intent_share.putExtra(Intent.EXTRA_TEXT,message);

                startActivity(m_intent_share);

            }
        });
    }
}
