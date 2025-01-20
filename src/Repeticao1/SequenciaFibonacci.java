package Repeticao1;

import java.util.Scanner;

public class SequenciaFibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int a = 0, b = 1;
		System.out.print("Digite um numero: ");
		n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			b = a + b;
			a = b - a;
			if (b == n) {
				System.out.print("O numero aparece");
			}
		}

	}

}
