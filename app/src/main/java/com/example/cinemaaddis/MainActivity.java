package com.example.cinemaaddis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout lrEthio;
//    LinearLayout lrforeign;
    CardView    movieCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lrEthio=findViewById(R.id.ethiopianMovieLinearLayout);
        movieCard = findViewById(R.id.movieCardView);

        lrEthio.addView(movieCard);

    }
}