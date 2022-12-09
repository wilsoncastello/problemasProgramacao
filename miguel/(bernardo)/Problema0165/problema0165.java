import java.util.Scanner;

public class problema0165 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Declaração de variáveis
        int num = 6;
        int idade[] = new int[num];
        float peso[] = new float[num];
        float altura[] = new float[num];
        String olhos[] = new String[num];
        String cabelo[] = new String[num];
        int condicao1 = 0;
        float condicao2 = 0;
        int condicao2_numero = 0;
        float condicao3 = 0;
        int condicao4 = 0;

        // Entrada de valores
        for (var i = 0; i < num; i++) {
            System.out.println("Digite a idade da " + (i + 1) + " pessoa : ");
            idade[i] = Integer.valueOf(input.nextLine());
            System.out.println("Digite o peso da " + (i + 1) + " pessoa (em quilos): ");
            peso[i] = Float.valueOf(input.nextLine());
            System.out.println("Digite a altura da " + (i + 1) + " pessoa (em metros): ");
            altura[i] = Float.valueOf(input.nextLine());
            System.out.println(
                    "Digite a cor dos olhos da " + (i + 1) + " pessoa (A-azul; P-preto; V-verde; C-castanho): ");
            olhos[i] = String.valueOf(input.nextLine());
            System.out.println(
                    "Digite a cor do cabelo da " + (i + 1) + " pessoa (P-preto; C-castanho; L-louro; e R-ruivo): ");
            cabelo[i] = String.valueOf(input.nextLine());
        }

        // Cálculo das condições
        for (int i = 0; i < num; i++) {
            if (idade[i] > 50 && peso[i] < 60) {
                condicao1 += 1;
            }
            if (altura[i] < 1.5) {
                condicao2 += idade[i];
                condicao2_numero += 1;
            }
            if (olhos[i].toUpperCase().equals("A") || olhos[i].toUpperCase().equals("AZUL")) {
                condicao3 += 1;
            } else if (cabelo[i].toUpperCase().equals("R") || cabelo[i].toUpperCase().equals("RUIVO")) {
                condicao4 += 1;
            }
        }
        if (condicao2_numero > 0) {
            condicao2 /= condicao2_numero;
        }
        condicao3 /= 0.06;

        // Saída
        System.out.println(
                "A quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 kg é: " + condicao1);
        System.out.println("A média das idades das pessoas com altura inferior a 1,50m é: " + condicao2);
        System.out.println("A porcentagem de pessoas com olhos azuis é: " + condicao3 + "%");
        System.out.println("A quantidade de pessoas ruivas e que não possuem olhos azuis é: " + condicao4);
    }
}
