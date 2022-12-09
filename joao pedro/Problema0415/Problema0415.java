import java.util.Scanner;

public class Problema0415 {
    

    public static void dobro(double x1,double x2,double x3){
        x1=x1*2;
        x2=x2*2;
        x3=x3*2;
        System.out.println("Dobro dos valores: "+x1+", "+x2+", "+x3);
        
    }
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        /*Crie um algoritmo que leia três números e, para cada um, imprima o dobro. 
        Use uma função para calcular o dobro do valor. 
         */
        double numero1,numero2,numero3;
        
        System.out.println("Digite tres numeros: ");
        numero1=Double.valueOf(input.nextLine());
        numero2=Double.valueOf(input.nextLine());
        numero3=Double.valueOf(input.nextLine());
        
        dobro(numero1,numero2,numero3);
        

    }

}

