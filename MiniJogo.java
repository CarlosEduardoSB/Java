
import java.util.Scanner;

public class Main {

	/* Esse programa é um pequeno jogo de advinhação, onde o usuário insere o nome de um time, caso seja correto, o console avisa e retorna a quantidade de
	 tentativas, caso não, o console pede para inserir um novo nome.*/

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String time = "ceara";
		int tentativas = 1;

		System.out.println("Seja bem-vindo ao jogo de advinhação de times brasileiros na serie A");
		System.out.println("Comece digitar times para tentar acertar:");
		time = sc.next();

		do {

			System.out.println("Voce digitou o time errado, tente novamente:");
			time = sc.next();
			tentativas++;

		} while (!time.equals("ceara"));

		System.out.println("Parabéns você acertou o time!!!");
		System.out.println("A sua quantidade de tentativas foi:" + tentativas);

	}
}
