package com.studio.alba33.firstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Deklarasi Widget
    TextView txtWelcome;
    EditText etNama, etSekolah;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("Hallo, : " + etNama + etSekolah);

        //Memanggil id dari TextView
        txtWelcome = (TextView) findViewById(R.id.txtWelcome);
        etNama = (EditText)findViewById(R.id.etNama);
        etSekolah = (EditText)findViewById(R.id.etSekolah);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        //Menambahkan Aksi Ketika btnsSubmit diklik
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Mengambil nilai dari etNama dan etSekolah
                String nNama = etNama.getText().toString();
                String nSekolah = etSekolah.getText().toString();
                //Menampilkan Hasil ke textview
                txtWelcome.setText("Hallo, " + nNama + nSekolah);

            }
        });

    }
}
