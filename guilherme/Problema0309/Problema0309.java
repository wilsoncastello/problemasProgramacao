import java.util.Scanner;

public class Problema0309{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int x = 0, y = 0, j = 0, k = 0;
        int[] a = new int[6];
        int[] b = new int[6];
        int[] c, d;
        System.out.println("Digite 6 números para A: ");
        for(int i = 0; i < 6; i++){
            a[i] = Integer.valueOf(input.nextLine());
            if(a[i] % 2 == 1)
                x++;
            else
                y++;
        }
        System.out.println("Digite 6 números para B: ");
        for(int i = 0; i < 6; i++){
            b[i] = Integer.valueOf(input.nextLine());
            if(b[i] % 2 == 1)
                x++;
            else
                y++;
        }
        c = new int[x];
        d = new int[y];
        for(int i = 0; i < 6; i++){
            if(a[i] % 2 == 1){
                c[j] = a[i];
                j++;
            }else{
                d[k] = a[i];
                k++;
            }
        }
        for(int i = 0; i < 6; i++){
            if(b[i] % 2 == 1){
                c[j] = b[i];
                j++;
            }else{
                d[k] = b[i];
                k++;
            }
        }
        System.out.println("Vetor C: ");
        for(int i = 0; i < x; i++)
            System.out.println(c[i]);
        System.out.println("Vetor D: ");
        for(int i = 0; i < y; i++)
            System.out.println(d[i]);
    }
}