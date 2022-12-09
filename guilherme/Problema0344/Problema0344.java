import java.util.Scanner;

public class Problema0344{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String nome, nomeAbreviado = "";
        int ultimoEspaco = 0;
        System.out.println("Digite um nome: ");
        nome = input.nextLine();
        nomeAbreviado = nome.substring(0, nome.indexOf(" "));
        for(int i = 0; i < nome.length(); i++)
            if(nome.charAt(i) == ' ')
                ultimoEspaco = i;
        for(int i = 0; i < nome.length(); i++){
            if(nome.charAt(i) == ' ' && i != ultimoEspaco)
                nomeAbreviado += nome.substring(i,i+2).toUpperCase().concat(".");
        }
        nomeAbreviado += nome.substring(ultimoEspaco);
        System.out.println(nomeAbreviado);
    }
}