import java.util.Scanner;

public class Problema0155{
    
    /*Uma empresa decide aplicar descontos nos seus preços usando a tabela a seguir. 
    *Até R$ 29.99 - Sem desconto
    *De R$ 30.00 a R$ 49.99 - 10%
    *De R$ 50.00 a R$ 79.99 - 15%
    *De R$ 80.00 a R$ 100.00 - 20%
    *Acima de R$ 100.00 - 25%
    Faça um programa que receba o preço atual de um produto e seu código, 
    calcule e mostre o valor do desconto e o novo preço.*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float precoP, precoDesc;
        int codigoP;

        System.out.println("Digite as informações do produto");
        System.out.print("Digite o preço do produto: ");
        precoP = Float.valueOf(input.nextLine());
        System.out.print("Digite o codigo do produto: ");
        codigoP = Integer.valueOf(input.nextLine());

        if(precoP <= 29.99){
            System.out.println("Informações do produto");
            System.out.println("Código do produto: "+codigoP);
            System.out.println("Valor do desconto: 0%");
            System.out.println("Novo preço do produto: "+precoP);
        }
        else{
            if(precoP >= 30 && precoP <= 49.99){
                precoDesc = precoP - (10*precoP)/100;

                System.out.println("Informações do produto");
                System.out.println("Código do produto: "+codigoP);
                System.out.println("Valor do desconto: 10%");
                System.out.println("Novo preço do produto: "+precoDesc);
            }
            else{
                if(precoP >= 50 && precoP <= 79.99){
                    precoDesc = precoP - (15*precoP)/100;
                    
                    System.out.println("Informações do produto");
                    System.out.println("Código do produto: "+codigoP);
                    System.out.println("Valor do desconto: 15%");
                    System.out.println("Novo preço do produto: "+precoDesc);
                }
                else{
                    if(precoP >= 80 && precoP <= 100){
                        precoDesc = precoP - (20*precoP)/100;

                        System.out.println("Informações do produto");
                        System.out.println("Código do produto: "+codigoP);
                        System.out.println("Valor do desconto: 20%");
                        System.out.println("Novo preço do produto: "+precoDesc);
                    }
                    else{  
                        precoDesc = precoP - (25*precoP)/100;
                        System.out.println("Informações do produto");
                        System.out.println("Código do produto: "+codigoP);
                        System.out.println("Valor do desconto: 25%");
                        System.out.println("Novo preço do produto: "+precoDesc);
                        
                    }
                }
            }
        }
    }
}