package com.jesus.java.metodoReferencia;

import java.util.Arrays;

public class MetRefApp {

	public static void referenciaMedodoStatic() {
		System.out.println("Metodo referido static");
	}

	public void referenciaMedodoInstanciaObjetoArbitrario() {
		String[] nombres = { "Jesus", "Maria", "Andrea", "Anto" };

		// Arrays.sort(nombres, new Comparator<String>() {
		// @Override
		// public int compare(String o1, String o2) {
		// return o1.compareToIgnoreCase(o2);
		// }
		// });

		// Arrays.sort(nombres, (s1,s2) -> s1.compareToIgnoreCase(s2));
		// System.out.println(Arrays.toString(nombres));

		Arrays.sort(nombres, String::compareToIgnoreCase);
		System.out.println(Arrays.toString(nombres));
	}

	public void referenciaMedodoInstanciaObjetoParticular() {
		System.out.println("Metodo referido instancia de clase");
	}

	public void referenciaConstructor() {
		// IPersona iper = new IPersona() {
		// @Override
		// public Persona crear(int id, String nombre) {
		// return new Persona(id, nombre);
		// }
		// };
		// iper.crear(1,"Jesus Oviedo");

		// IPersona iper = (x,y) -> (new Persona(x,y));
		// Persona per2 = iper.crear(1,"Jesus Oviedo");
		// System.out.println(per2.getId() + "-"+per2.getNombre());

		IPersona iper = Persona::new;
		Persona per2 = iper.crear(1, "Jesus Oviedo");
		System.out.println(per2.getId() + "-" + per2.getNombre());
	}

	public void operar() {
		// OperacionMetodoRef op = () -> MetRefApp.referenciaMedodoStatic();
		// op.saludar();

		// forma 1
		OperacionMetodoRef op2 = MetRefApp::referenciaMedodoStatic;
		op2.saludar();
	}

	public static void main(String[] args) {
		MetRefApp app = new MetRefApp();
		app.operar();
		// forma 2
		app.referenciaMedodoInstanciaObjetoArbitrario();
		// forma 3
		OperacionMetodoRef op = app::referenciaMedodoInstanciaObjetoParticular;
		op.saludar();
		// forma 4
		app.referenciaConstructor();
	}
}
