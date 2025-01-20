package Repeticao1;

import java.util.Scanner;

public class Soma3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		float soma = 0 ;
		System.out.print("Digite um numero: ");
		n = sc.nextInt();
		for (float i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				soma += 1/i;
			} else {
				soma -= 1/i;
			}
		}
		System.out.print("Soma = " + soma);

	}

}
