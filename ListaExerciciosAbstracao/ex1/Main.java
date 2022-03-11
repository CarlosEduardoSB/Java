package classesAbstratas;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		Funcionario f1 = new Gerente();
		Funcionario f2 = new Gerente();
		Funcionario f3 = new Programador();
        char menu = 'c';
        char op;
        
        do { 
        		
      	System.out.println("Olá, seja bem-vindo ao menu!");	
       	System.out.println("Digite 1 para informar os dados dos Funcionários!");	
    	System.out.println("Digite 2 para aumentar os salários dos Funcionários!");
       	System.out.println("Digite 3 para sair!");
       	menu = sc.next().charAt(0);
       	
       	switch (menu) {
       	
       	case '1':
       	
       	System.out.println("Digite 1 para informar os dados do Gerente f1");
        System.out.println("Digite 2 para informar os dados do Gerente f2");
        System.out.println("Digite 3 para informar os dados do Programador f3");
        op = sc.next().charAt(0);
        
        if (op == '1') {
        System.out.println(f1.toString());
        }
        
        else if (op == '2') {
        f2.toString();
        }
        
        else if (op == '3') {
        f3.toString();
        }
        
        else {
        System.out.println("Função inexistente!");	
        }
       
       	
       	break;
       	
       	case '2':
       	
       	System.out.println("Digite 1 para aumentar o salario do Gerente f1");
       	System.out.println("Digite 2 para aumentar o salario do Gerente f2");
        System.out.println("Digite 3 para aumentar o salario do Progamador f3");
        op = sc.next().charAt(0);
           	
        if (op == '1') {
        f1.aumentaSalario();
        }
           	
        else if (op == '2') {
        f2.aumentaSalario();
        }
          	
       	else if (op == '3') {
       	f3.aumentaSalario();
        }
           	
        else {
        System.out.println("Função inexistente!");
        }	
        
        break;
        
       	case '3':
       	
       	System.out.println("Até Logo!!");
       	System.exit(1);
       	
       	default:
        System.out.println("Opção inválida!");
       	
       	
        }
        }
       	
       	while (menu != 'c');
       	
       	
	  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
        }
	
}

