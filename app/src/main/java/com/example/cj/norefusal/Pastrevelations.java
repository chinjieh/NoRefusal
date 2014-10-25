package com.example.cj.norefusal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by deathsync on 26/10/2014.
 */
public class Pastrevelations extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.past_revelations);

        Button next = (Button)findViewById(R.id.bPastRevmain);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Pastrevelations.this, Main.class);
                startActivity(a);
            }
        });
    }
}
