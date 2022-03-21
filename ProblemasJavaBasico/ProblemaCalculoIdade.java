import java.util.Scanner;

public class LogicaP {
	
	public static void main(String[] args) {
    
	// -- esse programa calcula e retorna a idade do usuario a partir de dados como ano, mes e dia, digitados no console.	

	
       Scanner scan = new Scanner(System.in);
       
       
       int Anos;
       int Meses; 
       int Dias;
       int IdadeDias;
       
       System.out.println("Abaixo digite a sua idade correspondente aos anos, meses e dias!");
       System.out.println("Digite os Anos:");
       Anos = scan.nextInt();
       System.out.println("Digite os Meses :");
       Meses = scan.nextInt();
       System.out.println("Digite os Dias :");
       Dias = scan.nextInt();
       
       IdadeDias = (Anos*365) + (Meses*30) + Dias;
       
       System.out.print("A sua idade em dias é:" + IdadeDias);
      
         
         }
	}