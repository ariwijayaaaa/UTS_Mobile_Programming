package com.example.uts_mobile_programming;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class lksegitiga extends AppCompatActivity {
    EditText PanjangAlas, Tinggi;
    Button BtnHitung;
    TextView TextKeliling, TextLuas;
    Double alas, tinggi, luas, keliling;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lksegitiga);

        PanjangAlas = (EditText) findViewById(R.id.PanjangAlas);
        Tinggi = (EditText) findViewById(R.id.Tinggi);
        BtnHitung = (Button) findViewById(R.id.BtnHitung);
        TextKeliling = (TextView) findViewById(R.id.TextKeliling);
        TextLuas = (TextView) findViewById(R.id.TextLuas);

        BtnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stralas=((EditText) PanjangAlas).getText().toString();
                String strtinggi=((EditText) Tinggi).getText().toString();
                switch (v.getId()) {
                    case R.id.BtnHitung:
                        hideKeybaord(v);
                        break;
                }

                if (PanjangAlas.length()==0) {
                    PanjangAlas.setError("Tidak Boleh Kosong!");
                }  else if (Tinggi.length()==0) {
                    Tinggi.setError("Tidak Boleh Kosong!");
                }
                else {
                    alas=Double.parseDouble(stralas);
                    tinggi=Double.parseDouble(strtinggi);

                    luas= (alas*tinggi)/2;
                    keliling= alas+alas+alas;

                    TextLuas.setText(""+luas);
                    TextKeliling.setText(""+keliling);
                }
            }
            private void hideKeybaord(View v) {
                InputMethodManager inputMethodManager = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
                inputMethodManager.hideSoftInputFromWindow(v.getApplicationWindowToken(),0);
            }
        });
    }
}
