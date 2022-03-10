import java.util.Scanner;
public class Main {

	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);	
	
	int n1, n2;
	char op;
    
     System.out.println("Digite o primeiro numero:");
	  n1 = sc.nextInt();
	 System.out.println("Digite o segundo numero:");
	  n2 = sc.nextInt();
	 System.out.println("Digite a operação desejada:");
	  op = sc.next().charAt(0);
	 
	 switch (op) {
	 
	 case '+': 
		System.out.println("O valor da adição é:" + (n1 + n2));
		break;
		
	 case '-':
		 System.out.println("O valor da subtração é:" + (n1 - n2));
		 break;
	 
	 case '*':
		 System.out.println("O valor da multiplicação é:" + (n1 * n2));
		 break;
	 
	 case '/' :
		 System.out.println("O valor da divisão é:" + (n1 / n2));
		 break;
	
	 default :
		 System.out.println("Você digitou uma operação inexistente no programa!!");
	 }
	
	 
     
	 
	 }
	
	
	 }
