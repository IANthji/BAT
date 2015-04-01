package com.nacl.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Yan on 15-3-19.
 */
public class Login extends Activity {
    private EditText mUser;
    private EditText mPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        mUser = (EditText) findViewById(R.id.login_user_edit);
        mPassword = (EditText) findViewById(R.id.login_passwd_edit);
    }

//    public void login(View v){
//        if("bat".equals(mUser.getText().toString())&&"123".equals(mPassword.getText().toString())){
//            Intent intent=new Intent();
//            intent.setClass(Login.this,MainBat)
//        }
//    }

    public void login_back(View v) {
        this.finish();
    }
}
