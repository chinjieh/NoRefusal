package com.example.cj.norefusal;

import android.os.Bundle;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.view.Menu;
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

               // Intent a = new Intent(Contact.this, End.class);
                Intent slideactivity = new Intent(Contact.this, End.class);

                Bundle bndlanimation = ActivityOptions.makeCustomAnimation(getApplicationContext(), R.anim.animation1, R.anim.animation2).toBundle();
                startActivity(slideactivity, bndlanimation);
                // startActivity(a);


            }
        });

    }

}
