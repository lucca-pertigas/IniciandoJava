package Repeticao1;

import java.util.Scanner;

public class Soma1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Digite um valor: ");
		n = sc.nextInt();
		float soma = 0;
		for (float i = 1; i <= n; i++) {
			soma += 1/i;
		}
		System.out.print("Soma = " + soma);

	}

}
