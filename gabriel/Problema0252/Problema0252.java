import java.util.Scanner;


public class Problema0252 {

   
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       float [] A = new float [10];
       float [] B = new float [10];
       float [] resultante = new float [20];
       
       
        System.out.println("Digite os dados do vetor A: ");
        for(int i=0; i<10; i++){
            System.out.println("posição "+i+ ":");
            A[i] = Float.valueOf(input.nextLine());
        }
    
        System.out.println("Digite os dados do vetor B: ");
        for(int i=0; i<10; i++){
            System.out.println("posição "+i+ ": ");
            B[i] = Float.valueOf(input.nextLine());
        }
    
        int j=0, k=0;
        
        for(int i=0; i<20; i++){
            if(i % 2==0){
            resultante[i] = A[j];
            j++;
            }
            
            else{
                resultante[i] = B[k];
                k++;
            }
            
        }
        
        System.out.println("Vetor resultante");
        for(int i=0; i<20; i++){
                System.out.println(resultante[i]);
            }
        
    
    }
    
}