package stephanie.Problema0305;

public class Problema0305 {

public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[];
        for(int i;i < 10;i++){
            System.out.println("Digite um número: ");
            vetor[i] = input.nextLine();
        }
        int j = 0;
        while(vetor[j]>0 && j<10){
            j=j+1
        }
        if(j=9){
            System.out.println("Não existem valores negativos");
        }else{
            System.out.println("O número negativo está na posição: "+j);
        }
    }


}