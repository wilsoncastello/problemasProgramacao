package Problema0264;

import java.util.Scanner;
public class Problema0264 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int jogadaDado[] = new int[20] ;
    int cont1 =0, cont2 =0, cont3 =0, cont4=0, cont5=0, cont6=0;

    for(int i=0; i<20; i++){
      System.out.println("valor do dado na jogada nº "+ i + ": ");
      jogadaDado[i] = Integer.valueOf(input.nextLine());
    }

    for(int i=0; i<20; i++){
      switch(jogadaDado[i]){
        case 1:
            cont1++;
            break;

        case 2: 
          cont2++;
          break;

        case 3:
          cont3++;
          break;

        case 4:
          cont4++;
          break;

        case 5:
          cont5++;
          break;

        case 6:
          cont6++;
          break;
          
      }
    }

    System.out.println("Frequência do numero 1: " + cont1);
    System.out.println("Frequência do numero 2: " + cont2);
    System.out.println("Frequência do numero 3: " + cont3);
    System.out.println("Frequência do numero 4: " + cont4);
    System.out.println("Frequência do numero 5: " + cont5);
    System.out.println("Frequência do numero 6: " + cont6);
    
  }

}
