import java.util.Scanner;

public class problema0204 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);      
        String nome;
        float salarioBruto;
        double valorAliquota = 0;
        for(int i = 0; i < 10; i++){
            System.out.println("Digite seu nome:");
            nome = input.nextLine();
            System.out.println("Digite seu salário bruto:");
            salarioBruto = Float.valueOf(input.nextLine());
            if (salarioBruto < 600){
                System.out.println(nome+" você é isento da alíquota do imposto de renda");
            }
            else if(salarioBruto >= 600 && salarioBruto < 1500){
                valorAliquota = salarioBruto * 0.1;
                System.out.println(nome+" o valor da alíquota do seu imposto de renda é:"+valorAliquota);
            }
            else {
                valorAliquota = salarioBruto * 0.15;
                System.out.println(nome+" o valor da alíquota do seu imposto de renda é:"+valorAliquota);
            }
        }       
    }
}