package com.example.task8;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class homepage extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);
        Button cartButton = findViewById(R.id.cartButton);

        cartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepage.this, cart.class);
                startActivity(intent);
            }
        });

        ImageButton imageButton = findViewById(R.id.imageButton);
        TextView textView = findViewById(R.id.textView);
        Button button = findViewById(R.id.button);
        Button button1 = findViewById(R.id.button2);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(homepage.this, v);
                popup.setOnMenuItemClickListener(homepage.this);
                popup.inflate(R.menu.menu); // Assuming your menu file is named menu.xml
                popup.show();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), RatingPage.class);
                startActivity(i);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), FeedbackPage.class);
                startActivity(i);
            }
        });

        cartButton = findViewById(R.id.cartButton);

        cartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the cart activity when the cart button is clicked
                Intent intent = new Intent(homepage.this, cart.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.oneplus) {
            Toast.makeText(this, "Selected Item: OnePlus", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(getApplicationContext(), OnePlusActivity.class);
            startActivity(i);
            return true;
        } else if (id == R.id.apple) {
            Toast.makeText(this, "Selected Item: Apple", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(getApplicationContext(), AppleActivity.class);
            startActivity(i);
            return true;
        } else if (id == R.id.samsung) {
            Toast.makeText(this, "Selected Item: Samsung", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(getApplicationContext(), SamsungActivity.class);
            startActivity(i);
            return true;
        } else if (id == R.id.oppo) {
            Toast.makeText(this, "Selected Item: Oppo", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(getApplicationContext(), OppoActivity.class);
            startActivity(i);
            return true;
        } else if (id == R.id.vivo) {
            Toast.makeText(this, "Selected Item: Vivo", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(getApplicationContext(), VivoActivity.class);
            startActivity(i);
            return true;
        } else if (id == R.id.xiaomi) {
            Toast.makeText(this, "Selected Item: Xiaomi", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(getApplicationContext(), XiaomiActivity.class);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
