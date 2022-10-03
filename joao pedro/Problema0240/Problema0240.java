import java.util.Scanner;

public class Problema0240 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int quantidade,octal=0,decimal=0;
       
		
		
		int j = 0;
        System.out.println("Digite a quantidade de numeros: ");
        quantidade=Integer.valueOf(input.nextLine());
        
        for(int i=0;i<quantidade;i++){
		decimal=0;
        
        j=0;
        System.out.println("Digite um valor na base 8: ");
        octal=Integer.valueOf(input.nextLine());
        int resto = octal;
		while(resto > 0) {
			
			decimal += resto % 10 * (int)Math.pow(8, j);
			resto /= 10;
			
			j++;
		}
		
		System.out.println("Numero na base 8: "+octal+". Numero na base 10: "+decimal);
        
    } 
}
}
