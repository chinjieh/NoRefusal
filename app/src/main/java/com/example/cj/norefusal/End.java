package com.example.cj.norefusal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by User on 25/10/2014.
 */
public class End extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.end);

        Button next = (Button) findViewById(R.id.bReturnEnd);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent a = new Intent(End.this, Main.class);
                startActivity(a);


            }
        });


    }
}
