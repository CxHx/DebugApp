package com.example.PriceAlert2020;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import android.widget.TableRow;

import androidx.appcompat.app.AppCompatActivity;

public class CategoryPage extends AppCompatActivity {

    private RelativeLayout appIconLayoutCP;  //appIcon to get back to the main page
    private TableRow filteredItemsTableRow1; //Item to click on to get redirected to that products page

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

        filteredItemsTableRow1 = findViewById(R.id.filteredItemsTableRow1);
        filteredItemsTableRow1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ProductPage.class);
                startActivity(intent);
            }
        });
    }
}
