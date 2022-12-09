package Problema0339;

import java.util.Scanner;

import javax.imageio.plugins.tiff.FaxTIFFTagSet;

public class problema0339 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma frase para ver o inverso: ");
        String frase = input.nextLine();

        for (int i = frase.length()-1; i >= 0; i--) {
            System.out.print(frase.charAt(i) + "");
        }
    }
}
