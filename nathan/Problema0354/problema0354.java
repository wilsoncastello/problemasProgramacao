package Problema0354;

import java.util.Scanner;

public class problema0354 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = input.nextLine();
        char v[] = frase.toCharArray();
        for (int i = 0; i < frase.length(); i++) {
            if(v[i] == 'a' || v[i] == 'e' || v[i] == 'i' || v[i] == 'o' || v[i] == 'u'){            
                v[i] = Character.toUpperCase(v[i]);
            }else{
                v[i] = Character.toLowerCase(v[i]);
            }
        }
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]);
        }
    }
}
