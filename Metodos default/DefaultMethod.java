package com.jesus.Java.Java8Jesus;

class DefaultMethod implements PersonaA, PersonaB {

	@Override
	public void cocinar() {
		System.out.println("Estoy cocinando");

	}

	// @Override
	// public void hablar() {
	// PersonaB.super.hablar();
	// System.out.println("Estoy hablando - Persona C");
	// }

	@Override
	public void hablar() {
		// PersonaA.super.hablar();
		PersonaB.super.hablar();
	}

	public static void main(String[] args) {
		DefaultMethod op = new DefaultMethod();
		op.cocinar();
		op.hablar();
	}
}
