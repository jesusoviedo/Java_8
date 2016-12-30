package com.jesus.java.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamApp {
	private List<String> lista;
	private List<String> numeros;

	public StreamApp() {
		lista = new ArrayList<>();
		lista.add("Javier");
		lista.add("Cesar");
		lista.add("Gustavo");
		lista.add("Andres");
		lista.add("Andrea");

		numeros = new ArrayList<>();
		numeros.add("7");
		numeros.add("28");
		numeros.add("3");
		numeros.add("180");
		numeros.add("333");
	}

	public void filtrar() {
		lista.stream().filter(x -> x.startsWith("A")).forEach(System.out::println);
		// lista.stream().filter(x -> x.startsWith("A")).forEach(x ->
		// System.out.println(x));
	}

	public void odernar() {
		lista.stream().sorted().forEach(System.out::println);
		// lista.stream().sorted().forEach(x -> System.out.println(x));
		lista.stream().sorted((x, y) -> y.compareTo(x)).forEach(System.out::println);
	}

	public void transformar() {
		lista.stream().map(String::toUpperCase).forEach(System.out::println);
		numeros.stream().map(x -> Integer.parseInt(x) + 1).forEach(System.out::println);
	}

	public void limitar() {
		lista.stream().limit(3).forEach(System.out::println);
	}

	public void contar() {
		System.out.println(numeros.stream().count());
	}

	public static void main(String[] args) {
		StreamApp app = new StreamApp();
		app.filtrar();
		System.out.println("====================");
		app.odernar();
		System.out.println("====================");
		app.transformar();
		System.out.println("====================");
		app.limitar();
		System.out.println("====================");
		app.contar();
	}
}
