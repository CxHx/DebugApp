package com.example.PriceAlert2020;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_page);
    }

    /**
     * Redirects you back to the login page.
     * @param view
     */
    public void goToLoginPage(View view) {
        Intent intent = new Intent(this, LoginPage.class);
        startActivity(intent);
    }

    /**
     * Makes little popup visible whether the registering with entered information was successful
     * or not.
     * If successfull redirects you back to login page and creates new account.
     * If not successful makes popup visible with "account details are already taken".
     * @param view
     */
    public void backToLoginPage(View view) {
        Intent intent = new Intent(this, LoginPage.class);
        startActivity(intent);
    }
}
