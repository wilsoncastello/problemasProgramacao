import java.util.Scanner;
public class problema0088 {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("escreve um numero: ");
        int x = input.nextInt();
    
        if(x>0){
            System.out.println("O numero é positivo");
        }else if(x<0){
            System.out.println("O numero é negativo");
        }else{
            System.out.println("O numero é zero");
        }

    }
}