package com.example.wasaplagio;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lstChats;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstChats =(ListView) findViewById(R.id.lstChats);

        //adapter sencillo

        ArrayAdapter<String> adapter =new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                LlenarListViewSimple()
        );

        //adapter complejo

        Chatsadapter adamptercomp  = new Chatsadapter(
                getApplicationContext(),
                LlenarListViewCompuesto()
        );

        lstChats.setAdapter(adamptercomp);
    }

//ejemplo listview simple
    private List<String> LlenarListViewSimple() {
        List<String> chats = new ArrayList<String>();
        chats.add("Norman Peluquin");
        chats.add("Luigi Yau");
        chats.add("Ospina Miguel");
        chats.add("Farinhaaaa");
        chats.add("Acosta Dance");

        return chats;
    }

//ejemplo listview compuesto
    private List<chats> LlenarListViewCompuesto() {
        List<chats> chats = new ArrayList<chats>();
        chats.add(new chats("Normal Sparks", "Profe me toy quedando","4:50am","140"));
        chats.add(new chats("Sara Cedeno", "Profe me toy quedando","2:00am","3"));
        chats.add(new chats("Giovany Hoyos", "Profe me toy quedando","4:50am","140"));
        chats.add(new chats("Ramses Gutierrez", "Profe me toy quedando","4:50am","140"));
        chats.add(new chats("Aneth Acosta", "Profe me toy quedando","4:50am","140"));
        chats.add(new chats("Diego Arroyo", "Profe me toy quedando","4:50am","140"));
        chats.add(new chats("Juan Ospina", "Profe me toy quedando","4:50am","140"));
        chats.add(new chats("Marcos Candanedo", "Profe me toy quedando","4:50am","140"));

        return chats;
    }

}