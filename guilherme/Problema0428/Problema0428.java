import java.util.Scanner;

public class Problema0428{
    static Scanner input = new Scanner(System.in);

    public static int binario(String n){
        int dec = 0;
        int j = n.length() - 1;
        for(int i = 0; i < n.length(); i++){
            if(n.charAt(i) == '1')
                dec += Math.pow(2,j);
            j--;    
        }
        return dec;
    }

    public static void main(String[] args) {
        String bin;
        System.out.println("Digite um número em binário: ");
        bin = input.nextLine();
        System.out.println(binario(bin));

    }
}