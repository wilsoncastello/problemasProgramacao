import java.util.Scanner;


public class problema0149{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Valor salario minimo: ");
        float sMinimo = Float.valueOf(input.nextLine());

        System.out.println("Turno trabalho: ");
        String tt = input.nextLine();

        System.out.println("Categoria: ");
        String categoria = input.nextLine();
        
        System.out.println("Numeros horas: ");
        int nHoras = input.nextInt();

        float coeficiente = 0;
        float sBruto;
        float imposto = 0;
        float grat;
        float auxilio;
        float sLiquido;

        if(tt.equals("M")){
            coeficiente = (sMinimo*10)/100;
        }else if(tt.equals("V")){
            coeficiente = (sMinimo*15)/100;
        }else if (tt.equals("N")){
            coeficiente = (sMinimo*12)/100;
        }
        System.out.println("Coeficiente: "+coeficiente);

        sBruto = nHoras * coeficiente;
        System.out.println("Salario Bruto: "+sBruto);

        if(categoria.equals("O")){
            if(sBruto >= 300){
                imposto = (sBruto*5)/100;
            }else{
                imposto = (sBruto*3)/100;
            }
        }else if(categoria.equals("G")){
            if(sBruto >= 400){
                imposto = (sBruto*6)/100;
            }else{
                imposto = (sBruto*4)/100;
            }
        }
        System.out.println("Imposto: "+imposto);

        if(tt.equals("N") && nHoras>80){
            grat = 50;
        }else{
            grat = 30;
        }
        System.out.println("Gratificacao: "+grat);

        if(categoria.equals("O") || coeficiente<=25){
            auxilio = sBruto/3;
        }else{
            auxilio = sBruto/2;
        }
        System.out.println("Auxilio: "+auxilio);

        sLiquido = sBruto - imposto + grat + auxilio;
        System.out.println("Salario Liquido: "+sLiquido);

        if(sLiquido<350){
            System.out.println("Mal remunerado");
        }else if(sLiquido>= 250 && sLiquido<=600){
            System.out.println("Normal");
        }else{
            System.out.println("Bem remunerado");
        }

    }
}