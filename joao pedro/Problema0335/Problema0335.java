
import java.util.Scanner;
public class Problema0335 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String frase;
        
        String palavra="aula";
        int vezes=0;
        System.out.println("Digite uma frase que sera detectado o numero de vezes que 'Aula' aparece: ");
        frase=input.nextLine();
        String [] palavras= frase.split(" ");
        for(int i=0;i<palavras.length;i++){
            if(palavras[i].equalsIgnoreCase(palavra)){
                vezes++;
            }
        }
        System.out.println("Vezes que 'aula' aparece: "+vezes);
    }

}
