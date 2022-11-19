
import java.util.*;

public class problema0334 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Escreve o texto uma palavra cada: ");
        String texto = input.nextLine();
       
        ArrayList<String> s = new ArrayList<>();
        while(!texto.equals(".")){ 
            s.add(texto);
            System.out.println("Escreve o texto uma palavra cada: ");
            texto = input.nextLine();
        }

        Collections.sort(s);
        System.out.println("Palavras em ordem alfabetico: ");
        for(int i=0;i<s.size();i++){
            System.out.println(s.get(i));
        }
    }
}