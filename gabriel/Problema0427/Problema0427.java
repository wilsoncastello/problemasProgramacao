package Problema0427;

public class Problema0427 {
    public static int[] converte(int numDecimal){
        int resto;
        int [] vetorNumConvertido = new int[20];
        
            for(int i=0; i<20; i++){
                vetorNumConvertido[i] = -1;
            }
        
            int i=0;
            while(numDecimal > 0){
                resto = numDecimal % 2;
                vetorNumConvertido[i] = resto; 
                numDecimal = numDecimal / 2;
                i++;
            } 
        
        
        return vetorNumConvertido;
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero positivo na base decimal: ");
        int numDecimal = Integer.valueOf(input.nextLine());
        
        while(numDecimal < 0){
            System.out.println("Invalido");
            System.out.println("Digite um numero positivo na base decimal: ");
            numDecimal = Integer.valueOf(input.nextLine());
        }
        
        int vetorNumConvertido[] = converte(numDecimal);
        
        
        if(numDecimal == 0){
            System.out.println("O número 0 na base 2: 0");
        }
        
        System.out.print("O número "+numDecimal+" na base 2: ");
        for(int i=18; i>-1; i--){
            if(vetorNumConvertido[i] != -1){
                System.out.print(vetorNumConvertido[i]);
            
            }
        }  
    }
}
