package raphael.Problema0046;

import java.util.Scanner;

public class Problema0046 {
    
    /* Faça um programa que leia um número no formato CDU e imprima-o invertido: UDC. (Exemplo: 123, sairá 321.) O numero deverá ser armazenado em outra váriavel antes de ser impresso. */

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int cdu, temp, temp2, temp3, udc;
        
        System.out.println("Digite o numero em CDU: ");
        cdu = Integer.valueOf(input.nextLine());
        
        temp = cdu % 10;
        udc = temp * 100;
        temp2 = (cdu % 100) - temp;
        udc = udc + temp2;
        temp3 = cdu / 100;
        udc = udc + temp3;
        
        System.out.println(udc);

    }
    
}
