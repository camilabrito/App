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

        final ArrayList<Itens_da_lista> lista_vagas = new ArrayList<>();
        lista_vagas.add(new Itens_da_lista("Vaga de motorista", "Data: 21/11/2017"));
        lista_vagas.add(new Itens_da_lista("Vaga de recepcionista", "Data: 22/11/2017"));
        lista_vagas.add(new Itens_da_lista("Vaga de cobrador", "Data: 18/11/2017"));
        lista_vagas.add(new Itens_da_lista("Vaga de manobrista", "Data: 16/11/2017"));
        lista_vagas.add(new Itens_da_lista("Vaga de programador", "Data: 16/11/2017"));
        lista_vagas.add(new Itens_da_lista("Vaga de analista de RH", "Data: 17/11/2017"));

        Adaptador_da_Lista adaptador = new Adaptador_da_Lista(this, lista_vagas);
        ListView lista_de_vagas = findViewById(R.id.lista_emprego);
        lista_de_vagas.setAdapter(adaptador);
    }
}
