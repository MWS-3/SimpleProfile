package com.example.alc4phase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAbout = (Button)findViewById(R.id.aboutBtn);
        btnAbout.setOnClickListener(new View.OnClickListener() {
          @Override
            public void onClick(View v) {
              Intent intent = new Intent(getBaseContext(), AlcActivity.class);
              startActivity(intent);
            }
        });

        Button btnProfile = (Button)findViewById(R.id.profileBtn);

        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), ProfileActivity.class);
                startActivity(intent);

            }
        });
    }
}
