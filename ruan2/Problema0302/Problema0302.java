import java.util.Scanner;

public class Problema0302{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num, i, numDiv2;
        float numDiv;
        int[] binario = new int[10];

        System.out.print("Digite um número: ");
        num = Integer.valueOf(input.nextLine());

        i = 0;

        do{
            numDiv2 = num/2;
            numDiv = num%2;
            if(numDiv == 0){
                binario[i] = 0;
            }
            else{
                binario[i] = 1;
            }
            
            i++;
            num = numDiv2;
        }while(numDiv2 != 0);

        for(int j = 9; j>=0; j--){
            System.out.print(binario[j]);
        }
    }
}