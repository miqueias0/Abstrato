package aplicação;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Circulo;
import entidades.Retangulo;
import entidades.Shape;
import enums.entidades.Color;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Shape> lista = new ArrayList<>();
		System.out.print("Entre com o numero de formas: ");
		Integer n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Forma #" + i + ":");
			System.out.print("Retangulo ou Circulo (r/c)? ");
			char resp = sc.next().charAt(0);
			System.out.print("Cor (PRETO/AZUL/VERMELHO): ");
			String cor = sc.next();
			switch (resp) {
			case 'r': {
				System.out.print("Altura: ");
				double altura = sc.nextDouble();
				System.out.print("Largura: ");
				double largura = sc.nextDouble();
				Shape forma = new Retangulo(Color.valueOf(cor), altura, largura);
				lista.add(forma);
				break;
			}
			case 'c': {
				System.out.print("Raio: ");
				double raio = sc.nextDouble();
				Shape forma = new Circulo(Color.valueOf(cor), raio);
				lista.add(forma);
				break;
			}
			default:
			}
		}
		System.out.println("Áreas das formas:");
		for (Shape f: lista) {
			System.out.println(f);
		}
		
		
		sc.close();
	}

}
