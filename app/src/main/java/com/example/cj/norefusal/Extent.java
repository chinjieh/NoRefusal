package com.example.cj.norefusal;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.PopupWindow;

/**
 * Created by User on 25/10/2014.
 */
public class Extent extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.extent);

        Button next = (Button) findViewById(R.id.bExtent);
        Button popup = (Button) findViewById (R.id.popup);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CheckBox check1 = (CheckBox) findViewById (R.id.extent_cbCheck1);
                CheckBox check2 = (CheckBox) findViewById (R.id.extent_cbCheck2);
                CheckBox check3 = (CheckBox) findViewById (R.id.extent_cbCheck3);
                CheckBox check4 = (CheckBox) findViewById (R.id.extent_cbCheck4);
                CheckBox check5 = (CheckBox) findViewById (R.id.extent_cbCheck5);
                CheckBox check6 = (CheckBox) findViewById (R.id.extent_cbCheck6);
                CheckBox check7 = (CheckBox) findViewById (R.id.extent_cbCheck7);
                CheckBox check8 = (CheckBox) findViewById (R.id.extent_cbCheck8);
                if (check1.isChecked() || check2.isChecked() || check3.isChecked() || check4.isChecked() || check5.isChecked()
                        || check6.isChecked() || check7.isChecked() || check8.isChecked() ){

                    Intent a = new Intent(Extent.this, Contact.class);
                    startActivity(a);
                }
                else{
                    showPopUp();
                }

            }
        });

    }

    private void showPopUp() {

        AlertDialog.Builder helpBuilder = new AlertDialog.Builder(this);
        helpBuilder.setTitle("No option selected");
        helpBuilder.setMessage("Please select at least one option");
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





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
