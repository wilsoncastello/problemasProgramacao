import java.util.Scanner;
public class Problema0324{

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String palavra;

        System.out.println("Digite uma palavra: ");
        palavra=input.nextLine();

        for(int i=0;i<5;i++){
            
            for(int j=5-i;j>1;j--){
                System.out.print("   ");
            }
            for (int j=0; j<=i; j++ )
            {
                
                System.out.print("  "+palavra);
            }
            System.out.println();
        }
    }
}