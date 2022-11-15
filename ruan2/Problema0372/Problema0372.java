import java.util.Scanner;
public class Problema0372{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        float kmLitro;
        String[] nomecidade = new String[5];
        float[][] distcidades = new float[5][5];
        float quantCombustivel;

        System.out.print("Digite quantos km o veículo faz por litro: ");
        kmLitro = Float.valueOf(input.nextLine());

        System.out.println("");
        for(int i = 0; i<5; i++){
            System.out.print("Digite o nome da cidade ("+i+"): ");
            nomecidade[i] = input.nextLine();
        }

        System.out.println("");
        for(int i = 0; i<5; i++){
            for(int j = i + 1; j<5; j++){
                System.out.print("Digite a distância entre as cidades em quilômetro("+nomecidade[i]+" até "+nomecidade[j]+"): ");
                distcidades[i][j] = Float.valueOf(input.nextLine());
                
            }
        }

        System.out.println("");
        System.out.println("percursos que não ultrapassam 250 quilômetros");
        for(int i = 0; i<5; i++){
            for(int j = i + 1; j<5; j++){
                if(distcidades[i][j] <= 250){
                    System.out.println(nomecidade[i]+" até "+nomecidade[j]);
                }
                else{
                    System.out.println("Todos os percursos passaram dos 250 quilômetros");
                }
            }
        }

        System.out.println("");
        for(int i = 0; i<5; i++){
            for(int j = i + 1; j<5; j++){
                quantCombustivel = distcidades[i][j] * kmLitro;
                System.out.println(nomecidade[i]+" até "+nomecidade[j]+", gasta "+quantCombustivel+" litros de combutível");
            }
        }
    }
}