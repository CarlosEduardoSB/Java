import java.util.Scanner;
public class Main {

	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);	
		
    int n1, n2;
    int maior, menor;
   
   System.out.println("Digite o primeiro numero:");
    n1 = sc.nextInt();
   System.out.println("Digite o segundo numero:");
    n2 = sc.nextInt();
    
   maior = (n1 >= n2) ? n1 : n2;
   menor = (n1 >= n2) ? n2 : n1; 

    
    
    	
   System.out.println("A ordem é:" + maior + "," + menor);
	}
	
	
	}