import java.util.Scanner;

public class Problema0087{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        //Entrada
        int h, m, s;
        System.out.print("Digite a hora: ");
        h = Integer.valueOf(input.nextLine());
        System.out.print("Digite o minuto: ");
        m = Integer.valueOf(input.nextLine());
        System.out.print("Digite o segundo: ");
        s = Integer.valueOf(input.nextLine());

        //Processamento
        s = s + 1;
        if(s >= 60){
            s = 0;
            m = m + 1;
        }
        if(m >= 60){
            m = 0;
            h = h + 1;
        }
        if(h >= 24){
            h = 0;
        }
            
        //Saída
        System.out.println(h + "h" + m + "m" + s + "s");
    }
}
    