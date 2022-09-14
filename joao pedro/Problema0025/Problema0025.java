import java.util.Scanner;

public class Problema0025 {
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    double peso,pesoAumentado,pesoReduzido;
    System.out.println("Digite seu peso: ");
    peso=Double.valueOf(input.nextLine());
    pesoAumentado=peso*1.15;
    pesoReduzido=peso*0.8;
    System.out.println("Peso aumentado em 15%: "+pesoAumentado);
    System.out.println("Peso reduzido em 20%: "+pesoReduzido);

}






} 