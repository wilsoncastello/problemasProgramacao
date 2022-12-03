package Problema0308;

public class Probkema0308 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        int vetorA[] = new int[12];
        int vetorB[] = new int[12];
    
        for(int i=0; i<12; i++){
            System.out.println("Digite o valor do vetor A correspondente a posição "+i);
            vetorA[i] = Integer.valueOf(input.nextLine());
        }
    
        for(int i=0; i<12; i++){
            if(vetorA[i] % 2 == 0){
                vetorB[i] = vetorA[i];
            }
        
            else{
                vetorB[i] = vetorA[i] * 2;
            }
        }
    
        System.out.println("Vetor B");
        for(int i=0; i<12; i++){
            System.out.println(vetorB[i]);
        }
    }  
}
 

