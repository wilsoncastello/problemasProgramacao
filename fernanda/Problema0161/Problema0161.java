import java.util.Scanner;
public class Problema0161 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        
        do{
            System.out.print("Digite um número: ");
            numero = Integer.parseInt(input.nextLine());
        }while (numero <= 0);
        for(int i = 0; i <= 10; i++){
            System.out.println(numero +" x "+ i +" = "+ numero*i);
        }
    }
}