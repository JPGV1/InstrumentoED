package Ejercicio2;

import javax.swing.JOptionPane;

public class Procesos {
    public Procesos() {
        String tama�oStr = JOptionPane.showInputDialog("Ingrese el tama�o de los arreglos:");
        int tama�o = Integer.parseInt(tama�oStr);

        int[] arreglo1 = new int[tama�o];
        int[] arreglo2 = new int[tama�o];
        int[] resultado = new int[tama�o];

        JOptionPane.showMessageDialog(null, "Ingrese los elementos del primer arreglo:");
        for (int i = 0; i < tama�o; i++) {
            int valor = Integer.parseInt(JOptionPane.showInputDialog("Elemento " + (i + 1) + ":"));
            arreglo1[i] = valor;
        }

        JOptionPane.showMessageDialog(null, "Ingrese los elementos del segundo arreglo:");
        for (int i = 0; i < tama�o; i++) {
            int valor = Integer.parseInt(JOptionPane.showInputDialog("Elemento " + (i + 1) + ":"));
            arreglo2[i] = valor;
        }

        for (int i = 0; i < tama�o; i++) {
            resultado[i] = arreglo1[i] + arreglo2[i];
        }

        System.out.println("Elementos 1er arreglo:");
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.print(arreglo1[i] + " ");
        }

        System.out.println("\nElementos 2ndo arreglo:");
        for (int i = 0; i < arreglo2.length; i++) {
            System.out.print(arreglo2[i] + " ");
        }

        System.out.println("\nElementos suma de los arreglos:");
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " ");
        }
    }
}



