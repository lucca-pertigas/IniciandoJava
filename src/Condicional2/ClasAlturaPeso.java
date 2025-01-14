package Condicional2;

import java.util.Scanner;

public class ClasAlturaPeso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float altura, peso;
		System.out.print("Digite sua altura: ");
		altura = sc.nextFloat();
		System.out.print("Digite seu peso: ");
		peso = sc.nextFloat();
		if (altura <= 1.3) {
			if (peso <= 60) {
				System.out.print("Categoria A");
			} else {
				if (peso <= 85) {
					System.out.print("Categoria D");
				} else {
					System.out.print("Categoria G");
				}
			}
		} else {
			if (altura <= 1.7) {
				if (peso <= 60) {
					System.out.print("Categoria B");
				} else {
					if (peso <= 85) {
						System.out.print("Categoria E");
					} else {
						System.out.print("Categoria H");
					}
				}
			} else {
				if (peso <= 60) {
					System.out.print("Categoria C");
				} else {
					if (peso <= 85) {
						System.out.print("Categoria F");
					} else {
						System.out.print("Categoria I");
					}
				}
			}
		}

	}

}
