import java.util.Scanner;

public class problema0294 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int[] VET = new int[10];
        int[] VETtroca = new int[10];
        int[] VET1= new int[10];
        for(int i=0;i<10;i++){
            System.out.println("Digite um número inteiro para a posição "+i+" do vetor: ");
            VET[i] = Integer.valueOf(input.nextLine());
        }
        for(int i=0;i<10;i++){
            VETtroca[i] = VET[i];
        }
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(VET[i] == VETtroca[j]){
                    VET1[i] = null;
                }
            }
        }
        for(int i=0;i<10;i++){
            System.out.println(VET1[i]);
        }
    }
}