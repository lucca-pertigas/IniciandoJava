package Repeticao;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, soma = 0, cont = 0, maior, menor, mediaPar = 0, contPar = 0, somaPar = 0;
		double media;
		System.out.print("Digite o numero: ");
		n = sc.nextInt();
		maior = n;
		menor = n;
		while (n != 0) {
			soma += n;
			System.out.println ("Soma = " + soma);
			cont ++;
			System.out.println ("Contagem de numeros = " + cont);
			media = soma /cont;
			System.out.println("Media = " + media);
			if (n > maior) {
				maior = n;
			}
			System.out.println("Maior numero = " + maior);
			if (n < menor) {
				menor = n;
			}
			System.out.println("Menor numero = " + menor);
			if (n % 2 == 0) {
				contPar += 1;
				somaPar += n;
				mediaPar = somaPar / contPar;
			}
			System.out.println("Media de numeros pares = " + mediaPar);
			System.out.print("\n\n\nDigite o numero: ");
			n = sc.nextInt();
		}

	}

}
