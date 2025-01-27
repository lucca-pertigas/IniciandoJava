package Vetores2;

import java.util.Random;

public class VetorParImpar {

	public static void main(String[] args) {
		int [] vet = new int [20];
		preencher(vet);
		mostrar(vet);
 		

	}
	
	public static void preencher(int [] v) {
		Random rand = new Random();
		int cont = 0, n;
		while (cont < 10) {
			n = rand.nextInt(100);
			if (n % 2 == 0) {
				v[cont] = n;
				cont ++;
			}
		}
		while (cont < 20) {
			n = rand.nextInt(100);
			if (n % 2 != 0) {
				v[cont] = n;
				cont ++;
			}
		}
	}
	
	public static void mostrar(int [] v) {
		for (int i = 0; i < v.length; i ++) {
			System.out.println(v[i]);
		}
	}

}
