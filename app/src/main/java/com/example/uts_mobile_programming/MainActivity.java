package com.example.uts_mobile_programming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    private Button btnLogin;
    private EditText emailedittext;
    private EditText passedittext;
    private String Username, Password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailedittext = (EditText) findViewById(R.id.txtemail);
        passedittext = (EditText) findViewById(R.id.txtpassword);
        btnLogin = findViewById(R.id.btnLogin);
    }

    public void onClick(View arg0) {
        CheckLogin(btnLogin);
    }

    public void CheckLogin(View arg0) {
        Username = emailedittext.getText().toString();
        Password = passedittext.getText().toString();
        System.out.println("Login dari Username : " + Username + " Dan Password : " + Password);
        if (Username.equals("18101056") && Password.equals("18101056")) {
            Toast.makeText(getApplicationContext(), "Berhasil", Toast.LENGTH_LONG).show();
            Intent login = new Intent(MainActivity.this, menu.class);
            startActivity(login);
            this.finish();
        } else {
            Toast.makeText(getApplicationContext(), "Username / Password anda salah !", Toast.LENGTH_LONG).show();
        }
    }
}
