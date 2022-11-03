import java.util.Scanner;

public class Problema0260{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = 0, j = 0;
        float tempMenor = 0, tempMaior = 0;
        float[] tempM = new float[12];
        String[] mes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        for(int i = 0; i<12; i++){
            System.out.print("Digite a temperatura media do mês "+(i + 1)+": ");
            tempM[i] = Float.valueOf(input.nextLine());

            if(i == 0){
                tempMaior = tempMenor = tempM[i];
            }
            else{
                if(tempM[i] > tempMaior){
                    tempMaior = tempM[i];
                    k = i;
                }
                else{
                    if(tempM[i] < tempMenor){
                        tempMenor = tempM[i];
                        j = i;
                    }
                }
            }
        }
        System.out.println("A maior temperatura registrada foi do mês de "+mes[k]+", com "+tempMaior+" graus");
        System.out.println("A menor temperatura registrada foi do mês de "+mes[j]+", com "+tempMenor+" graus");
    }
}