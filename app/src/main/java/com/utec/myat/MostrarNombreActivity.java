package com.utec.myat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.utec.myat.entities.Actividad;

public class MostrarNombreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_nombre);

        Intent intent= getIntent();
        //String nombre = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        Actividad act = (Actividad) intent.getSerializableExtra("Actividad");
        TextView textView = findViewById(R.id.textView);
        textView.setText("Cliente: " + act.getCliente() + "Contratista: " + act.getContratista() +
                "Tipo actividad: " + act.getTipoActividad() +
                "Marca: " + act.getMarca()
        );

    }
}