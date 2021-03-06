package entidades;

import enums.entidades.Color;

public class Retangulo extends Shape{
	
	private double altura;
	private double largura;
	
	public Retangulo() {
		super();
	}

	public Retangulo(Color cor, double altura, double largura) {
		super(cor);
		this.altura = altura;
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	@Override
	public double area() {
		return altura * largura;
	}
	
	public String toString() {
		
		return String.format("%.2f",area());
	}
}
