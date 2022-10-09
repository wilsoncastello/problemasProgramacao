import java.util.Scanner;
public class problema0239 {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Escreve numero base 8: ");
        String base8= input.nextLine();
        while(!(base8.equals("*"))) {
            System.out.println("Base 8: "+base8);
            String base10 = Integer.toString(Integer.parseInt(base8, 8), 10);
            System.out.println("Base 10: "+base10);

            System.out.println("Escreve numero base 8: ");
            base8= input.nextLine();
        }
    }
}