package com.komputerkit.konversisuhu;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    EditText nilai;
    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        load();
    }
    public void load(){
        spinner = findViewById(R.id.spinner);
        nilai = findViewById(R.id.nilai);
        hasil = findViewById(R.id.hasil);
    }
    /*
    public void isiSpinner(){
        String[] isi = {"Celcius to Reamur, Celcius to Fahrenheit, Celcius to Kelvin"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,isi);
        spinner.setAdapter(adapter);
    }*/

    public void konversi(View view) {
        String pilihan = spinner.getSelectedItem().toString();

        if(nilai.getText().toString().equals("")){
            Toast.makeText(this, "Nilai Kosong", Toast.LENGTH_SHORT).show();
        }else {
            if (pilihan.equals("Celcius to Reamur")) {
                CtoR();
            }
            if (pilihan.equals("Celcius to Fahrenheit")) {
                CtoF();
            }
            if (pilihan.equals("Celcius to Kelvin")) {
                CtoK();
            }
            if (pilihan.equals("Reamur to Celcius")) {
                RtoC();
            }
            if (pilihan.equals("Reamur to Fahrenheit")) {
                RtoF();
            }
        }
    }

    public void CtoR(){
        double suhu = Double.parseDouble(nilai.getText().toString());
        double total = (4.0/5.0) * suhu;

        hasil.setText(total+"");
    }
    public void CtoF(){
        double suhu = Double.parseDouble(nilai.getText().toString());
        double total = (9.0/5.0) * suhu + 32;

        hasil.setText(total+"");
    }
    public void CtoK(){
        double suhu = Double.parseDouble(nilai.getText().toString());
        double total = 273.15 + suhu;

        hasil.setText(total+"");
    }
    public void RtoC(){
        double suhu = Double.parseDouble(nilai.getText().toString());
        double total = (5.0/4.0) * suhu;

        hasil.setText(total+"");
    }
    public void RtoF(){
        double suhu = Double.parseDouble(nilai.getText().toString());
        double total = (9.0/4.0) * suhu + 32;

        hasil.setText(total+"");
    }
}