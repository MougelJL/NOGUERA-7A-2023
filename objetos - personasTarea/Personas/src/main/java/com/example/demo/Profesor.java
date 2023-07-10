package com.example.demo;

import java.util.Objects;

//Profesor es hijo de Persona
public class Profesor extends Persona {
    //Atributos
    private String iosfa;
    
    //Constructores de clase
    public Profesor(){}

    public Profesor(String iosfa){
        this.iosfa = iosfa;
    }

    public Profesor(String nombre, String apellido, String iosfa){
        setNombre(nombre);
        setApellido(apellido);
        this.iosfa = iosfa;
    }

    //Setters
    public void setIosfa(String iosfa){
        this.iosfa = iosfa;
    }

    //Getters
    public String getIosfa(){
        return iosfa;
    }

    //Metodo Equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Profesor profesor = (Profesor) obj;

        return Objects.equals(nombre, profesor.nombre) &&
            Objects.equals(apellido, profesor.apellido) &&
            Objects.equals(iosfa,profesor.iosfa);
    }

    //Metodo hashCode
    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + Objects.hash(nombre, apellido,iosfa);
        return result;
    }

    //Metodo toString
    @Override
    public String toString() {
        return nombre + " / " + apellido + " / " + iosfa;
    }
}
