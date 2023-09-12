package Ejercicio1;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

 public class ProcesosRegistro {
     HashMap<String, ArrayList<String>> registro;
    int totalPersonas = 0;
    int mayoresDeEdad = 0;
    int menoresDeEdad = 0;

    public ProcesosRegistro() {
        registro = new HashMap<>();
    }

    public void iniciarRegistro() {
        JOptionPane.showMessageDialog(null, "Registro de Personas");

        while (true) {
        	
            String nombre = JOptionPane.showInputDialog("Ingrese su nombre");

 
            String documento = JOptionPane.showInputDialog("Documento:");
            String edadTexto = JOptionPane.showInputDialog("Edad:");
            int edad = Integer.parseInt(edadTexto);
            String profesion = JOptionPane.showInputDialog("Profesión:");
            String resp = JOptionPane.showInputDialog("Ingrese 'S' para ingresar otra persona, de lo contrario deje en blanco");
            if (resp == null ) {
                break;
            }
            ArrayList<String> infoPersona = new ArrayList<>();
            infoPersona.add(nombre);
            infoPersona.add(edadTexto);
            infoPersona.add(profesion);

            registro.put(documento, infoPersona);
            totalPersonas++;

            if (edad >= 18) {
                mayoresDeEdad++;
            } else {
                menoresDeEdad++;
            }
        }

        JOptionPane.showMessageDialog(null, "Resumen:\n" +
                "Total de personas registradas: " + totalPersonas + "\n" +
                "Cantidad de personas mayores de edad: " + mayoresDeEdad + "\n" +
                "Cantidad de personas menores de edad: " + menoresDeEdad);
    }
}