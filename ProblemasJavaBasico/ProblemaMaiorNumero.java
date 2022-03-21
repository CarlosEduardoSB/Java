import java.util.Scanner;

public class LogicaP {
	
	public static void main(String[] args) {
    
       Scanner sc = new Scanner(System.in);
        
        int maiorNum = 0; // ----> variavel que salva o maior numero do vetor
        int posicaoMaior = -1; // ----> variavel que salva a posicao do maior
        int[] vet = new int[10]; // ---> vetor que vai armazenar os 10 valores
        
        for(int i = 0; i < vet.length; i++) 
            {System.out.println("Digite um elemento para a posição " + i + " do vetor." );
            vet[i] = sc.nextInt(); }
        
        
         for (int i = 0; i < vet.length; i++) {
            if (vet[i] > maiorNum) { // ---> codigo para salvar o maior e sua posicao
          maiorNum = (int) vet [i];
          posicaoMaior = i--;}
    }
    
        System.out.println("O maior valor encontrado foi "+maiorNum+" na posição "+posicaoMaior);
        System.out.println();
        
        int[] vet2 = new int[10]; // ----> novo vetor que calcula a divisao de todos pelo maior
        vet2[0] = vet[0]/maiorNum;
        vet2[1] = vet[1]/maiorNum;
        vet2[2] = vet[2]/maiorNum;
        vet2[3] = vet[3]/maiorNum;
        vet2[4] = vet[4]/maiorNum;
        vet2[5] = vet[5]/maiorNum;
        vet2[6] = vet[6]/maiorNum;
        vet2[7] = vet[7]/maiorNum;
        vet2[8] = vet[8]/maiorNum;
        vet2[9] = vet[9]/maiorNum;
       
       System.out.println("Os valores do novo vetor encontrado após o calculo da divisão são:" + vet2[0] + "," + vet2[1] + "," + vet2[2] + "," + vet2[3] + "," + vet2[4] + "," + vet2[5] + "," + vet2[6] + "," + vet2[7] + "," + vet2[8] + "," + vet2[9]);
           }
        }
    
 