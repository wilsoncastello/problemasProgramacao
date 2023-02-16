import java.util.Scanner;

public class problema0349 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String frase;
        System.out.println("Digite uma frase: ");
        frase = input.nextLine();
        char[] fraseArray = frase.toCharArray();
        for(int i=0;i<=frase.length();i++){
            if(frase.toCharArray([i]) == " "){
                System.out.println(fraseArray[i]);
            }
        }
    }
}