package com.example.harmadik;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {


    TextView adatok;
    Button vissza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Intent myIntent = getIntent();
        Bundle b = myIntent.getExtras();

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        adatok = (TextView) findViewById(R.id.tv_login);
        vissza = (Button) findViewById(R.id.btn_back);

        String felhasznalo = (String) b.get("felhasznalonev");
        String jelszo = (String) b.get("jelszo");
        adatok = (TextView) findViewById(R.id.tv_login);
        adatok.setText(felhasznalo+" "+jelszo);



        vissza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });




    }
}