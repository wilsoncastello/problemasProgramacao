
import java.util.Scanner;

public class problema0073{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Escreve numero conta: ");
        String nConta = input.nextLine();
        char n1 = nConta.charAt(0);
        char n2 = nConta.charAt(1);
        char n3 = nConta.charAt(2);
       

        int nC = Integer.parseInt(nConta);
        String nInverso = "";
        nInverso = nInverso+n3+n2+n1;
        int nI = Integer.parseInt(nInverso);

        int soma = nC + nI;
        String s = Integer.toString(soma);
        char s1 = s.charAt(0);
        char s2 = s.charAt(1);
        char s3 = s.charAt(2);

        int m1 = Character.getNumericValue(s1);
        int m2 = Character.getNumericValue(s2);
        int m3 = Character.getNumericValue(s3);

        int verificador = (m1*1)+(m2*2)+(m3*3);

        System.out.println("Digito Verificador: "+verificador);



    }
}