package Vetores2;

import java.util.Random;

public class MaiorValor {

	public static void main(String[] args) {
		int [] vet = new int [10];
		preencher(vet);
		analisar(vet);
		mostrar(vet);
	}
	
	public static void preencher(int [] v) {
		Random rand = new Random();
		for (int i = 0; i < v.length; i++) {
			v[i] = rand.nextInt(50);
		}
	}
	
	public static void analisar(int [] v) {
		int maior = 0, pos = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[i] > maior) {
				maior = v[i];
				pos = i;
			}
		}
		System.out.print("Vetor da maior posicao esta: " + pos + "\nvalor: " + maior);
	}

}
