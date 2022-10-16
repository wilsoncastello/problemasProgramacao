import java.util.Scanner;

public class problema0098 {

    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    char genero;
    float h;
    double pesoIdeal;
    System.out.println("Digite sua altura:");
    h = Float.valueOf(input.nextLine());
    System.out.print("Digite seu gênero (M = Masculino ou F = Feminino):");
    genero = input.nextLine().charAt(0);
        if(genero == 'M' || genero == 'm'){
            pesoIdeal = 72.7 * h - 58;
            System.out.println("O seu peso ideal é: "+pesoIdeal);
        }
        else if(genero == 'F' || genero == 'f'){
                pesoIdeal = 62.1 * h - 44.7;
                System.out.println("O seu peso ideal é: "+pesoIdeal);
            } 
        else
            System.out.println("Gênero inválido, tente novamente!");                  
    }
}