package com.example.listviewv10;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Datos extends BaseAdapter {
    LayoutInflater inflater = null;
    Context context;
    String [] titulos;

    public Datos(Context context, String[] titulos, String[] descripciones, int[] avatar) {
        this.context = context;
        this.titulos = titulos;
        this.descripciones = descripciones;
        this.avatar = avatar;

        inflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    String [] descripciones;
    int [] avatar;

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View vista = inflater.inflate(R.layout.item_fila, null);
        TextView Titulo = vista.findViewById(R.id.titulo);
        TextView Descripcion = vista.findViewById(R.id.descripcion);
        ImageView Avatar = vista.findViewById(R.id.avatar);

        Titulo.setText(titulos[i]);
        Descripcion.setText(descripciones[i]);
        Avatar.setImageResource(avatar[i]);
        return vista;
    }
    @Override
    public int getCount() {
        return avatar.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }


}
