package com.example.cj.norefusal;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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

                EditText edittext = (EditText) findViewById(R.id.etEmail);
                EditText contacttext = (EditText)findViewById(R.id.etPhone);

                String text = edittext.getText().toString();
                String contactnum = contacttext.getText().toString();

                if (text.trim().length() > 0 && contactnum.trim().length() > 0){
                    Intent slideactivity = new Intent(Contact.this, End.class);

                    Bundle bndlanimation = ActivityOptions.makeCustomAnimation(getApplicationContext(), R.anim.animation1, R.anim.animation2).toBundle();
                    startActivity(slideactivity, bndlanimation);

                }
                else{
                    showPopUp();
                }
               // Intent a = new Intent(Contact.this, End.class);

                // startActivity(a);


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
