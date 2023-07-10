package com.example.demo;

import java.util.Objects;

public class Persona {
    protected String nombre;
    protected String apellido;
    
    public Persona (){}

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Persona persona = (Persona) obj;

        return Objects.equals(nombre, persona.nombre) &&
            Objects.equals(apellido, persona.apellido);
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + Objects.hash(nombre, apellido);
        return result;
    }


    @Override
    public String toString() {
        return nombre + " / " + apellido;
    }

}

