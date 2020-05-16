package com.example.debugapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class CategoryPage extends AppCompatActivity {

    private RelativeLayout appIconLayoutCP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_page);

        appIconLayoutCP = findViewById(R.id.appIconLayoutCP);
        appIconLayoutCP.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainPage.class);
                startActivity(intent);
            }
        });
    }
}
