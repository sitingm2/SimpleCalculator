package com.example.masit.simplecalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class WelcomePage extends AppCompatActivity {

    Button buttonToSimpleCalculator;
    ImageView mainImage;
    Button buttonNewImages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);

        mainImage = (ImageView) findViewById(R.id.image);
        Picasso.get().load("http://i.imgur.com/DvpvklR.png").into(mainImage);

        buttonToSimpleCalculator = (Button) findViewById(R.id.button5);
        buttonToSimpleCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomePage.this, SimpleCalculator.class);
                startActivity(intent);
            }
        });
    }
}
