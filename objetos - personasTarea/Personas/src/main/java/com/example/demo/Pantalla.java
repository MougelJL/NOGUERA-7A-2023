package com.example.demo;


import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Pantalla extends JFrame {
    private JRadioButton radioButton;
    private JTextField textField;
    private JButton button;
    private JTable table;

    private List<Persona> personas;
    private String[][] arrayPersonas;
    private Persona personaAmodificarEliminar;

    public Pantalla() {
        // Configurar la ventana
        setTitle("Pantalla");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new FlowLayout());

        // Crear los componentes gráficos
        radioButton = new JRadioButton("Opción");
        textField = new JTextField(10);
        button = new JButton("Botón");
        table = new JTable();

        // Agregar los componentes a la ventana
        add(radioButton);
        add(textField);
        add(button);
        add(table);
    }

    public void asignarValores(Alumno alumno) {
        // Asignar los valores del alumno a los componentes gráficos
        textField.setText(alumno.getNombre());
        // ...
    }

    public void asignarValores(Profesor profesor) {
        // Asignar los valores del profesor a los componentes gráficos
        textField.setText(profesor.getNombre());
        // ...
    }

    public void seteoAlumno() {
        // Hacer visible el atributo correspondiente al alumno
        radioButton.setVisible(true);
        // ...
    }

    public void seteoProfesor() {
        // Hacer visible el atributo correspondiente al profesor
        radioButton.setVisible(false);
        // ...
    }

    public void llenarGrilla(List<Persona> personas) {
        // Convertir la lista de personas a un array
        arrayPersonas = new String[personas.size()][3];
        for (int i = 0; i < personas.size(); i++) {
            Persona persona = personas.get(i);
            arrayPersonas[i][0] = persona.getNombre();
            arrayPersonas[i][1] = persona.getApellido();
            arrayPersonas[i][2] = persona.getDni();
        }

        // Llenar la grilla con el array
        table.setModel(new DefaultTableModel(arrayPersonas, new String[]{"Nombre", "Apellido", "DNI"}));
    }
}