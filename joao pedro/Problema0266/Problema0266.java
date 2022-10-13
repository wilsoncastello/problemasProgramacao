import java.util.Scanner;

public class Problema0266 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int vetor15[]=new int[15];
        int vetorI[]=new int[5];
        int vetorP[]=new int[5];
        int x=0;
        int y=0;
        System.out.println("--Digite 15 numeros--");
        for(int i=0;i<15;i++){
            System.out.println("Numero de posicao "+i+": ");
            vetor15[i]=Integer.valueOf(input.nextLine());

            if(vetor15[i]%2==0 && x<5){
                vetorP[x]=vetor15[i];
                x++;
            } else{
            if(vetor15[i]%2==1 && y<5)
                vetorI[y]=vetor15[i];
                y++; }
            if(x>=5){
                System.out.println("Vetor P cheio!");
                for(int a=0;a<5;a++){
                    System.out.println(vetorP[a]);
                }
                System.out.println("--Recomecando vetor P--");
                x=0;
            }    
            if(y>=5){
                System.out.println("Vetor I cheio!");
                for(int b=0;b<5;b++){
                    System.out.println(vetorI[b]);
                }
                System.out.println("--Recomecando vetor I--");
                y=0;
            }
        }
        System.out.println("Vetor P final: ");
        for(int i=0;i<5;i++){
            System.out.println(vetorP[i]);

        }
        System.out.println("Vetor I final: ");
        for(int i=0;i<5;i++){
            System.out.println(vetorI[i]);
        }
        }
        
          

        }

    

