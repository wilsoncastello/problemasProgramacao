import java.util.Scanner;
public class Problema0282{
    
    public static void main(String[] args) {
        /*Crie um algoritmo que armazene cinco nomes em um vetor e depois leia outro nome. 
        Se o nome for encontrado no vetor, o programa deve imprimir a posição desse nome no vetor; 
       caso contrário, deve imprimir a mensagem "Nome não encontrado".  */
        Scanner input=new Scanner(System.in);
        String digite;
        int x=0;
       String nome[] = new String[5];
       for(int i=0;i<5;i++){
       System.out.println("Digite um nome de posicao "+i+": ");
       nome[i]=input.nextLine();
       }
       System.out.println("Digite mais um nome: ");
       digite=input.nextLine();

       for(int i=0;i<5;i++){
        if(digite.equalsIgnoreCase(nome[i])){
            System.out.println("O mesmo nome e encontrado na posicao: "+i);
            x=1;
        }
        
       }

       if(x==0){
        System.out.println("Nome nao encontrado");
       }




    }


}