package com.example.cj.norefusal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by User on 25/10/2014.
 */
public class Splash extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);



        Thread timer = new Thread() {
            public void run() {

                try {
                    sleep(3500);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent openMain = new Intent(Splash.this, Main.class);
                    startActivity(openMain);
                }

            }
        };
        timer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}