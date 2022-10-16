package Problema0222;

import javax.sound.sampled.SourceDataLine;

public class Problema0222 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                System.out.println("Digite um numero inteiro positivo");
                int n = Integer.valueOf(input.nextLine());
                boolean primo = true;
                
                for(int i=2; i<n; i++){
                    
                    if(n % i == 0){
                        primo = false;
                    }
                    
                }
                
                if(n <= 0){
                    primo = false;
                }
                
                if(primo == true){
                    System.out.println("O numero " + n + " é primo");
                }
                
                else{
                    System.out.println("O numero " + n + " não é primo");
                }
         
}
}
