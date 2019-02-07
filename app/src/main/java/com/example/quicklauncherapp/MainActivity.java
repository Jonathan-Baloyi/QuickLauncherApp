package com.example.quicklauncherapp;

import android.content.Intent;
import android.net.Uri;
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
                startIntent.putExtra("second",t.getText().toString());
                startActivity(startIntent);
            }
        });

        // The button will launch a browser
        Button googleBtn = (Button) findViewById(R.id.googleBtn);
        googleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String google = "https://gmail.com";
                Uri webAddress = Uri.parse(google);
                Intent goToGoogle = new Intent(Intent.ACTION_VIEW, webAddress);

                if( goToGoogle.resolveActivity(getPackageManager()) != null){
                    startActivity(goToGoogle);
                }
            }
        });
    }
}
