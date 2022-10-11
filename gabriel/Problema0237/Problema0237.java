package Problema0237;

public class Problema0237 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                
            System.out.println("Digite um numero inteiro");
                int n = Integer.valueOf(input.nextLine());
                int   soma=0;
                int resto = 1;
                
                while (resto>0){ 

                    resto = n % 10;
                    n = (n - resto) / 10;
             
                    soma = soma + resto;
}
                
                
               System.out.println("Soma dos alagarismos do numero: " +soma);
         
}
}
