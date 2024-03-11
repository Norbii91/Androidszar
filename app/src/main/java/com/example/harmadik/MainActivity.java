package com.example.harmadik;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {



    TextView siker,felh_ki, jelszo_ki;
    EditText felh_be,jelszo_be;

    Button bejelentkezes, mentes,mutat;


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

        siker = (TextView) findViewById(R.id.tv_siker);
        felh_ki = (TextView) findViewById(R.id.tv_alap);
        jelszo_ki = (TextView) findViewById(R.id.tv_alap2);

        felh_be = (EditText) findViewById(R.id.et_felh);
        jelszo_be = (EditText) findViewById(R.id.et_jelszo);
        bejelentkezes = (Button) findViewById(R.id.btn_login);

        felh_ki.setVisibility(View.GONE);
        jelszo_ki.setVisibility(View.GONE);

        bejelentkezes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String felhasznalo_nev = felh_be.getText().toString();
                String jelszo = jelszo_be.getText().toString();



                Intent myIntent = new Intent(MainActivity.this,MainActivity2.class);

                myIntent.putExtra("felhasznalonev",felhasznalo_nev);
                myIntent.putExtra("jelszo",jelszo);

                MainActivity.this.startActivity(myIntent);



            }
        });



    }
}