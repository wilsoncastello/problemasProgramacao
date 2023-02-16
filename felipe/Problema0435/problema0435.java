import java.util.Scanner;

public class problema0435{
    public static int vetor (int v[]){
        int temp;

        for(int i = 0; i<v.length; i++ ){
            for(int j = i+1; j<v.length; j++){
                if(v[i]>v[j]){
                temp = v[i];
                v[i] = v[j];
                v[j] = temp;
                }
            }
        }
        return v[0];
    }

    public static int[] lerDados() {
        Scanner input = new Scanner(System.in);
        int n = 0;
        int[] v = new int[20];

        System.out.println("Digite -1 para sair");

        for (int i = 0; i < v.length; i++) {
            System.out.print(i + 1 + "° valor: ");
            v[i] = Integer.parseInt(input.nextLine());
            
            if (v[i] > 0) {
                n++;
            } else {
                System.out.println("Sair selecionado! ");
                break;
            }
        }
        
        int[] x = new int[n];
        for (int i = 0; i < x.length; i++) {
            x[i] = v[i];
        }
        return x;
    }

    public static int[] mostrarDados(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i] + " ");
        }
        return x;
    }

    public static void main(String[] args) {
        
        System.out.println("Número de maior concorrência: "+vetor(lerDados()));
    }
}