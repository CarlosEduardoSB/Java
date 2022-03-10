import java.util.Scanner;

// Programa para gerar os dois ultimos digitos do CPF do usuário após a entrada dos 9 primeiros digitos 
// OBS: Incompleto ainda!


class Main {
  public static void main(String[] args) {
   
     char Menu = 'c';
	 int cpf1,cpf2,cpffinal,n1,n2,n3,n4,n5,n6,n7,n8,n9,d1,d1f,digi1,d2,d2f,digi2;
    
    
      do{
       System.out.println("Bem vindo ao menu, digite uma das opções válidas: ");
       System.out.println("1 - Para receber os dois digitos verificadores do CPF! ");
       System.out.println("2 - Para mostar informações do desenvolvedor!");
       System.out.println("3 - Para sair!");
        Scanner scan = new Scanner(System.in);
        Menu = scan.next().charAt(0);

        switch(Menu){ //----------> Comando para apresentar diferentes funções para o numero 1,2 e3 caso o usuário digite!
           
         case '1':
            	try { //---------- comando junto ao Catch para apresentar erro quando um letra é escrita em vez de um numero!   
            	System.out.println("Digite os 9 primeiros numeros do seu CPF:");
                    cpf1 = scan.nextInt();
                    cpf2 = cpf1;
                    n9 = cpf2 % 10;
                     cpf2 /= 10;
                    n8 = cpf2 % 10;
                     cpf2 /= 10;
                    n7 = cpf2 % 10;
                     cpf2 /= 10;
                    n6 = cpf2 % 10;
                     cpf2 /= 10;
                    n5 = cpf2 % 10;
                     cpf2 /= 10;
                    n4 = cpf2 % 10;
                     cpf2 /= 10;
                    n3 = cpf2 % 10;
                     cpf2 /= 10;
                    n2 = cpf2 % 10;
                     cpf2 /= 10;
                    n1 = cpf2 % 10;
                     cpf2 /= 10;
                    
                    d1 = ((n9*2)+(n8*3)+(n7*4)+(n6*5)+(n5*6)+(n4*7)+(n3*8)+(n2*9)+(n1*10))*10;
                    d1f = d1 % 11;
                     if ( d1f == 10 ) {digi1 = 0;}
                      else {digi1 = d1f;}
                    d2 = ((n9*3)+(n8*4)+(n7*5)+(n6*6)+(n5*7)+(n4*8)+(n3*9)+(n2*10)+(n1*11));
                    d2f = ((d2 + (digi1*2))*10) % 11;
                     if ( d2f == 10 ) {digi2 = 0;}
                      else {digi2 = d2f;}
                    cpffinal = ((digi1*10) + digi2);
                    String cpfNew = Integer.toString(cpf1);
                     if(cpfNew.length() != 9) //-------------> comando para apresentar erro caso o numero digitado pelo usuário seja diferente de 9!
                         System.out.println("CPF inválido, você voltará ao menu!");
                     else 
                       { System.out.println("O seu CPF completo é:" +cpf1+cpffinal+ ",Você retorará ao menu!"); }
                    } 
