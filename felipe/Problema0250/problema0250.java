import java.util.Scanner;

public class problema0250{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num[] = new int[10], cont;

        for(int i = 1; i <= 9; i++){
            System.out.print("Digite "+(i)+" :");
            num[i] = Integer.parseInt(input.nextLine());
        }

        for(int i = 1; i <= 9; i++){
            cont = 0;
            for (int j = 1; j <= num[i]; j++) {
                if(num[i] % j == 0){
                    cont = cont + 1;
                }
                     
            }
            if(cont == 2){
                System.out.println(num[i]+" posição "+(i)+" é primo.");
            }
            
        }
  
    }

}