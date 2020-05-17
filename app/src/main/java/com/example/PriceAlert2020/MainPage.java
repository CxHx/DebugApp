package com.example.PriceAlert2020;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainPage extends AppCompatActivity {

    private ImageView electronics_img;       //Image of first category in category bar.
    private ImageView popularItemsRow1Item1; //Image of top left item in table.
                                             // Only image clickable.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);

        electronics_img = findViewById(R.id.electronics_img);
        electronics_img.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), CategoryPage.class);
                startActivity(intent);
            }
        });

        popularItemsRow1Item1 = findViewById(R.id.popularItemsRow1Item1);
        popularItemsRow1Item1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ProductPage.class);
                startActivity(intent);
            }
        });
    }

    /**
     * Menu button that is supposed to display a PopUp Window.
     * Brings you to Profile Page for testing purposes.
     * (Still to be implemented: Popup Menu with Buttons: Profile, Notifications,
     * Active alerts, Logout)
     * @param view
     */
    public void goToProfilePage(View view) {
        Intent intent = new Intent(this, ProfilePage.class);
        startActivity(intent);
    }
}
