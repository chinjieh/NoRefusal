package com.example.cj.norefusal;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.MediaController;
import android.widget.VideoView;

public class Splash extends Activity {

   public VideoView myVideoView;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);



        myVideoView = (VideoView) findViewById(R.id.videoView1);




        try {



            Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.newes);

            myVideoView.setVideoURI(uri);
            myVideoView.start();


            myVideoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                public void onCompletion(MediaPlayer mp) {

                    Splash.this.runOnUiThread(new Runnable() {

                        @Override
                        public void run() {
                            // TODO Auto-generated method stub
                            Intent main = new Intent(Splash.this, Main.class);
                            Splash.this.startActivity(main);
                            Splash.this.finish();
                        }
                    });
                }

            });
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
          //  Intent openNext = new Intent(Splash.this, Main.class);
          //  startActivity(openNext);

        }





    }

}