package com.example.demo;

import java.util.Objects;

//Persona <- Alumno
public class Alumno extends Persona{
    
    //Atributos de clase
    private int legajo;

    //Constructor vacio
    public Alumno(){}

    //Constructores no vacios
    public Alumno (int legajo){
        this.legajo = legajo;
    }

    public Alumno (String nombre, String apellido, int legajo){
        setNombre(nombre);
        setApellido(apellido);
        this.legajo = legajo;
    }

    //Setters
    public void setLegajo(int legajo){
        this.legajo = legajo;
    }

    //Getters
    public int getLegajo(){
        return legajo;
    }

    //Metodos Equals, Hashcode y toString

    @Override
    public boolean equals (Object obj) {

        if (this == obj){
            return true;
        }

        if (obj == null || getClass() != obj.getClass()){
            return false;
        }

        Alumno alumno = (Alumno) obj;

        return Objects.equals(nombre, alumno.nombre) &&
            Objects.equals(apellido, alumno.apellido) &&
            Objects.equals(legajo, alumno.legajo);

    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + Objects.hash(nombre,apellido,legajo);
        return result;
    }

    @Override
    public String toString() {
        return nombre + " / "+ apellido + " / " + legajo;
    }
}
