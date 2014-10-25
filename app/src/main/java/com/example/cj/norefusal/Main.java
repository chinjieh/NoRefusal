package com.example.cj.norefusal;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Main extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button next = (Button) findViewById(R.id.main_bNext);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText rev = (EditText) findViewById(R.id.main_etRevelation);
                EditText phrase = (EditText)findViewById(R.id.main_etCatchPhrase);

                String revtext = rev.getText().toString();
                String phrasetext = phrase.getText().toString();

                if (revtext.trim().length() > 0 && phrasetext.trim().length() > 0) {

                    Intent slideactivity = new Intent(Main.this, Description.class);

                    Bundle bndlanimation = ActivityOptions.makeCustomAnimation(getApplicationContext(), R.anim.animation1, R.anim.animation2).toBundle();

                    startActivity(slideactivity, bndlanimation);

                }
                else{
                    showPopUp();
                }

            }
        });
    }

    private void showPopUp() {

        AlertDialog.Builder helpBuilder = new AlertDialog.Builder(this);
        helpBuilder.setTitle("Empty Fields");
        helpBuilder.setMessage("Please fill in all fields");
        helpBuilder.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int which) {
                        // Do nothing but close the dialog
                    }
                });

        // Remember, create doesn't show the dialog
        AlertDialog helpDialog = helpBuilder.create();
        helpDialog.show();
    }
}
