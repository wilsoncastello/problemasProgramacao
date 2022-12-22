
import java.util.Scanner;

public class Problema0352 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String data;
        String mes = "", dia = "", ano = "";
        System.out.println("Digite uma data (DD/MM/AAAA)");
        data = input.nextLine();

        for (int i = data.lastIndexOf("/") - 1; i > data.indexOf("/"); i--) {
            mes = data.charAt(i) + mes;

        }

        for (int i = data.indexOf("/") - 1; i >= 0; i--) {
            dia = data.charAt(i) + dia;

        }
        for (int i = data.length() - 1; i > data.lastIndexOf("/"); i--) {
            ano = data.charAt(i) + ano;
        }

        if (mes.contains("01"))
            System.out.println(dia + "/Janeiro/" + ano);

        if (mes.contains("02"))
            System.out.println(dia + "/Fevereiro/" + ano);

        if (mes.contains("03"))
            System.out.println(dia + "/Marco/" + ano);

        if (mes.contains("04"))
            System.out.println(dia + "/Abril/" + ano);

        if (mes.contains("05"))
            System.out.println(dia + "/Maio/" + ano);

        if (mes.contains("06"))
            System.out.println(dia + "/Junho/" + ano);

        if (mes.contains("07"))
            System.out.println(dia + "/Julho/" + ano);

        if (mes.contains("08"))
            System.out.println(dia + "/Agosto/" + ano);

        if (mes.contains("09"))
            System.out.println(dia + "/Setembro/" + ano);

        if (mes.contains("10"))
            System.out.println(dia + "/Outubro/" + ano);

        if (mes.contains("11"))
            System.out.println(dia + "/Novembro/" + ano);

        if (mes.contains("12"))
            System.out.println(dia + "/Dezembro/" + ano);
    }

}