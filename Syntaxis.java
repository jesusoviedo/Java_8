package com.jesus.Java.Java8Jesus;

public class Syntaxis {

	public double probarSyntaxis() {

		// Operacion operacion = (double x, double y) -> (x + y) / 2;

		// Operacion operacion = (double x, double y) -> {return (x + y) / 2;};

		// Operacion operacion = (double x, double y) -> {
		// double a=2.0;
		// System.out.println(a);
		// return (x + y) / 2 + a;
		// };

		// Operacion operacion = (x, y) -> {
		// double a=2.0;
		// System.out.println(a);
		// return (x + y) / 2 + a;
		// };

		// Operacion operacion = (x,y) -> (x + y) / 2;

		// Operacion operacion = () -> 23;

		// Operacion operacion = () -> {
		// int x=10;
		// int y=15;
		// return x+y;
		// };

		Operacion operacion = (x, y) -> (x + y) / 2;
		return operacion.calcularPromedio(1, 7);

	}

	public static void main(String[] args) {
		Syntaxis syn = new Syntaxis();
		System.out.println(syn.probarSyntaxis());

	}
}
