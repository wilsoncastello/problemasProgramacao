package Problema0437;

import java.util.Scanner;
public class Problema0437 {
    public static float calcularVenda(float produtoA, float produtoB){
        float precoFinal;
        

        if(produtoA > 0  && produtoB > 0){
          precoFinal = (float) ((produtoA * 10 + produtoB * 20) * 0.85);
        }
        else{
          precoFinal = (float) ((produtoA * 10 + produtoB * 20) * 0.9);
        }
        return precoFinal;
    }

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

    float a,b, precoFinal;
    
    System.out.println("Digite a quantidade comprada do produto A: ");
    a = Float.valueOf(input.nextLine());

    System.out.println("Digite a quantidade comprada do produto B: ");
    b = Float.valueOf(input.nextLine());

    precoFinal = calcularVenda(a, b);
    System.out.println("Preço final da compra: "+precoFinal);
  }
}