package com.jesus.java.interfazfunc;

public class FuncInterApp {
	public double operar(double x, double y) {
		Operacion op = (n1,n2) -> n1 + n2;
		return op.calcular(x, y);
	}

	public static void main(String[] args) {
		FuncInterApp app = new FuncInterApp();
		double rpta = app.operar(1,2);
		System.out.println(rpta);
	}
}
