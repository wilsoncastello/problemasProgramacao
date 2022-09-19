//Elabore um algoritmo que tome como entrada três valores e os imprima em ordem crescente.

import java.util.Scanner;

public class Problema0101 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    float n1, n2, n3;

    System.out.println("Digite três valores diferentes");
    n1 = Float.valueOf(input.nextLine());
    n2 = Float.valueOf(input.nextLine());
    n3 = Float.valueOf(input.nextLine());

    if(n1 <= n2 && n2 <= n3){
        System.out.println("Ordem crescente: " + n1 + ", " + n2 + ", " + n3);
    }
        else if(n1 <= n3 && n3 <= n2){
            System.out.println("Ordem crescente: " + n1 + ", " + n3 + ", " + n2);
        }
            else if(n2 <= n1 && n1 <= n3){
                System.out.println("Ordem crescente: " + n2 + ", " + n1 + ", " + n3);
            }
                 else if(n2 <= n3 && n3 <= n1){
                    System.out.println("Ordem crescente: " + n2 + ", " + n3 + ", " + n1);
                 }
                    else if(n3 <= n1 && n1 <= n2){
                        System.out.println("Ordem crescente: " + n3 + ", " + n1 + ", " + n2);
                    }
                        else{
                            System.out.println("Ordem crescente: " + n3 + ", " + n2 + ", " + n1);
                        }
        
    
    }
}