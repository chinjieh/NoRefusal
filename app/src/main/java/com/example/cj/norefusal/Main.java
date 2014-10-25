package com.example.cj.norefusal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Main extends Activity {

    Button next = (Button) findViewById(R.id.main_bNext);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        next.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Intent a = new Intent(Main.this, Description.class);
                startActivity(a);
            }


        });
    }
}
