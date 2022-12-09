import java.util.Scanner;
public class Problema0130 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float distancia;
        String tipoCarro;
        
        System.out.println("Tipos de carros: A, B e C.");

        System.out.print("Digite a distância de um percurso em Km: ");
        distancia = Float.valueOf(input.nextLine());
        
        System.out.print("Digite o tipo de carro: ");
        tipoCarro = input.next();
        
        if (tipoCarro.equals("A")){
            System.out.println("O consumo estimado de combustível é de " + (distancia/12));
        } else if(tipoCarro.equals("B")){
            System.out.println("O consumo estimado de combustível é de " + (distancia/9));
        } else if(tipoCarro.equals("C")){
            System.out.println("O consumo estimado de combustível é de " + (distancia/8));        
        }
    }  
}