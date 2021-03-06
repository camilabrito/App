package com.emprego.app;

/**
 * Criado por Camila Brito 04/12/2017
 */

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;



public class Adaptador_da_Lista extends ArrayAdapter<ListActivity> {

    public Adaptador_da_Lista(Activity context, ArrayList<ListActivity> iten_drawer) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context,0, iten_drawer);
    }

    public Adaptador_da_Lista(Activity context, int count){
        super(context,0,count);
    }

    @NonNull
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_list, parent, false);

        }

        final ListActivity itens_adapter = getItem(position);

        TextView texto_titulo = (TextView) listItemView.findViewById(R.id.texto_titulo);
        texto_titulo.setText(itens_adapter.getTexto_titulo());

        TextView texto_data = (TextView) listItemView.findViewById(R.id.texto_data);
        texto_data.setText(itens_adapter.getTexto_data());

        return listItemView;
    }

}
