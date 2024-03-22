package com.universitaskuningan.modul2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void hitung(View v) {
        EditText namaInput = findViewById(R.id.nama);
        String nama = namaInput.getText().toString();

        CheckBox statusInput = findViewById(R.id.menikah);
        boolean isMenikah = statusInput.isChecked();
        String status = isMenikah ? "Menikah" : "Belum Menikah";

        RadioGroup golonganInput = findViewById(R.id.rgGolongan);
        int golonganId = golonganInput.getCheckedRadioButtonId();
        RadioButton selectedGolongan = findViewById(golonganId);
        String golongan = selectedGolongan.getText().toString();

        int gajiGolongan = 0;
        if (golongan.equals("Golongan 1")) {
            gajiGolongan = 1000000;
        } else if (golongan.equals("Golongan 2")) {
            gajiGolongan = 2000000;
        }

        int gajiStatus = isMenikah ? 500000 : 0;

        int totalGaji = gajiGolongan + gajiStatus;

        TextView outputNama = findViewById(R.id.outputNama);
        outputNama.setText("Nama: " + nama);

        TextView outputStatus = findViewById(R.id.outputStatus);
        outputStatus.setText("Status: " + status);

        TextView outputGolongan = findViewById(R.id.outputGolongan);
        outputGolongan.setText("Golongan: " + golongan);

        TextView outputGaji = findViewById(R.id.outputGaji);
        outputGaji.setText("Total Gaji: " + totalGaji);
    }
}
