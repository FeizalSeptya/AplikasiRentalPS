package com.example.rentalps;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText edtnama, edtNotel, edtpilihanPS, edtDurasi, edtharga, edtAlamat;
    private Button btnproses;
    private Button btnhapus;
    private Button btnexit;
    private TextView txtNotel;
    private TextView txtAlamat;
    private TextView txtnamasewa;
    private TextView txtPilihanPS;
    private TextView txtDurasi;
    private TextView txtharga;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("TRIXXY PLAYSTATION");

        edtnama= (EditText) findViewById(R.id.namapenyewa);
        edtpilihanPS= (EditText) findViewById(R.id.pilihanPS);
        edtNotel = (EditText) findViewById(R.id.notel);
        edtDurasi = (EditText) findViewById(R.id.durasipinjam);
        edtharga = (EditText) findViewById(R.id.harga);
        edtAlamat = (EditText) findViewById(R.id.alamat);
        btnproses = (Button) findViewById(R.id.tombol1);
        btnhapus = (Button) findViewById(R.id.tombol2);
        btnexit = (Button) findViewById(R.id.tombol3);
        txtNotel =(TextView) findViewById(R.id.tNotel);
        txtAlamat = (TextView) findViewById(R.id.tAlamat);
        txtnamasewa = (TextView) findViewById(R.id.NamaData);
        txtPilihanPS = (TextView) findViewById(R.id.PilihanPSsewa);
        txtDurasi = (TextView) findViewById(R.id.tDurasi);
        txtharga = (TextView) findViewById(R.id.total);


        //memberikan action pada tombol proses

        btnproses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String namaData = edtnama.getText().toString().trim();
                String pilihanPSsewa = edtpilihanPS.getText().toString().trim();
                String total = edtharga.getText().toString().trim();
                String tDurasi = edtDurasi.getText().toString().trim();
                String tAlamat = edtAlamat.getText().toString().trim();
                String tNotel = edtNotel.getText().toString().trim();


                double h = Double.parseDouble(total);
                txtharga.setText("Total = " + total);
                txtDurasi.setText("Durasi = " + tDurasi);
                txtnamasewa.setText("Nama Penyewa = " + namaData);
                txtPilihanPS.setText("PS = " + pilihanPSsewa);
                txtAlamat.setText("Alamat Penyewa = " + tAlamat );
                txtNotel.setText("Nomor Telepon = " + tNotel);


                //memberikan action pada tombol reset data
            }
        });
        btnhapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtnamasewa.setText("Nama Penyewa = ");
                txtPilihanPS.setText("PS = ");
                txtharga.setText("Total = ");
                txtDurasi.setText("Durasi = ");
                txtAlamat.setText("Alamat Penyewa = ");
                txtNotel.setText("Nomor Telepon = ");

                Toast.makeText(getApplicationContext(),"Data berhasil direset", Toast.LENGTH_LONG).show();

                // memberikan action pada tombol keluar
            }
        });
        btnexit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                moveTaskToBack(true);
            }
        });
    }
}
