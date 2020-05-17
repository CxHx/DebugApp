package com.example.PriceAlert2020;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);
    }

    /**
     * Redirects you go the register page.
     * @param view
     */
    public void goToRegisterPage(View view) {
        Intent intent = new Intent(this, RegisterPage.class);
        startActivity(intent);
    }

    /**
     * If login credentials are correct you are redirected to the main page.
     * (Still to be implemented: check of login credentials)
     * @param view
     */
    public void goToMainPage(View view) {
        Intent intent = new Intent(this, MainPage.class);
        startActivity(intent);
    }
}
