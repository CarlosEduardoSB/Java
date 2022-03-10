import java.util.Scanner;
public class Main {

	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);	
		
    double n1, n2;
    double divisao;
    
   
    
    System.out.println("Digite o primeiro numero:");
    n1 = sc.nextDouble();
    System.out.println("Digite o segundo numero:");
    n2 = sc.nextDouble();
    
    divisao = n1 / n2;
   
    
    if (n2 <= 0) {
    
    System.out.println("Voce digitou um numero invalido!");
    System.out.println("Digite novamente um numero maior que zero:");
    n2 = sc.nextDouble();
    divisao = n1 / n2; 	
    	
    
    }
    
    System.out.println("O resultado é igual a:" + divisao);

    }
	
	}
