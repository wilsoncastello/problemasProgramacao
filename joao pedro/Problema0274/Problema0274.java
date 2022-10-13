import java.util.Scanner;

public class Problema0274{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double positivo=0,negativo=0,numero=0;
        System.out.println("--Digite 10 numeros--");
        for(int i=0;i<10;i++){
            System.out.println("Digite um valor para o numero de posicao "+i+": ");
            numero=Double.valueOf(input.nextLine());
            if(numero>0){
                positivo=positivo+numero;
            } else {
                negativo++;

            }


        }
        System.out.println("A soma de todos os numeros positivos: "+positivo);
        System.out.println("A quantidade de numeros negativos: "+negativo);
    }


}