package Modularizacao;

import java.util.Scanner;

public class MMC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, result;
		System.out.print("Digite o primeiro numero: ");
		num1 = sc.nextInt();
		System.out.print("Digite o segundo numero: ");
		num2 = sc.nextInt();
		System.out.print(mmc(num1,num2));

	}
	
	public static int mmc(int n1, int n2) {
		int mmc, maior;
		if (n1 > n2) {
			maior = n1;
		} else {
			maior = n2;
		}
		mmc = maior;
		while (mmc % n1 != 0 || mmc % n2 != 0) {
            mmc += maior;
        }

        return mmc;
	}

}
