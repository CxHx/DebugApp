package com.example.PriceAlert2020;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class ActiveAlertsPage extends AppCompatActivity {

    private RelativeLayout appIconLayoutAAP;  //appIcon to get back to the main page

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.active_alerts_page);

        appIconLayoutAAP = findViewById(R.id.appIconLayoutAAP);
        appIconLayoutAAP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainPage.class);
                startActivity(intent);
            }
        });
    }

    /**
     * Redirects you back to the main page.
     * (Since the page before would only be a popup on the main page, either the appIcon or the
     * backButton can be scrapped)
     * @param view
     */
    public void backToMainPage(View view) {
        Intent intent = new Intent(this, MainPage.class);
        startActivity(intent);
    }
}
