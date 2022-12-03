import java.util.Scanner;

public class problema0175{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota1, nota2, mediaA;
        double n1, n2, n3, p1, p2, p3, mediaP;
        int op;

        do {
            System.out.print("Menu de opções: \n\t1.Média aritmética \n\t2.Média ponderada \n\t3.Sair. \nDigite a opção desejada: ");
            op = Integer.parseInt(input.nextLine());

            switch (op){
                case 1:
                    System.out.print("Insira a primeira nota");
                    nota1 = Double.parseDouble(input.nextLine());
                    System.out.print("Insira a segunda nota");
                    nota2 = Double.parseDouble(input.nextLine());
                    
                    mediaA = (nota1 + nota2)/2;
                    System.out.println("Média aritmetica: "+mediaA);
                    break;

                case 2:
                    System.out.print("Insira a primeira nota: ");
                    n1 = Double.parseDouble(input.nextLine());
                    System.out.print("Insira a segunda nota: ");
                    n2 = Double.parseDouble(input.nextLine());
                    System.out.print("Insira a terceira nota: ");
                    n3 = Double.parseDouble(input.nextLine());
                    System.out.print("Insira o primeiro peso: ");
                    p1 = Double.parseDouble(input.nextLine());
                    System.out.print("Insira o segundo peso: ");
                    p2 = Double.parseDouble(input.nextLine());
                    System.out.print("Insira o terceiro peso: ");
                    p3 = Double.parseDouble(input.nextLine());
                    mediaP = (n1*p1 + n2*p2 + n3*p3)/ (p1 + p2 + p3);
                    System.out.print("Média ponderada: "+ mediaP +"\n");
                    break;
              
                case 3:
                    System.out.println("Sair\n");
                    break;
       
                default:
                    System.out.println("Digite uma opção valida\n");
             }
       
        }while (op != 3);
       
    }
}