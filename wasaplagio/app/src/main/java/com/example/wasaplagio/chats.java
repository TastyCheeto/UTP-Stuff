package com.example.wasaplagio;

import java.security.PrivateKey;

public class chats
{
    private String Nombre;
    private String Chat;
    private String Hora;
    private String ChatCount;
    public chats(String nombre, String chat, String hora, String chatCount) {
        Nombre = nombre;
        Chat = chat;
        Hora = hora;
        ChatCount = chatCount;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getChat() {
        return Chat;
    }

    public void setChat(String chat) {
        Chat = chat;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String hora) {
        Hora = hora;
    }

    public String getChatCount() {
        return ChatCount;
    }

    public void setChatCount(String chatCount) {
        ChatCount = chatCount;
    }
}
