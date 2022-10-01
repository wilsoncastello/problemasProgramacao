import java.util.Scanner;

public class Problema0165{
    public static void main(String[] args) {
        double altura=0,peso=0,altura1020=0,pesoInferior=0,mediaAlturas=0,porcentagem=0;
        int idade=0,pessoaMaior50=0,idade1020=0;
        Scanner input=new Scanner(System.in);

        for(int i=0;i<5;i++){
            System.out.println("Digite a altura da pessoa "+i+": ");
            altura=Double.valueOf(input.nextLine());
            System.out.println("Digite o peso da pessoa "+i+": ");
            peso=Double.valueOf(input.nextLine());
            System.out.println("Digite a idade da pessoa "+i+": ");
            idade=Integer.valueOf(input.nextLine());
            if(idade>=10 && idade<=20){
                altura1020=altura+altura1020;
                idade1020++;
            }
            if(idade>50){
                pessoaMaior50++;


            }
            if(peso<40){
                pesoInferior++;
            }


        }
        mediaAlturas=altura1020/idade1020;
        porcentagem=(pesoInferior*100)/5;
        System.out.println("A quantiade de pessoas com idade superior a 50 anos: "+pessoaMaior50);
        System.out.println("A media das alturas das pessoas com idade entre 10 e 20 anos: "+mediaAlturas);
        System.out.println("A porcentagem de pessoas com peso inferior a 40 kg entre todas as pessoas analizadas: "+porcentagem);



    }










} 