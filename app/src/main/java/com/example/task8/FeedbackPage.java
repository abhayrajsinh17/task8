package com.example.task8;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FeedbackPage extends AppCompatActivity {

    private EditText feedbackEditText;
    private Button submitFeedbackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feedbackpage);

        feedbackEditText = findViewById(R.id.feedbackEditText);
        submitFeedbackButton = findViewById(R.id.submitFeedbackButton);

        submitFeedbackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String feedback = feedbackEditText.getText().toString().trim();
                if (!feedback.isEmpty()) {
                    Toast.makeText(FeedbackPage.this, "Feedback submitted: " + feedback, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(FeedbackPage.this, "Please enter your feedback", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
