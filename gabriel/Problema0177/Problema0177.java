//Faça um programa que receba um conjunto de valores inteiros e positivos, calcule e mostre o maior e o menor valor do conjunto. Considere que: *Para encerrar a entrada de dados, deve ser digitado o valor zero; *Para valores negativos, deve ser enviada uma mensagem; *Os valores negativos ou iguais a zero não entrarão nos cálculos.

package Problema0177;
import java.util.Scanner;
public class Problema0177 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite valores inteiros e positivos (quando desejar encerrar o programa digite '0')");
    
        int valor = Integer.valueOf(input.nextLine());
        int maior = 0, menor = 299999999;

        while(valor != 0){
            

            if(valor > maior){
                maior = valor;
            }

            if(valor < menor && valor > 0){
                menor = valor;
            }

            else if(valor < 0){
                System.out.println("Os valores negativos ou iguais a zero não entrarão nos cálculos.");
            }

            valor = Integer.valueOf(input.nextLine());
        }

        System.out.println("Maior valor digitado: " + maior);
        System.out.println("Menor valor digitado: " + menor);
    }
    
}