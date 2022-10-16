package Problema0137;

import java.util.Scanner;
public class problema0137 {
    
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Digite o dia da data a ser inserida: ");
    int dia = Integer.valueOf(input.nextLine());
    System.out.println("Digite o mes da data a ser inserida: ");
    int mes = Integer.valueOf(input.nextLine());
    System.out.println("Digite o ano da data a ser inserida: ");
    int ano = Integer.valueOf(input.nextLine());

    boolean validarAno = false;

    if(dia > 0 && dia <= 31){
        if(mes > 0 && mes <= 12){
            if(ano > 0){
                validarAno = true;
            }
        }
    }

    System.out.println("Data inserida é valido? " + validarAno);
    }
}
