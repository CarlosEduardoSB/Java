import java.util.Scanner;
public class Main {

	// Esse programa recebe 3 valores digitados pelo usuário e retorna a ordem crescente dos mesmos.
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);	
		
    int n1, n2, n3;
    int maior = 0, meio = 0,menor = 0;
    
    
   
    
    System.out.println("Digite o primeiro numero:");
    n1 = sc.nextInt();
    System.out.println("Digite o segundo numero:");
    n2 = sc.nextInt();
    System.out.println("Digite o terceiro numero:");
    n3 = sc.nextInt();
    
   
    if (n1 > n2 && n1 > n3 && n2 > n3) {
    
    maior = n1;  
    meio = n2;
    menor = n3;
    }
    
    
    else if (n1 > n2 && n1 > n3 && n3 > n2) {
    	
    maior = n1;
    meio = n3;
    menor = n2;
    }
    
    else if (n2 > n1 && n2 > n3 && n1 > n3){

    maior = n2;
   	meio = n1;
   	menor = n3;
    
    }
    
    else if (n2 > n1 && n2 > n3 && n3 > n1) {
    	
    maior = n2;
    meio = n3;
    menor = n1;	
	
    }
    
    else if (n3 > n1 && n3 > n2 && n1 > n2) {
    maior = n3;
    meio = n1;
    menor = n2;
    }
    
    else if (n3 > n1 && n3 > n2 && n2 > n1) {
    maior = n3;
    meio = n2;
    menor = n1;
        }
    
    else if (n1 > n2 && n1 > n3 && n2 == n3) {
    	
    maior = n1;
    meio = n2;
    menor = n3;
    }
    
    else if (n2 > n1 && n2 > n3 && n1 == n3) {
    	
    maior = n2;
    meio = n1;
    menor = n3;
    }
    
    else if (n3 > n1 && n3 > n2 && n2 == n1) {
    	
    maior = n3;
    meio = n2;
    menor = n1;
    }
    
    else {
    	
    maior = n1;
    meio = maior;
    menor = maior;
    }
    
    
    	
    	System.out.println("Os numeros digitados em ordem ascendente:" + maior + "," + meio + "," + menor);
	
	}
	
	
	}