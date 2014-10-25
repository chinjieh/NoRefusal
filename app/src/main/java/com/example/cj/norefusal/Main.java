package com.example.cj.norefusal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Main extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button next = (Button) findViewById(R.id.main_bNext);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Class ourClass = null;

                //ourClass = Class.forName("com.example.cj.norefusal.Description");
                Intent a = new Intent(Main.this, Extent.class);
                startActivity(a);


            }
        });
    }
}
