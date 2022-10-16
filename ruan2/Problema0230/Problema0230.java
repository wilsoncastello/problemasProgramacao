import java.util.Scanner;

    /*Dados N pares de pontos do tipo A ( x1, y1 ) e B ( x2 , y2 ) , faça um algoritmo que : 
    a ) Para cada par , calcule e mostre a distância entre os pontos ; 
    b ) Calcule e mostre a soma das distâncias menores que 10.0 ; 
    c ) Determine e mostre a quantidade de pares cuja distância está entre 10.0 e 18.0 ( inclusive extremos ) ; 
    d ) Forneça o valor da maior distância .*/

public class Problema0230{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float x1, y1, x2, y2;
        int quantP, contPares1018 = 0;
        float dp, somaD = 0, dMaior = 0;

        System.out.print("Digite a quantidade de pares de pontos: ");
        quantP = Integer.valueOf(input.nextLine());

        for (int i = 0; i < quantP; i++) {
            System.out.println("Digite as coordenadas do ponto "+(i+i));
            System.out.print("Digite o x: ");
            x1 = Float.valueOf(input.nextLine());
            System.out.print("Digite o y: ");
            y1 = Float.valueOf(input.nextLine());
            System.out.println("");
            System.out.println("Digite as coordenadas do ponto "+(i+i+1));
            System.out.print("Digite o x: ");
            x2 = Float.valueOf(input.nextLine());
            System.out.print("Digite o y: ");
            y2 = Float.valueOf(input.nextLine());
            System.out.println("");

            dp = (float)(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));

            System.out.println("Distancia entre o Ponto "+i+" e "+(i+1)+": "+dp);

            if(dp < 10){
                somaD = somaD + dp;
            }
            else{
                if(dp >= 10 && dp <= 18){
                    contPares1018++;
                }
            }

            if(dp > dMaior){
                dMaior = dp;
            }
        }

        System.out.println("");
        System.out.println("Soma das distâncias menores que 10: "+somaD);
        System.out.println("Quantidade de pares cuja distância está entre 10 e 18: "+contPares1018);
        System.out.println("Valor da maior distância: "+dMaior);

    }
}
