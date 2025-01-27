package Vetores1;

import java.util.Scanner;

public class NomeIdadeVetor {

	public static void main(String[] args) {
		float media;
		String [] nome = new String [3];
		int [] idade = new int [3];
		media = preencher(idade, nome);
		med(media,idade,nome);

	}
	
	public static float preencher (int [] v, String [] v1) {
		Scanner sc = new Scanner(System.in);
		float soma = 0, media = 0;
		for (int i = 0; i < v.length; i ++) {
			System.out.print("Qual seu nome ?");
			v1[i] = sc.next();
			System.out.print("Qual sua idade ?");
			v[i] = sc.nextInt();
			soma += v[i];
		}
		media = soma / v.length;
		System.out.println("Media das idades = " + media);
		return media;
	}
	
	public static void med(float m, int [] v, String [] v1) {
		System.out.print("Pessoas com idade acima da media: \n");
		for (int i = 0; i < v.length; i++) {
			if (m < v[i]) {
				System.out.print("\nNome: " + v1[i] + "\nIdade: " + v[i]);
			}
		}
	}

}
