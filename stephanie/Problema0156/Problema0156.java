package stephanie.Problema0156;

import java.util.Scanner;

public class Problema0156 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o preço do produto: ");
        double preco = Double.parseDouble(input.nextLine());
        System.out.print("Digite o código de origem do produto: ");
        int codigo = Integer.parseInt(input.nextLine());

        if(codigo==1){
           System.out.print("Procedência do produto: Sul");
        }else if(codigo==2){
            System.out.print("Procedência do produto: Norte");
        }else if(codigo==3){
            System.out.print("Procedência do produto: Leste");
        }else if(codigo==4){
            System.out.print("Procedência do produto: Oeste");
        }else if(codigo==5||codigo==6){
            System.out.print("Procedência do produto: Nordeste");
        }else if(codigo==7||codigo==8||codigo==9){
            System.out.print("Procedência do produto: Sudeste");
        }else if(codigo<=10&&codigo<=20){
            System.out.print("Procedência do produto: Centro-Oeste");
        }else if(codigo<=21&&codigo>=30){
            System.out.print("Procedência do produto: Nordeste");
        }
    }
}
