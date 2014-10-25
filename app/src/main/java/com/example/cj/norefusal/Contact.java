package com.example.cj.norefusal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by User on 25/10/2014.
 */
public class Contact extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);

        Button next = (Button) findViewById(R.id.button1);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Class ourClass = null;

                //ourClass = Class.forName("com.example.cj.norefusal.Description");
                Intent a = new Intent(Contact.this, End.class);
                startActivity(a);


            }
        });

    }

}
