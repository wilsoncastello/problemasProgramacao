import java.util.Scanner;
class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] mesa = new int[10];
        int n = -1, m, lugar, encerrar;

        while(n != 0){

            System.out.print("\nDigite qual mesa você quer reservar: ");
            n = Integer.valueOf(input.nextLine());
            m = 0;
            if(n > 10 || n < 0){
                System.out.println("Não existe uma mesa com esse número!");
            }else if(n != 0){
                lugar = 5 - mesa[n-1];
                if(lugar > 0){
                    System.out.println("Mesa "+n);
                    System.out.print("Digite o número de lugares até "+lugar+": ");
                    m = Integer.valueOf(input.nextLine());
                    while(m > lugar || m < 1){
                        System.out.print("Digite um valor até "+lugar+": ");
                        m = Integer.valueOf(input.nextLine());
                    }
                    mesa[n-1] = mesa[n-1] + m;
                }else{
                    System.out.println("Essa mesa não tem lugares disponíveis!");
                }
            }else{
                System.out.println("Até mais!");
            }

            encerrar = 0;
            for(int i = 0; i < 10; i++){
                if(mesa[i] == 5){
                    encerrar++;
                }   
            }
            if(encerrar == 10){
                System.out.println("Até mais!");
                break;
            }
        }
    }
}
