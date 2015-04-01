package com.nacl.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Yan on 15-3-14.
 */
public class Welcome extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
    }

    public void welcome_login(View v) {
        Intent intent = new Intent();
        intent.setClass(Welcome.this, Login.class);
        startActivity(intent);
    }

    public void welcome_register(View v) {
        Intent intent = new Intent();
        intent.setClass(Welcome.this, Regist.class);
    }
}
