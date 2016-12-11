package com.jesus.Java.Java8Jesus;

public interface PersonaA {
	public void cocinar();

	default public void hablar() {
		System.out.println("Estoy hablando - Persona A");
	}
}
