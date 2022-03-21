import java.util.Scanner;

public class LogicaP {
	
	public static void main(String[] args) {
    
       Scanner scan = new Scanner(System.in);
       
       
       int a = 10;
       int b = 20;
       
       System.out.println("Os valores de A e B antes da troca são respectivamente:" + a + " e " + b);
       
       a = a^b;
       b = b^a;
       a = a^b;
       
       System.out.print("Agora, após a troca os valores de A e B são respectivamente:" + a + " e " + b);
      
         
         }
	}