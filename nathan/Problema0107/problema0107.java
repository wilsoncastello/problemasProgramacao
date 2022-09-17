package Problema0107;

import java.util.Scanner;
public class problema0107 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a senha: ");
        int senha = Integer.valueOf(input.nextLine());

        if(senha == 4531)
            System.out.println("Acesso permitido");
        else
            System.out.println("Acesso negado");
    }
}
