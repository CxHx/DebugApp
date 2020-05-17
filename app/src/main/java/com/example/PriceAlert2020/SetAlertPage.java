package com.example.PriceAlert2020;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class SetAlertPage extends AppCompatActivity {

    private RelativeLayout appIconLayoutSAP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_alert_page);

        appIconLayoutSAP = findViewById(R.id.appIconLayoutSAP);
        appIconLayoutSAP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainPage.class);
                startActivity(intent);
            }
        });
    }

    /**
     * Brings you back to the product page.
     * @param view
     */
    public void backToProductPage(View view) {
        Intent intent = new Intent(this, ProductPage.class);
        startActivity(intent);
    }
}
