import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
	
	 //-- esse programa recebe valores de um triangulo digitados pelo usuário e retorna sua área
		
	 int Base;
	 int Altura;
	 int Area;
	 
	 Scanner sc = new Scanner(System.in);
	 
	System.out.print("Digite a Base do seu triângulo:");
	 Base = sc.nextInt();
	System.out.print("Digite a Altura do seu triângulo:");
	 Altura = sc.nextInt();
	
	 Area = (Base*Altura) / 2; 
 
	 System.out.print("O valor da área desse triangulo é:" + Area);
	 
 
 
 
 }
 

}