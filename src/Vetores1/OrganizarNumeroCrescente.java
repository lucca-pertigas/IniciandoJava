package Vetores1;

import java.util.Random;
import java.util.Scanner;

public class OrganizarNumeroCrescente {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] n = new int [10];
		preencher(n);
		organizar(n);
		mostrar(n);

	}
	
	public static void preencher(int [] v) {
		Random rand = new Random();
		for (int i = 0; i < v.length; i++) {
			v[i] = rand.nextInt(10);
		}
	}
	
	public static void organizar(int [] v) {
		int aux;
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length; j++) {
				if (v[i] < v[j]) {
					aux = v[i];
					v[i] = v[j];
					v[j] = aux;
				}
			}
		}
	}
	
	public static void mostrar(int [] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}
	}

}
