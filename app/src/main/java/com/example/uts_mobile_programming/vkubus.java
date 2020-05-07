package com.example.uts_mobile_programming;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class vkubus extends AppCompatActivity {
    EditText PanjangBalok, LebarBalok, TinggiBalok;
    Button BtnHitung;
    TextView TextVolume;
    Double panjang, lebar, volume, tinggi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vkubus);

        PanjangBalok = (EditText) findViewById(R.id.PanjangBalok);
        LebarBalok = (EditText) findViewById(R.id.LebarBalok);
        TinggiBalok = (EditText) findViewById(R.id.TinggiBalok);
        BtnHitung = (Button) findViewById(R.id.BtnHitung);
        TextVolume = (TextView) findViewById(R.id.TextVolume);

        BtnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strpanjang=((EditText) PanjangBalok).getText().toString();
                String strlebar=((EditText) LebarBalok).getText().toString();
                String strtinggi=((EditText) TinggiBalok).getText().toString();
                switch (v.getId()) {
                    case R.id.BtnHitung:
                        hideKeybaord(v);
                        break;
                }

                if (PanjangBalok.length()==0) {
                    PanjangBalok.setError("Tidak Boleh Kosong!");
                }  else if (LebarBalok.length()==0) {
                    LebarBalok.setError("Tidak Boleh Kosong!");
                } else if (TinggiBalok.length()==0) {
                    TinggiBalok.setError("Tidak Boleh Kosong!");
                }
                else {
                    panjang=Double.parseDouble(strpanjang);
                    lebar=Double.parseDouble(strlebar);
                    tinggi=Double.parseDouble(strtinggi);

                    volume= panjang*lebar*tinggi;

                    TextVolume.setText(""+volume);
                }
            }
            private void hideKeybaord(View v) {
                InputMethodManager inputMethodManager = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
                inputMethodManager.hideSoftInputFromWindow(v.getApplicationWindowToken(),0);
            }
        });
    }
}
