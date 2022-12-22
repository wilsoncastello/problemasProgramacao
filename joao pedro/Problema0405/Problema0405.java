import java.util.Scanner;

public class Problema0405{
   
   
    public static void Media(double[] notas,String[] tipo,double[] resultado){
        

        if(tipo[0].equalsIgnoreCase("P")){
        notas[0]=notas[0]*5;
        notas[1]=notas[1]*3;
        notas[2]=notas[2]*2;
        resultado[0]=(notas[0]+notas[1]+notas[2])/10;
        }
        else {
        resultado[0]=(notas[0]+notas[1]+notas[2])/3;
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double []notas=new double[3];
        String []tipo=new String[1];
        double []resultado=new double[1];
        System.out.println("Digite 3 notas: ");
        for(int i=0;i<3;i++){
        notas[i]=Double.valueOf(input.nextLine());

        }
        System.out.println("Digite 'A' para media aritmetica ou 'P' para media ponderada: ");
        tipo[0]=input.nextLine();
        
        Media(notas, tipo,resultado);
        
        System.out.println("Resultado: "+resultado[0]);
    
    
    }
    

    

}


