package com.example.task8;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RatingPage extends AppCompatActivity {

    private RatingBar ratingBar;
    private Button submitRatingButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ratingpage);

        ratingBar = findViewById(R.id.ratingBar);
        submitRatingButton = findViewById(R.id.submitRatingButton);

        submitRatingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float rating = ratingBar.getRating();
                submitRating(rating);
            }
        });
    }

    private void submitRating(float rating) {

        Toast.makeText(this, "Rating submitted: " + rating, Toast.LENGTH_SHORT).show();
    }
}
