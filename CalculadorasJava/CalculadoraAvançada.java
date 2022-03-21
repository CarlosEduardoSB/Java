import java.util.Scanner;

public class Main {

	// Este programa é uma calculadora em java, com menu, operações e informações sobre desenvolvedor.

	public static double soma(double n1, double n2) {
		return n1 + n2;
	}

	public static double subtração(double n1, double n2) {
		return n1 - n2;
	}

	public static double multiplicação(double n1, double n2) {
		return n1 * n2;
	}

	public static double divisão(double n1, double n2) {
		return n1 / n2;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double n1, n2;
		char Menu = 'M';
		char op;

		do {

			System.out.println("Olá, seja bem-vindo ao menu da calculadora, digite uma das opções validas abaixo:");
			System.out.println("Digite 1 para realizar um cálculo!");
			System.out.println("Digite 2 para visualizar informações do desenvolvedor!");
			System.out.println("Digite 3 para sair!");
			Menu = sc.next().charAt(0);
			if (Menu == 5) {
				System.out.println("Terminou");
				break;
			}

			else {
				switch (Menu) {

				case '1':

					System.out.println("Digite o valor do primeiro número:");
					n1 = sc.nextDouble();
					System.out.println("Digite o valor do segundo:");
					n2 = sc.nextDouble();
					System.out.println("Digite o simbola da operação que você deseja fazer:");
					System.out.println(" + = SOMA, - = SUBTRAÇÃO, * = MULTIPLICAÇÃO, / = DIVISÃO");
					op = sc.next().charAt(0);

					if (op == '+') {

						System.out.println("O valor da adição é:" + soma(n1, n2));
						System.out.println("");
					}

					else if (op == '-') {

						System.out.println("O valor da subtração é:" + subtração(n1, n2));
						System.out.println("");
					}

					else if (op == '/') {

						System.out.println("O valor da divisão é:" + divisão(n1, n2));
						System.out.println("");
					}

					else if (op == '*') {

						System.out.println("O valor da multiplicção é:" + multiplicação(n1, n2));
						System.out.println("");
					}

					break;

				case '2':
					System.out.println("Carlos Eduardo Serpa Brito 2020118290");
					System.out.println(" ");

					break;

				case '3':
					System.out.println("Até logo!");
					System.out.println("");

					break;
				}

			}
		} while (Menu != 'M');
	}
}