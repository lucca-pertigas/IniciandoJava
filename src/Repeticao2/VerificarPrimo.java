package Repeticao2;

import java.util.Scanner;

public class VerificarPrimo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, contador = 0;
		System.out.print("Digite um numero: ");
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				contador ++;
			}
		}
		if (contador == 2) {
			System.out.print("O numero é Primo");
		} else {
			System.out.print("Não é primo");
		}

	}

}
