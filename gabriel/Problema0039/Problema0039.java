//Faça um programa que leia e imprima o nome, endereço e telefone de uma pessoa.

package Problema0039;

import java.util.Scanner;

public class Problema0039 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        String nome, endereco, telefone;
    
        //entrada
        System.out.println("Digite seu nome: ");
        nome = input.nextLine();
    
        System.out.println("Digite seu endereço: ");
        endereco = input.nextLine();
    
        System.out.println("Digite seu telefone: ");
        telefone = input.nextLine();
    
    
        //saída
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        
      }
}
