package Repeticao2;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, fatorial = 1;
		System.out.print("Digite um numero: ");
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			fatorial *= i;
		}
		System.out.print("Resultado = " + fatorial);

	}

}
