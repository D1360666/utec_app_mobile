package com.utec.myat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.utec.myat.entities.Actividad;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    public static final String EXTRA_MESSAGE ="com.utec.myat.MESSAGE";
    /***
     * Defino array para cargar Spinners
     */
    String[] listaActividad = {"Instalación", "Resparación", "Desinstalación"};

    String[] listaTipoVehiculo = {"Tractor", "Vehiculo", "Forwarder", "Harvester", "Camión"};

    String[] listaMarcas = {"JD", "CAT", "Valtra", "Case", "New Holland", "Mercedes Benz"};

    String[] listaModelos = {"BM110", "6403", "D6", "D8", "D5"};

    String[] listaContratistas = {"Aprofor", "Almojana", "Choique", "Kolbasiuk", "UPM"};

    String[] listaClientes = {"UPM", "AF", "AC", "MDP", "MCF"};

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        /***
         * Cargo Array a los spinners correspondientes
         */

        //--> Actividades
        Spinner actividades = (Spinner) findViewById(R.id.cboTipoAct);

        ArrayAdapter<String> adapterAct = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listaActividad);
        adapterAct.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        actividades.setOnItemSelectedListener(this);
        actividades.setAdapter(adapterAct);

        //--> Tipos Vehiculos
        Spinner tiposVehiculo = (Spinner) findViewById(R.id.cboTipoVehiculo);
        ArrayAdapter<String> adapterTipoVehiculo = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listaTipoVehiculo);
        adapterTipoVehiculo.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        tiposVehiculo.setAdapter(adapterTipoVehiculo);

        //--> Marcas
        Spinner marcas = (Spinner) findViewById(R.id.cboMarca);
        ArrayAdapter<String> adapterMarcas = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listaMarcas);
        adapterMarcas.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        marcas.setAdapter(adapterMarcas);

        //--> Modelos
        Spinner modelos = (Spinner) findViewById(R.id.cboModelo);
        ArrayAdapter<String> adapterModelos = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listaModelos);
        adapterModelos.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        modelos.setAdapter(adapterModelos);

        //--> Contratistas
        Spinner contratistas = (Spinner) findViewById(R.id.cboContratista);
        ArrayAdapter<String> adapterContratistas = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listaContratistas);
        adapterContratistas.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        contratistas.setAdapter(adapterContratistas);

        //--> Clientes
        Spinner clientes = (Spinner) findViewById(R.id.cboCliente);
        ArrayAdapter<String> adapterClientes = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listaClientes);
        adapterClientes.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        clientes.setAdapter(adapterClientes);

    }

    public void enviarNombre(View view){

        Actividad act = new Actividad();
        Intent intent = new Intent(this, MostrarNombreActivity.class);
        //EditText nombreText = (EditText) findViewById(R.id.txtId);
        //String nombre = nombreText.getText().toString();
        EditText txtId = (EditText) findViewById(R.id.txtId);
        Spinner actividades = (Spinner) findViewById(R.id.cboTipoAct);
        Spinner tipoVehiculo = (Spinner) findViewById(R.id.cboTipoVehiculo);
        Spinner marca = (Spinner) findViewById(R.id.cboMarca);
        Spinner modelo = (Spinner) findViewById(R.id.cboModelo);
        Spinner contratista = (Spinner) findViewById(R.id.cboContratista);
        Spinner cliente = (Spinner) findViewById(R.id.cboCliente);
        EditText txtFecha = (EditText) findViewById(R.id.txtDate);
        EditText txtNro = (EditText) findViewById(R.id.txtNro);
        EditText txtNro2 = (EditText) findViewById(R.id.txtNro2);
        EditText txtDescAct = (EditText) findViewById(R.id.txtActividad);

        act.setId(Integer.parseInt(txtId.getText().toString()));
        act.setTipoActividad(actividades.getSelectedItem().toString());
        act.setCliente(cliente.getSelectedItem().toString());
        act.setContratista(contratista.getSelectedItem().toString());
        act.setMarca(marca.getSelectedItem().toString());
        act.setModelo(modelo.getSelectedItem().toString());
      //  act.setFecha((Date)(txtFecha.getText()));
        act.setCliente(cliente.getSelectedItem().toString());
        act.setNro(Integer.parseInt(txtNro.getText().toString()));
        act.setNro2(Integer.parseInt(txtNro2.getText().toString()));
        act.setDescActividad(txtDescAct.getText().toString());

        intent.putExtra("Actividad", act);
        startActivity(intent);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(getApplicationContext(),listaActividad[i] , Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}