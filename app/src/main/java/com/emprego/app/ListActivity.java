package com.emprego.app;

/**
 * Criado por Camila Brito 04/12/2017.
 */


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ListActivity extends AppCompatActivity {

    private String texto_titulo;
    private String texto_data;
    private String  n_de_notificacao;
    private Button btn_Candidatar;
    private int id_img;
    private int contador;
    private String texto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        btn_Candidatar = (Button)findViewById(R.id.btn_Candidatar);
        btn_Candidatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texto;

                texto=texto_titulo.toString();
                texto=texto_data.toString();

            }
        });
    }

    public ListActivity(String titulo, String data){

        this.texto_titulo = titulo;
        this.texto_data = data;
    }
    public String getTexto_titulo(){
        return texto_titulo;
    }
    public String getTexto_data(){
        return texto_data;
    }
    public void setTexto_titulo(String texto_titulo){
        this.texto_titulo = texto_titulo;
    }
    public void setTexto_data(String texto_data){
        this.texto_data = texto_data;
    }
}
