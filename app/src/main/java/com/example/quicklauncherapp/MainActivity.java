package com.example.quicklauncherapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Reference to the button
        Button secondActivity = (Button) findViewById(R.id.secondActivityBtn);

        secondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), SecondActivity.class);

                EditText t = (EditText) findViewById(R.id.editText);
                System.out.println(t);
                startIntent.putExtra("com.example.quicklauncherapp.SOMETHING",t.getText().toString());
                startActivity(startIntent);
            }
        });
    }
}
