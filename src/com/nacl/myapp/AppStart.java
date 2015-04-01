package com.nacl.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.os.Handler;

/**
 * Created by Yan on 15-3-14.
 */
public class AppStart extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appstart);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(AppStart.this, Welcome.class);
                startActivity(intent);
                AppStart.this.finish();
            }
        }, 1000);
    }
}
