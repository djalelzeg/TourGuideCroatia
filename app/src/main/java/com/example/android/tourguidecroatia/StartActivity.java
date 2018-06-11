package com.example.android.tourguidecroatia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
/**
 * Created by djalél on 10/06/2018.
 */

public class StartActivity extends AppCompatActivity {
    Button startButton ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /**
         * Set the content of the activity to use the first_activity.xml layout file
         */
        setContentView(R.layout.start);

        /**
         * StartButton click.
         */
        startButton = (Button) findViewById(R.id.startButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent start = new Intent(StartActivity.this, MainActivity.class);
                startActivity(start);
            }
        });


    }
}