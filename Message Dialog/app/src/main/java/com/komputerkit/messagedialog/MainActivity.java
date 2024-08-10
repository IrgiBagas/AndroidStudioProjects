package com.komputerkit.messagedialog;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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
    }
    public void showToast(String pesan){
        Toast.makeText(this, pesan, Toast.LENGTH_SHORT).show();
    }

    public void showAlert(String pesan){
        AlertDialog.Builder Alert = new AlertDialog.Builder(this);
        Alert.setTitle("PERHATIAN!");
        Alert.setMessage(pesan);

        Alert.show();
    }

    public void AlertButton(String pesan){
        AlertDialog.Builder Alert = new AlertDialog.Builder(this);
        Alert.setTitle("PERINGATAN");
        Alert.setMessage(pesan);

        Alert.setPositiveButton("YA", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                showToast("Data Sudah Dihapus");
            }
        });

        Alert.setNegativeButton("TIDAK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                showToast("Data Tidak Dihapus");
            }
        });
        Alert.show();
    }

    public void btnToast(View view) {
        showToast("Belajar Android");
    }

    public void Alert(View view) {
        showAlert("Saya Seorang Murid");
    }

    public void AlertButton(View view) {
        AlertButton("Yakin Ingin Hapus");
    }
}