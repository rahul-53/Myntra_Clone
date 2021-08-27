package com.example.myntra_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.PhoneAuthOptions;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

public class Login extends AppCompatActivity {
    private EditText mNumber, mName, mPassword;
    private Button mBtnContinue;
    public static final String PREF_NAME_KEY = "PREF_NAME_KEY";
    public static final String PREF_NUMBER_KEY = "PREF_NUMBER_KEY";
    public static final String PREF_BOOLEAN_KEY = "PREF_BOOLEAN_KEY";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        PreferenceHelper.getSharedPreferences(this);
        initView();
    }

    private void initView(){
        mNumber = findViewById(R.id.etNumber);
        mName = findViewById(R.id.etName);
        mPassword = findViewById(R.id.etPassword);
        mBtnContinue = findViewById(R.id.btnContinue);
        mBtnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isCredValid()){
                    PreferenceHelper.writeStringToPreference(PREF_NAME_KEY,mName.getText().toString());
                    PreferenceHelper.writeLongToPreference(PREF_NUMBER_KEY, Long.valueOf(mNumber.getText().toString()));
                    PreferenceHelper.writeBooleanToPreference(PREF_BOOLEAN_KEY,true);
                    Intent intent = new Intent(Login.this,MainActivity.class);
                    startActivity(intent);
                }

            }
        });
    }


    private boolean isCredValid(){
        if (mName.getText().toString().length()<5){
            mName.setError("name should be minimum 5 characters");
            return false;
        }
        if(mPassword.getText().toString().length()<6){
            mPassword.setError("password should be minimum 6 characters");
            return false;
        }
        if (mNumber.getText().toString().length()!=10){
            mNumber.setError("enter valid number");
            return false;
        }
        return true;
    }


}