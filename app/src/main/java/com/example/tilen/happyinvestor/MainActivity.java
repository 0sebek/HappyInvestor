    package com.example.tilen.happyinvestor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

    public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        assert button != null;
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AlphabetActivity.class);
                startActivity(intent);
            }
        });
        Button button2 = (Button) findViewById(R.id.button2);
        assert button2 != null;
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GoogleActivity.class);
                startActivity(intent);
            }
        });
        Button button3 = (Button) findViewById(R.id.button3);
        assert button3 != null;
        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent openFaceook = new Intent(MainActivity.this, FacebookActivity.class);
                startActivity(openFaceook);
            }
        });
    }
}
