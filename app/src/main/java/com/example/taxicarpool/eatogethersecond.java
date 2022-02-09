package com.example.taxicarpool;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.Nullable;

public class eatogethersecond extends MainActivity {
    @Override

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eatogethersecond);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), eatogetherfirst.class);
                startActivity(intent);
            }
        });
        /*ImageButton imageButton4 = (ImageButton) findViewById(R.id.imageButton4);

        imageButton4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), eatogetherfirst.class);
                startActivity(intent);
            }
        });*/
    }
}
