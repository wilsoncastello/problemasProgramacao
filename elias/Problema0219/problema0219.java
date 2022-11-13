import java.util.Scanner;

public class problema0219 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int numerador1, numerador2, denominador1, denominador2, resto, i, mmc, resultado, resultadoFinal;    
        System.out.println("Digite o numerador da primeira fração:");
        numerador1 = Integer.valueOf(input.nextLine());
        System.out.println("Digite o denominador da primeira fração:");
        denominador1 = Integer.valueOf(input.nextLine());
        System.out.println("Digite o numerador da segunda fração:");
        numerador2 = Integer.valueOf(input.nextLine());
        System.out.println("Digite o denominador da segunda fração:");
        denominador2 = Integer.valueOf(input.nextLine());
        for(i=1;i>0;i++){
            resto = (denominador1 * i) % denominador2;
            if(resto==0){
                break;
            }
        }
        mmc = denominador1 * i;
        resultado = (mmc/denominador1*numerador1) + (mmc/denominador2*numerador2);
        if(resultado != mmc){
            System.out.println("A soma das frações é: "+resultado+"/"+mmc);
            if(resultado % mmc == 0){
                resultadoFinal = resultado / mmc;
                System.out.println("O resultado final é: "+resultadoFinal);
            }
        }
        else 
            System.out.println("A soma das frações é: "+1);     
    }
}