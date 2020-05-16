package com.example.debugapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ProfilePage extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_page);
    }

    public void backToMainPage(View view) {
        Intent intent = new Intent(this, MainPage.class);
        startActivity(intent);
    }
}
