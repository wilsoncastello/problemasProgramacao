import java.util.Scanner;

public class problema0263 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String[] nomes = new String[5];
        double[] salario = new double[5];
        int[] tempo = new int[5];
        for(int i=0;i<5;i++){
            System.out.print("Digite o nome do funcionário "+i+" :");
            nomes[i] = input.nextLine();
        }
        for(int i=0;i<5;i++){
            System.out.println("Digite o salário de "+nomes[i]+" :");
            salario[i] = Float.valueOf(input.nextLine());
        }
        for(int i=0;i<5;i++){
            System.out.println("Digite o tempo de serviço de "+nomes[i]+" (Em anos):");
            tempo[i] = Integer.valueOf(input.nextLine());
        }
        System.out.println("Funcionários que não tem direito ao aumento: ");
        for(int i=0;i<5;i++){
            if(tempo[i] < 5 && salario[i] > 800){
                System.out.println(nomes[i]);
            }
        }
        System.out.println("Funcionários que tem direito ao aumento: ");
        for(int i=0;i<5;i++){         
            if(tempo[i] > 5 && salario[i] < 800){
                salario[i] = salario[i] + salario[i] * 0.35;
                System.out.println(nomes[i]+" Novo salário: "+salario[i]);
            }
            else if(tempo[i] > 5 && salario[i] > 800){
                salario[i] = salario[i] + salario[i] * 0.25;
                System.out.println(nomes[i]+" Novo salário: "+salario[i]);
            }
            else if(salario[i] < 800 && tempo[i] < 5){
                salario[i] = salario[i] + salario[i] * 0.15;
                System.out.println(nomes[i]+" Novo salário: "+salario[i]);
            }
        }
    }
}