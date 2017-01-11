package com.jesus.java.optional;

import java.util.Optional;

import javax.swing.text.NumberFormatter;

public class OptionalApp {
	
	public void probar(String valor){
//		System.out.println(valor.contains("jesus"));
		
		try {
			Optional op = Optional.empty();
			op.get();
		} catch (Exception e) {
			System.out.println("No hay elemento");
		}
		
	}
	
	public void orElse (String valor){
		Optional<String> op = Optional.ofNullable(valor);
		String dato=op.orElse("Valor por defecto en caso de ser null el parametro");
		System.out.println(dato);
	}
	
	public void orElseThrow (String valor){
		Optional<String> op = Optional.ofNullable(valor);
		op.orElseThrow(NumberFormatException::new);
	}
	
	public void isPresent (String valor){
		Optional<String> op = Optional.ofNullable(valor);
		System.out.println(op.isPresent());
	}
	
	public static void main(String[] args) {
		OptionalApp app = new OptionalApp();
		app.probar("Jesus");
		
		System.out.println("---------------------------");
		app.orElse(null);
		
		System.out.println("---------------------------");
		app.orElse("Parametro enviado correctamente");

		System.out.println("---------------------------");
		app.isPresent(null);
		
		System.out.println("---------------------------");
		app.orElseThrow(null);
	}

}
