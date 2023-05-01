package com.example.wasaplagio;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class Chatsadapter extends ArrayAdapter<chats> {
    List<chats> opciones;
    public Chatsadapter(Context context, List<chats> datos){
        super(context,R.layout.listview_chats, datos);
        
        opciones = datos;
    }


    public View getView(int position, View convertView,ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.listview_chats, null);
        
        TextView nombre =(TextView)item.findViewById(R.id.txtnombre);
        nombre.setText(opciones.get(position).getNombre());

        TextView chat =(TextView)item.findViewById(R.id.txtchat);
        chat.setText(opciones.get(position).getChat());

        TextView hora =(TextView)item.findViewById(R.id.txthora);
        hora.setText(opciones.get(position).getHora());

        TextView chatcount =(TextView)item.findViewById(R.id.txtchatcount);
        chatcount.setText(opciones.get(position).getChatCount());
        
        return item;
    }
}
