package com.rscbyte.alc_challenge;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnClick();
        init();
    }

    void init() {
        getSupportActionBar().setTitle(String.valueOf("ALC Phase 4.0"));
    }

    void btnClick() {
        findViewById(R.id.btnAbout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Load about alc
                startActivity(new Intent(MainActivity.this, AboutALC.class));
            }
        });

        findViewById(R.id.btnProfile).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //load my profile
                startActivity(new Intent(MainActivity.this, ProfileALC.class));
            }
        });
    }
}
