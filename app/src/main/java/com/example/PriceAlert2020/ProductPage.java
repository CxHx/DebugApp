package com.example.PriceAlert2020;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class ProductPage extends AppCompatActivity {

    private RelativeLayout appIconLayoutPP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_page);

        appIconLayoutPP = findViewById(R.id.appIconLayoutPP);
        appIconLayoutPP.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainPage.class);
                startActivity(intent);
            }
        });
    }

    /**
     * If you clicked on this product via the category page
     * you are getting back to the category page.
     * (Still to be implemented: If you clicked on this product via the main page
     * you are getting back to the category page)
     * (Also possible: you are getting back to the category page with an empty filter query,
     * just like when you are searching for strings on the main page)
     * @param view
     */
    public void backToCategoryPage(View view) {
        Intent intent = new Intent(this, CategoryPage.class);
        startActivity(intent);
    }

    /**
     * Brings you to the setAlertPage with the corresponding product information.
     * @param view
     */
    public void goToSetAlert(View view) {
        Intent intent = new Intent(this, SetAlertPage.class);
        startActivity(intent);
    }
}
