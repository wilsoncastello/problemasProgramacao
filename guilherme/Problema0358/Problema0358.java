import java.util.Scanner;

public class Problema0358{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String[] x, y, z;
        String apoio;
        int a, b;
        System.out.println("Digite a quantidade de clientes do Banco A: ");
        a = Integer.valueOf(input.nextLine());
        x = new String[a];
        for(int i = 0; i < a; i++){
            System.out.println("Digite o nome do " + i + "º cliente: ");
            x[i] = input.nextLine();
        }
        for(int i = 0; i < a; i++){
            for(int j = i + 1; j < a; j++){
                if(x[i].compareTo(x[j]) > 0){
                    apoio = x[i];
                    x[i] = x[j];
                    x[j] = apoio;
                }
            }
        }
        System.out.println("Lista X:");
        for(int i = 0; i < a; i++){
            System.out.println(x[i]);
        }


        System.out.println("Digite a quantidade de clientes do Banco B: ");
        b = Integer.valueOf(input.nextLine());
        y = new String[b];
        for(int i = 0; i < b; i++){
            System.out.println("Digite o nome do " + i + "º cliente: ");
            y[i] = input.nextLine();
        }
        for(int i = 0; i < b; i++){
            for(int j = i + 1; j < b; j++){
                if(y[i].compareTo(y[j]) > 0){
                    apoio = y[i];
                    y[i] = y[j];
                    y[j] = apoio;
                }
            }
        }
        System.out.println("Lista Y:");
        for(int i = 0; i < b; i++){
            System.out.println(y[i]);
        }

        z = new String[a+b];
        for(int i = 0; i < a; i++){
            z[i] = x[i];
        }
        int temp = 0;
        for(int i = a; i < a+b; i++){
            z[i] = y[temp];
            temp++;
        }
        for(int i = 0; i < a+b; i++){
            for(int j = i + 1; j < a+b; j++){
                if(z[i].compareTo(z[j]) > 0){
                    apoio = z[i];
                    z[i] = z[j];
                    z[j] = apoio;
                }
                if(z[i].compareTo(z[j]) == 0){
                    if(j+1 < a+b){
                        apoio = z[j];
                        z[j] = z[j+1];
                        z[j+1] = apoio;
                    }else{
                        z[j] = "-";
                    }
                }
            }
        }
        System.out.println("Lista Z:");
        for(int i = 0; i < a+b; i++){
            if(z[i].compareTo("-") != 0)
                System.out.println(z[i]);
        }
    }
}