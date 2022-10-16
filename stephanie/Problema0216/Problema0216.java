package stephanie.Problema0216;

import java.util.Scanner;

public class Problema0216 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double rendimento, totalRen = 0;
        int totalCri = 0, familias = 0, renMenor1000 = 0;
        do{
            System.out.println("Digite o rendimento familiar:");
            rendimento = input.nextDouble();
            System.out.println("Digite quantas crianças menores tem na família:");
            int criancas = input.nextInt();
            totalRen = totalRen + rendimento;
            totalCri = totalCri + criancas;
            familias++;
            if(rendimento<=1000){
                renMenor1000++;
            }
        }while(rendimento>0);
        double mediaRen = totalRen/familias;
        double mediaCria = totalCri/familias;
        System.out.println("Média dos rendimentos da população:"+mediaRen);
        System.out.println("Média do número de filhos:"+mediaCria);
        System.out.println("Percentual de famílias com rendimento igual ou inferior a R$1000:"+renMenor1000+"%");
        
    }
}
