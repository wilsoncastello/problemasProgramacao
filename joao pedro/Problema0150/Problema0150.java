import java.util.Scanner;

public class Problema0150 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double preco=0,aumento=0;
        String tipo, refrigerado;

        System.out.println("Digite o preco do produto: ");
        preco = Double.valueOf(input.nextLine());
        System.out.println("Digite o tipo de produto(A - alimentacao; L - limpeza; e V - vestuario): ");
        tipo = input.nextLine();

        switch (tipo) {
            case "A":
                if (preco <= 25) {
                    aumento = preco * 1.08;

                } else {
                    aumento = preco * 1.15;
                }
                break;

            case "L":
                if (preco <= 25) {
                    aumento = preco * 1.05;

                } else {
                    aumento = preco * 1.12;
                }
                break;
            case "V":
                if (preco <= 25) {
                    aumento = preco * 1.10;

                } else {
                    aumento = preco * 1.18;
                }
                break;
        }
            System.out.println("Classifique o produto (S - produto que necessita de refrigeracao; e N - produto que nao necessita de refrigeracao):");
            refrigerado=input.nextLine();
           
            switch (refrigerado){
                case "S":
                if(aumento<=50){
                    System.out.println("Novo preco: "+aumento+". Classificacao: Barato");
                }
                else{ 
                    if(aumento>50 && aumento<120){
                        System.out.println("Novo preco: "+aumento+". Classificacao: Normal");
                    }
                    else {
                        System.out.println("Novo preco: "+aumento+". Classificacao: Caro");
                    }


                 }
                 break;


                case "N":
                aumento=aumento*0.97;
                if(aumento<=50){
                    System.out.println("Novo preco: "+aumento+". Classificacao: Barato");
                }
                else{ 
                    if(aumento>50 && aumento<120){
                        System.out.println("Novo preco: "+aumento+". Classificacao: Normal");
                    }
                    else {
                        System.out.println("Novo preco: "+aumento+". Classificacao: Caro");
                    }


                 }



            }

    }

}