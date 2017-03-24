package com.example.luiscobian.testlogin;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.titulonombre)
    TextView nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        if(!SessionManager.get(this).getLogeado())
        {
            startActivity(new
                    Intent(this, AccesoActivity.class));
            finish();
            return;
        }

        String nom = getApplicationContext()
                .getSharedPreferences("sesion"
                        , Context.MODE_PRIVATE)
                .getString("nombre","No se encontro");
        nombre.setText(nom);


    }
}
