package com.example.uts_mobile_programming;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class lkpersegi extends AppCompatActivity {
    EditText PanjangPersegi, LebarPersegi;
    Button BtnHitung;
    TextView TextKeliling, TextLuas;
    Double panjang, lebar, luas, keliling;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lkpersegi);

        PanjangPersegi = (EditText) findViewById(R.id.PanjangPersegi);
        LebarPersegi = (EditText) findViewById(R.id.LebarPersegi);
        BtnHitung = (Button) findViewById(R.id.BtnHitung);
        TextKeliling = (TextView) findViewById(R.id.TextKeliling);
        TextLuas = (TextView) findViewById(R.id.TextLuas);

        BtnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strpanjang=((EditText) PanjangPersegi).getText().toString();
                String strlebar=((EditText) LebarPersegi).getText().toString();
                switch (v.getId()) {
                    case R.id.BtnHitung:
                        hideKeybaord(v);
                        break;
                }

                if (PanjangPersegi.length()==0) {
                    PanjangPersegi.setError("Tidak Boleh Kosong!");
                }  else if (LebarPersegi.length()==0) {
                    LebarPersegi.setError("Tidak Boleh Kosong!");
                }
                else {
                    panjang=Double.parseDouble(strpanjang);
                    lebar=Double.parseDouble(strlebar);

                    luas= panjang*lebar;
                    keliling= (2*panjang)+(2*lebar);

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
