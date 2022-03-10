package teste;

import java.util.Scanner;

public class Main {

	// Este programa recebe um valor inserido pelo usuário e retorna o valor
	// absoluto do mesmo.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n1, n2;
		int ValorAb;

		System.out.println("Digite o primeiro numero:");
		n1 = sc.nextInt();

		ValorAb = (n1 < 0) ? -n1 : n1;

		System.out.println("O valor absoluto desse numero é:" + ValorAb);
	}

    }
