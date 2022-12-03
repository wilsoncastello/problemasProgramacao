package Problema0280;

public class Problema0280 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        int [] vetorA = new int[10];
        int [] vetorB = new int[10];

        System.out.println("Preencha o vetor A");
        for(int i=0; i<10; i++){
            System.out.println("Digite o valor inteiro da posiçao " +i);
            vetorA[i] = Integer.valueOf(input.nextLine());
        }
        int j=0;
        for(int i=0; i<10; i++){
            if(vetorA[i] > 0){
                vetorB[j] = vetorA[i];
                j++;
            }
        }
        System.out.println("Vetor B");
        for(int i=0; i<j; i++){
            System.out.println(vetorB[i]);
        }
    }
}
    
   
