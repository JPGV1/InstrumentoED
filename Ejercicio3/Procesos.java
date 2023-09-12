package Ejercicio3;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class Procesos {
	int estrato;
	double descuento, sueldoActual;
	double resultado;
	String descuentoTxt, nombre, sueldoActualTxt, estratoTxt;
	HashMap<String, ArrayList<String>> AlmacenamientoDatos;
	ArrayList<String> Almacenamiento;
	public Procesos() {
		final double porcentajeD1 = 0.02;
		final double porcentajeD2 = 0.04;
		final double porcentajeD3 = 0.08;
		final double porcentajeD4 = 0.10;
		
		 AlmacenamientoDatos = new HashMap<>();
		 while (true) {
	        	
	            nombre = JOptionPane.showInputDialog("Ingrese su nombre");
	            sueldoActualTxt = JOptionPane.showInputDialog("Sueldo Actual");
	            sueldoActual = Double.parseDouble(sueldoActualTxt);
	            estratoTxt = JOptionPane.showInputDialog("Estrato:");
	            estrato = Integer.parseInt(estratoTxt);
	           
	            switch (estrato) {
				case  1: {
					descuento= sueldoActual * porcentajeD1;
					;
				}
				case  2: {
					descuento= sueldoActual * porcentajeD1;
					;
				}
				case  3: {
					descuento= sueldoActual * porcentajeD2;
					;
				}
				case  4: {
					descuento= sueldoActual * porcentajeD2;
					;
				}
				case  5: {
					descuento= sueldoActual * porcentajeD3;
					;
				}
				case  6: {
					descuento= sueldoActual * porcentajeD4;
					;	
				}
				descuentoTxt= descuento+"";
				default:
					throw new IllegalArgumentException("Unexpected value: " + estrato);
				}
	            
	            	Almacenamiento.add(sueldoActualTxt);
		            Almacenamiento.add(estratoTxt);
		            Almacenamiento.add(descuentoTxt);
		            AlmacenamientoDatos.put(nombre, Almacenamiento);
	            
	}
		 }
}
