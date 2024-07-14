package com.example.task8;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class cart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cartpage);

        Button proceedToPaymentButton = findViewById(R.id.proceedToPaymentButton);
        proceedToPaymentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(cart.this, "Proceed to Payment clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

