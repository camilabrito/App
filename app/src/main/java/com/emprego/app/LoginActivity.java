package com.emprego.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final ArrayList<ListActivity> lista_vagas =new ArrayList<>();
        lista_vagas.add(new ListActivity("Vaga de Analista de Sistemas", "Data: 01/12/2017 até 11/12/2017 "));
        lista_vagas.add(new ListActivity("Vaga de Recepcionista", "Data: 22/11/2017 até 01/12/2017 "));
        lista_vagas.add(new ListActivity("Vaga de Cobrador", "Data: 18/11/2017 até 22/11/2017 " ));
        lista_vagas.add(new ListActivity("Vaga de Manobrista", "Data: 16/11/2017 até 19/11/2017 "));
        lista_vagas.add(new ListActivity("Vaga de Programador", "Data: 16/11/2017 até 22/11/2017 "));
        lista_vagas.add(new ListActivity("Vaga de Analista de RH", "Data: 17/11/2017 até 04/12/2017 "));
        lista_vagas.add(new ListActivity("Vaga de Motorista", "Data: 17/11/2017até 02/12/2017 "));


        Adaptador_da_Lista adaptador = new Adaptador_da_Lista(this, lista_vagas);
        ListView lista_de_vagas = findViewById(R.id.lista_emprego);
        lista_de_vagas.setAdapter(adaptador);
    }
}
