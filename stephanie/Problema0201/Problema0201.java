package stephanie.Problema0201;

public class Problema0201 {
    public static void main(String args[]) {
 
        Scanner input = new Scanner(System.in);
        System.out.println("Escreva um número");
        int y = input.nextInt();
        for(int i = y; i>0;i--){
            if(y%i==0){
            System.out.print(i+", ");
            }
        }
    }

}
