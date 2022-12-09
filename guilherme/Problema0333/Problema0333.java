import java.util.Scanner;

public class Problema0333{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String frase1, frase2, frase3 = "";
        System.out.println("Digite a primeira frase: ");
        frase1 = input.nextLine();
        System.out.println("Digite a segunda frase: ");
        frase2 = input.nextLine();
        String[] palavra1 = frase1.split(" ");
        String[] palavra2 = frase2.split(" ");
        int maiorFrase;
        if(palavra1.length >= palavra2.length)
            maiorFrase = palavra1.length;
        else
            maiorFrase = palavra2.length;

        for(int i = 0; i < maiorFrase; i++){
            if(i < palavra1.length)
                frase3 += palavra1[i] + ' ';
            if(i < palavra2.length)
                frase3 += palavra2[i] + ' ';
        }
        System.out.println(frase3);
    }
}