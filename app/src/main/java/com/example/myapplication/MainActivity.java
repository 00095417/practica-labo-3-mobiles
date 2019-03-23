package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn_submit;
    EditText edit_name, edit_email, edit_pass, edit_gander;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_submit = findViewById(R.id.btn_submit);
        edit_name = findViewById(R.id.edit_name);
        edit_email = findViewById(R.id.edit_email);
        edit_pass = findViewById(R.id.edit_pass);
        edit_gander = findViewById(R.id.edit_gender);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent m_Intent = new Intent(MainActivity.this,NewActivity.class);
                m_Intent.putExtra(AppConstants.INTENT_MESSAGE_KEY,"prueba");
                startActivity(m_Intent);
            }
        });

    }
}
