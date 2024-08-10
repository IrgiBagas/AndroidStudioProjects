package com.komputerkit.kalkulator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView hasil;
    EditText bil_1, bil_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.kalkulator), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        load();
    }
    public void load(){
        hasil = findViewById(R.id.hasil);
        bil_1 = findViewById(R.id.bil_1);
        bil_2 = findViewById(R.id.bil_2);
    }

    public void tambah(View view) {
        if (bil_1.getText().toString().equals("") || bil_2.getText().toString().equals("")){
            Toast.makeText(this, "Angka Kosong", Toast.LENGTH_SHORT).show();
        }else {
            double bil1 = Double.parseDouble(bil_1.getText().toString());
            double bil2 = Double.parseDouble(bil_2.getText().toString());

            double total = bil1 + bil2;

            hasil.setText(hasil + "");
        }
    }

    public void kurang(View view) {
        if (bil_1.getText().toString().equals("") || bil_2.getText().toString().equals("")){
            Toast.makeText(this, "Angka Kosong", Toast.LENGTH_SHORT).show();
        }else {
            double bil1 = Double.parseDouble(bil_1.getText().toString());
            double bil2 = Double.parseDouble(bil_2.getText().toString());

            double total = bil1 - bil2;

            hasil.setText(hasil + "");
        }
    }

    public void kali(View view) {
        if (bil_1.getText().toString().equals("") || bil_2.getText().toString().equals("")){
            Toast.makeText(this, "Angka Kosong", Toast.LENGTH_SHORT).show();
        }else {
            double bil1 = Double.parseDouble(bil_1.getText().toString());
            double bil2 = Double.parseDouble(bil_2.getText().toString());

            double total = bil1 * bil2;

            hasil.setText(hasil + "");
        }
    }

    public void bagi(View view) {
        if (bil_1.getText().toString().equals("") || bil_2.getText().toString().equals("")){
            Toast.makeText(this, "Angka Kosong", Toast.LENGTH_SHORT).show();
        }else {
            double bil1 = Double.parseDouble(bil_1.getText().toString());
            double bil2 = Double.parseDouble(bil_2.getText().toString());

            double total = bil1 / bil2;

            hasil.setText(hasil + "");
        }
    }
}