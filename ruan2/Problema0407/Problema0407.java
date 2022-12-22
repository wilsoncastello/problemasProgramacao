import java.util.Scanner;

public class Problema0407{

    public static float calculo(int num){
        float fat = 1;
        float s = 0;
        
        for(int i = 1; i<=num; i++){
            fat = fat * i;
            s = s + 1/fat;
            if(i == 1){
                s = s + 1;
            }
        }
        return s;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        float numFim;

        System.out.print("Digite um numero inteiro: ");
        num = Integer.valueOf(input.nextLine());

        numFim = calculo(num);
        System.out.println("Número final: "+numFim);
    }
}