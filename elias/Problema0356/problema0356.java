import java.util.Scanner;

public class problema0356 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String frase;
        int quantidadeLetras = 0, quantidadeNumeros = 0, quantidadeEspacos = 0;
        System.out.println("Digite uma frase: ");
        frase = input.nextLine();
        char[] vetorFrase = frase.toCharArray();
        for(int i=0;i<frase.length();i++){
            if(vetorFrase[i] == letra){
                quantidadeLetras++;
            }
            if(vetorFrase[i] == numero){
                quantidadeNumeros++;
            }
            if(vetorFrase[i] == ' '){
                quantidadeEspacos++;
            }
        }
        System.out.println("Qunatidade de letras: "+quantidadeLetras);
        System.out.println("Qunatidade de numeros: "+quantidadeNumeros);
        System.out.println("Qunatidade de espacos: "+quantidadeEspacos);
    }
}