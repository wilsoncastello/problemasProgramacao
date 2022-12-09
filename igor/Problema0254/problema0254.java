
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class problema0254{

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        int x[] = new int[10];
        int y[] = new int[10];

        for(int i = 0; i<10;i++){
            System.out.println("Escreve x para "+i+":");
            x[i] = input.nextInt();
            System.out.println("Escreve y para "+i+":");
            y[i] = input.nextInt();
        }

        int uniao[] = new int[20];
        ArrayList<Integer> diferenca = new ArrayList<>();
        int interseccao[] = new int[10];

        int a[] = new int[10];
        int b[] = new int[10];

		for (int i = 0; i < 10; i++) {
            a[i] = x[i] + y[i];
            b[i] = x[i] * y[i];
            uniao[i] = x[i];
            
		}
        for (int i = 10; i < 20; i++) {
            int s = i - 10;
            uniao[i] = y[s];
            
		}
        
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(x[i] == y[j]){
                    interseccao[i] = x[i];
                }
            }
        }

        Arrays.sort(x);
        Arrays.sort(y);
        for (int i : x) {
            boolean contains = false;
            for (int j : y) {
                if (i == j) {
                    contains = true;
                    break;
                }
            }
            if (!contains)
                diferenca.add(i);
        }

        Arrays.sort(uniao);
        int[] temp = new int[uniao.length];
        int j = 0;
        for (int i = 0; i < uniao.length - 1; i++) {
            if (uniao[i] != uniao[i + 1]) {
                temp[j++] = uniao[i];
            }
        }
 
        temp[j++] = uniao[uniao.length - 1];

        Arrays.sort(interseccao);
        int[] temp1 = new int[interseccao.length];
        int h = 0;
 
        for (int i = 0; i < interseccao.length - 1; i++) {
            if (interseccao[i] != interseccao[i + 1]) {
                temp1[h++] = interseccao[i];
            }
        }
 
        temp1[h++] = interseccao[interseccao.length - 1];
        
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        for(int i =0;i<j;i++){
            System.out.print(temp[i] + " ");
        }
        System.out.println("\n");
        for(int i =0;i<h;i++){
            System.out.print(temp1[i] + " ");
        }
        System.out.println("\n");
        System.out.println(diferenca.toString());
    }



}