import java.util.Scanner;

public class problema0426 {

    public static boolean verificaNumero(String numero){ 
        char[] numeroArray = numero.toCharArray();
        int j = numero.length()-1;
        int validacao = 0;
        for(int i=0;i<numero.length();i++){
            if(numeroArray[i] == numeroArray[j]){
                validacao++;
            }
            j--;   
        }
        boolean capicuia;
        if(validacao == numero.length()){
            capicuia = true;
        }
        else
            capicuia = false;
        return capicuia;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String numero;
        System.out.println("Digite um número inteiro:");
        numero = input.nextLine();
        boolean capicuia = verificaNumero(numero);
        System.out.println("O número digitado é capicuia: "+capicuia);
    }
}