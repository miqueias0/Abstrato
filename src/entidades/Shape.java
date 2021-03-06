package entidades;

import enums.entidades.Color;

public abstract class Shape {
	
	private Color cor;
	
	public Shape() {
		super();
	}

	public Shape(Color cor) {
		super();
		this.cor = cor;
	}

	public Color getCor() {
		return cor;
	}

	public void setCor(Color cor) {
		this.cor = cor;
	}
	
	public abstract double area();

}
