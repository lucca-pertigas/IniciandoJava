package Modularizacao;

import java.util.Scanner;

public class SequenciaPrimos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Quantos numeros primos voce gostaria de saber: ");
		num = sc.nextInt();
		primo(num);

	}
	
	public static void primo (int n) {
		int cont1 = 0, soma = 0, cont2 = 0;
		for (int i = 1; i <= n * 10; i++) {
			cont1 = 0;
			for (int x = 1; x <= i; x ++) {
				if (i % x == 0) {
					cont1++;
				}
			} 
			if ((cont1 == 2) && (cont2 < n)) {
				soma += i;
				cont2 ++;
			}
		}
		System.out.print(soma);
	}

}
