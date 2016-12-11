package com.jesus.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ColeccionApp {

	private List<String> lista;

	public void llenarLista() {
		lista = new ArrayList<>();
		lista.add("Jesus");
		lista.add("Javier");
		lista.add("Angel");
		lista.add("Fernanda");
		lista.add("Andrea");
		lista.add("Vicky");
		lista.add("Pamela");
		lista.add("Yissela");
		lista.add("Ariel");
		lista.add("Jorge");
		lista.add("Sebastian");
	}

	public void usarForEach() {
		// forma tradicuional
		// for (String elemento : lista) {
		// System.out.println(elemento);
		// }

		// usando lambda
		// lista.forEach(x -> System.out.println(x));

		// usando referencia a metodo
		lista.forEach(System.out::println);
	}

	public void usarRemoveIf() {
		// esto da error
		// for (String elemento : lista) {
		// if (elemento.equalsIgnoreCase("Jesus")){
		// lista.remove(elemento);
		// }
		// }

		// forma tradicuional
		// Iterator<String> it = lista.iterator();
		// while(it.hasNext()){
		// if (it.next().equalsIgnoreCase("Jesus")) {
		// it.remove();
		// }}

		// usando lambda
		lista.removeIf(x -> x.equalsIgnoreCase("Jesus"));
	}

	public void usarSort() {
		// forma tradicional
		// Collections.sort(lista);

		// usando lambda
		lista.sort((x, y) -> x.compareToIgnoreCase(y));
	}

	public static void main(String[] args) {

		ColeccionApp app = new ColeccionApp();
		System.out.println("--------------");
		app.llenarLista();
		app.usarForEach();
		System.out.println("--------------");
		app.usarRemoveIf();
		app.usarForEach();
		System.out.println("--------------");
		app.usarSort();
		app.usarForEach();

	}

}
