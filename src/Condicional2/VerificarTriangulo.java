package Condicional2;

import java.util.Scanner;

public class VerificarTriangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l1, l2, l3;
		System.out.print("Digite o primeiro lado triangulo: ");
		l1 = sc.nextInt();
		System.out.print("Digite o segundo lado triangulo: ");
		l2 = sc.nextInt();
		System.out.print("Digite o terceiro lado triangulo ");
		l3 = sc.nextInt();
		if ((l1 + l2 > l3) && (l2 + l3 > l1) && (l1 + l2 > l3)) {
			if ((l1 == l2) && (l2 == l3)) {
				System.out.print("Triangulo equilatero");
			} else {
				if ((l1 != l2) && (l1 != l3) && (l2 != l3)) {
					System.out.print("Triangulo escaleno");
				} else {
					System.out.print("Triangulo isoceles");
				}
			}
		} else {
			System.out.print("Não é triangulo");
		}

	}

}
