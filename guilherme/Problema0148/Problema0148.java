import java.util.Scanner;
public class Problema0148{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int codigoEstado, codigoCarga;
        float peso, pesoQuilos, precoCarga = 0, imposto = 0, total;

        System.out.println("Digite o Código do Estado do caminhão(1-5): ");
        codigoEstado = Integer.valueOf(input.nextLine());
        System.out.println("Digite o peso da carga do caminhão em Toneladas: ");
        peso = Float.valueOf(input.nextLine());
        System.out.println("Digite o Código da Carga do caminhão(10-40): ");
        codigoCarga = Integer.valueOf(input.nextLine());

        pesoQuilos = peso * 1000;

        if(codigoCarga >= 10 && codigoCarga <=20){
            precoCarga = 100 * pesoQuilos;
        }else if(codigoCarga >= 21 && codigoCarga <= 30){
            precoCarga = 250 * pesoQuilos;
        }else if(codigoCarga >= 31 && codigoCarga <= 40){
            precoCarga = 340 * pesoQuilos;
        }

        if(codigoEstado == 1){
            imposto = precoCarga * 35 / 100;
        }else if(codigoEstado == 2){
            imposto = precoCarga * 25 / 100;
        }else if(codigoEstado == 3){
            imposto = precoCarga * 15 / 100;
        }else if(codigoEstado == 4){
            imposto = precoCarga * 5 / 100;
        }else if(codigoEstado == 5){
            imposto = 0;
        }

        total = precoCarga + imposto;

        System.out.println("Peso da carga do caminhão em Quilos: " + pesoQuilos);
        System.out.println("Preço da carga do caminhão: " + precoCarga);
        System.out.println("Valor do imposto: " + imposto);
        System.out.println("Valor total: " + total);
    }
}