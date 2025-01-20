package Repeticao1;

import java.util.Scanner;

public class Soma2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, j;
		float soma = 0 ;
		System.out.print("Digite um valor: ");
		n = sc.nextInt();
		j = n;
		for (float i = 0; i < n; i++) {
			soma = i / j;
			j--;
		}
		System.out.print("Soma = " + soma);

	}

}
