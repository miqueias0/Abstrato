package entidades;

import enums.entidades.Color;

public class Circulo extends Shape {

	private double raio;

	public Circulo() {
		super();
	}

	public Circulo(Color cor, double raio) {
		super(cor);
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(raio, 2);
	}

	public String toString() {
		return String.format("%.2f", area());
	}
}
