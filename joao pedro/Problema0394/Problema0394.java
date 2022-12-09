import java.util.Scanner;

public class Problema0394 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double [][] gasto=new double[24][2];
        double maiorGasto=0;
        int ano=0,mes=0;
        double consumo1=0;
        double consumo2=0;
        double medio1=0;
        double medio2=0;
        for(int i=0;i<2;i++){
            for(int j=0;j<12;j++){
                System.out.println("Digite o gasto do mes "+j+" no ano "+i+": ");
                gasto[j][i]=Double.valueOf(input.nextLine());
                if(gasto[j][i]>maiorGasto){
                    maiorGasto=gasto[j][i];
                    ano=i;
                    mes=j;
                }
                if(i==0){
                    consumo1=gasto[j][i]+consumo1;
                    
                } else{
                    consumo2=gasto[j][i]+consumo2;
                }
            }
        }
       System.out.println("Consumo medio em 2020 (ano 0): "+consumo1/12);
       System.out.println("Consumo medio em 2022 (ano 1): "+consumo2/12);
        System.out.println("Maior gasto de energia (Mes/Ano): "+mes+"/"+ano);

        System.out.println("Consumo em 2020 (ano 0): "+consumo1);
        System.out.println("Consumo em 2022 (ano 1): "+consumo2);
    }
}
