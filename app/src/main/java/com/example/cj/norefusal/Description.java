package com.example.cj.norefusal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by User on 25/10/2014.
 */
public class Description extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description);

        Button next = (Button) findViewById(R.id.button1);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //ourClass = Class.forName("com.example.cj.norefusal.Description");
                Intent a = new Intent(Description.this, Contact.class);
                startActivity(a);


            }
        });

    }

}
