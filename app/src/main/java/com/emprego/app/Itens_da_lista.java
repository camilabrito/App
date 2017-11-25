package com.emprego.app;

/**
 * Created by demet on 21/03/2017.
 */

public class Itens_da_lista {

    public String texto_titulo;
    public String texto_data;
    public int id_imagem;
    public String numero_notificacao;
    public Integer contador;

    public Itens_da_lista(String titulo, String data) {
        this.texto_titulo = titulo;
        this.texto_data = data;
    }

    public String getTexto_titulo() {
        return texto_titulo;
    }

    public void setTexto_titulo(String texto_titulo) {
        this.texto_titulo = texto_titulo;
    }

    public String getTexto_data() {
        return texto_data;
    }

    public void setTexto_data(String texto_data) {
        this.texto_data = texto_data;
    }

}
