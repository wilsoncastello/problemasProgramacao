package stephanie.Problema0246;

public class Problema0246 {

public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] a = new String[5];
        String[] b = new String[10];
        String[] c = new String[15];
        for(int i=0; i<5; i++){
            System.out.println("Digite o nome "+i+" do vetor A: ")
            a[i] = input.nextLine();
        }
        for(int i=0; i<10; i++){
            System.out.println("Digite o nome "+i+" do vetor B: ")
            b[i] = input.nextLine();
        }
        for (int i=0;i<5;i++){
            c[i] = a[i];
        }
       int  j = 5;
        for (int i=0;i<10;i++){
            c[j] = b[i];
            j++;
        }
System.out.println("Vetor C:");
for (int i=0;i<15;i++){
           		System.out.println(c[i]);
        }
            }


}