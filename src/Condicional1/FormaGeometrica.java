package Condicional1;

import java.util.Scanner;

public class FormaGeometrica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qntLados, medLado, result;
		System.out.print("Digite a quantidade de lados da figura: ");
		qntLados = sc.nextInt();
		System.out.print("Qual a medida dos lados: ");
		medLado = sc.nextInt();
		if (qntLados == 3) {
			result = medLado * 3;
			System.out.print("Triangulo - Perimetro: " + result);
		} else {
			if (qntLados == 4) {
				result = medLado * medLado;
				System.out.print("Quadrado - Area: " + result);
			} else {
				System.out.print("Pentagono");
			}
		}
		

	}

}
