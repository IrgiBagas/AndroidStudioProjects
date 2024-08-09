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
    EditText bil1, bil2;
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
        bil1 = findViewById(R.id.bil1);
        bil2 = findViewById(R.id.bil2);
    }

    public void tambah(View view) {
        if (bil1.getText().toString().equals("") || bil2.getText().toString().equals("")){
            Toast.makeText(this, "Angka Kosong", Toast.LENGTH_SHORT).show();
        }else{
            double bil_1 = Double.parseDouble(bil1.getText().toString());
            double bil_2 = Double.parseDouble(bil2.getText().toString());

            double total = bil_1 + bil_2;

            hasil.setText(total+"");
        }
    }

    public void kurang(View view) {
        if (bil1.getText().toString().equals("") || bil2.getText().toString().equals("")){
            Toast.makeText(this, "Angka Kosong", Toast.LENGTH_SHORT).show();
        }else{
            double bil_1 = Double.parseDouble(bil1.getText().toString());
            double bil_2 = Double.parseDouble(bil2.getText().toString());

            double total = bil_1 - bil_2;

            hasil.setText(total+"");
        }
    }

    public void kali(View view) {
        if (bil1.getText().toString().equals("") || bil2.getText().toString().equals("")){
            Toast.makeText(this, "Angka Kosong", Toast.LENGTH_SHORT).show();
        }else{
            double bil_1 = Double.parseDouble(bil1.getText().toString());
            double bil_2 = Double.parseDouble(bil2.getText().toString());

            double total = bil_1 * bil_2;

            hasil.setText(total+"");
        }
    }

    public void bagi(View view) {
        if (bil1.getText().toString().equals("") || bil2.getText().toString().equals("")){
            Toast.makeText(this, "Angka Kosong", Toast.LENGTH_SHORT).show();
        }else{
            double bil_1 = Double.parseDouble(bil1.getText().toString());
            double bil_2 = Double.parseDouble(bil2.getText().toString());

            double total = bil_1 / bil_2;

            hasil.setText(total+"");
        }
    }
}