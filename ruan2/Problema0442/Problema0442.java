import java.util.Scanner;

public class Problema0442{
    public static float calculo(int n1, int n2){
        float s = 0;

        if(n1 % n2 == 0){
            s = 0;
        }

        else{
            if(n1 > n2){
                while(n1 % n2 != 0){
                    n2 = n2 + 1;
                    s = n2;
                }
            }
            else{
                while(n1 % n2 != 0){
                    n2 = n2 - 1;
                    s = n2;
                }
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2;
        float valRetorno;

        System.out.print("Digite o dividendo: ");
        n1 = Integer.valueOf(input.nextLine());
        System.out.print("Digite o divisor: ");
        n2 = Integer.valueOf(input.nextLine());

        valRetorno = calculo(n1, n2);

        System.out.println();
        System.out.println("Se o primeiro número for divisivel pelo segundo número, caso contrário irá retornar o proximo divisor daquela divisão");
        System.out.println("Valor retornado: "+valRetorno);
    }
}