/**
 * 
 */
package com.jesus.Java.Java8Jesus;

import java.util.*;

/**
 * @author jesus
 *
 */
public class LambdaApp {

	public void calcular() {
		Operacion operacion = (double par1, double par2) -> (par1 + par2) / 2;
		System.out.println(operacion.calcularPromedio(4, 5));
		// Operacion operacion = new Operacion()
		// {
		// @Override
		// public double calcularPromedio(double nu1 , double nu2){
		// return (nu1+nu2)/2;
		// }
		// };
	}

	public void ordenar() {
		List<String> lista = new ArrayList<>();
		lista.add("Jesus Oviedo");
		lista.add("Paola Vargas");
		lista.add("Adriana Ibarrola");

		// Collections.sort(lista, new Comparator<String>() {
		// @Override
		// public int compare(String o1, String o2) {
		// return o1.compareTo(o2);
		// }
		// });

		Collections.sort(lista, (String p1, String p2) -> p1.compareTo(p2));

		for (String elemento : lista) {
			System.out.println(elemento);
		}
	}

	public static void main(String[] args) {
		LambdaApp app = new LambdaApp();
		app.ordenar();
		app.calcular();
	}
}
