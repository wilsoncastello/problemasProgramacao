package Problema0272;

public class Problema0272 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        int [] vetor = new int[15];
        boolean existe30 = false;


        for(int i=0; i<15; i++){
            System.out.println("Digite o elemento inteiro da posiçao "+i);
            vetor[i] = Integer.valueOf(input.nextLine());
        }

        System.out.println("Posiçoes do vetor onde o valor armazenado é igual a 30");
        for(int i=0; i<15; i++){
            if(vetor[i] == 30){
            existe30 = true;
            System.out.println("Posiçao: " +i);
            }
        }
    
        if(existe30 == false){
            System.out.println("Nenhuma posição contem o valor igual a 30");
        }   
    
    }
}

