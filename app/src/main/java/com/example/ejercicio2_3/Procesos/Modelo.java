package com.example.ejercicio2_3.Procesos;

import android.graphics.Bitmap;

public class Modelo {
    private String Nombre;
    private Bitmap image;

    public Modelo(String nombre, Bitmap image) {
        Nombre = nombre;
        this.image = image;
    }

    public String getNombre() {

        return Nombre;
    }

    public void setNombre(String nombre) {

        Nombre = nombre;
    }

    public Bitmap getImage() {

        return image;
    }

    public void setImage(Bitmap image) {

        this.image = image;
    }
}

