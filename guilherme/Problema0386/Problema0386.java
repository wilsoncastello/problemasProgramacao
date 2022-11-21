import java.util.Scanner;

public class Problema0386{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        float[][] m = new float[3][4];
        float maiorAltura;
        for(int i = 0; i < 3; i++){
            maiorAltura = 0;
            for(int j = 0; j < 41; j++){
                System.out.println("Digite a altura do "+j+"º atleta da "+i+"ª delegação");
                m[i][j] = Integer.valueOf(input.nextLine());
                if(m[i][j] > maiorAltura)
                    maiorAltura = m[i][j];
            }
            System.out.println("Maior altura da "+i+"ª delegação: "+maiorAltura);
        }
    }
}