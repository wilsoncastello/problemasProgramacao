package stephanie.Problema0410;

public class Problema0410 {

public static int[] calculaFatorial(int[] a){
        int n, fat=1;
        for(int i=0; i<a.size(); i++){
            n = a[i];
            for (i=1;i<=n;i++){
                fat = fat*i;
            }
            b[i] = fat;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[5];
        for(int i=0; i<5;i++){
            System.out.print("Digite um número inteiro par calcular o fatorial: ");
            a[i] = Integer.valueOf(input.nextLine());
        }
        b = calculaFatorial(a);
        System.out.print("Vetor resultado");
        for(int i=0; i<5;i++){
            System.out.print(b[i]);
        }
    }
}