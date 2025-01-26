package Modularizacao;

import java.util.Scanner;

public class Soma1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float n;
		System.out.print("Escolha um numero: ");
		n = sc.nextInt();
		System.out.print(operacao(n));
	}
	
	public static float operacao (float num) {
		float soma = 0;
		for (float i = 1; i <= num; i ++) {
			soma += 1/i;
		}
		return soma;
	}

}
