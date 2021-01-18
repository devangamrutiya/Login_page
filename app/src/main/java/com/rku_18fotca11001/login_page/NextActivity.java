package com.rku_18fotca11001.login_page;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {
        TextView textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        Bundle bundle = getIntent().getExtras();
        String  name = bundle.getString("name");

        textView1 = findViewById(R.id.txtwel);
        textView1.setText("Welcome ,"+name);
    }
}