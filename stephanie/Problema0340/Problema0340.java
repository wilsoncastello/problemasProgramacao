package stephanie.Problema0340;

public class Problema0340 {

public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String original = input.nextLine();
        String invertida = "";
        
        for (int i = original.length() - 1;  0 <= i; i--) {
            invertida += original.charAt(i);
        }
        System.out.println("Frase invertida: " + invertida);
    }


}