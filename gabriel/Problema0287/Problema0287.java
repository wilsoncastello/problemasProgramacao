package Problema0287;

public class Problema0287 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        float [] vetorA = new float[10];
        float [] vetorB = new float[10];
        char [] operacao = new char[10];
        float [] vetorResultado = new float[10];
    
        System.out.println("Digite os valores do vetor A");
        for(int i=0; i<10; i++){
          System.out.println("posiçao "+i);
          vetorA[i] = Float.valueOf(input.nextLine());
        }
    
        System.out.println("Digite os valores do vetor B");
        for(int i=0; i<10; i++){
          System.out.println("posiçao "+i);
          vetorB[i] = Float.valueOf(input.nextLine());
        }
    
        System.out.println("Digite as operaçoes(+, -, *, /)");
        for(int i=0; i<10; i++){
          System.out.println("posiçao "+i);
          operacao[i] = input.nextLine().charAt(0);
        }
    
        for(int i=0; i<10; i++){
          switch(operacao[i]){
            case '+': 
              vetorResultado[i] = vetorA[i] + vetorB[i];
              break;
            
            case '-': 
              vetorResultado[i] = vetorA[i] - vetorB[i];
              break;
    
            case '*': 
              vetorResultado[i] = vetorA[i] * vetorB[i];
              break;
    
            case '/': 
              vetorResultado[i] = vetorA[i] / vetorB[i];
              break;
          }
        }
        
        
    
        System.out.println("Vetor resultado");
        for(int i=0; i<10; i++){
           if(operacao[i] == '+' || operacao[i] == '-' || operacao[i] == '*' || operacao[i] == '/'){
                System.out.println(vetorResultado[i]);
            }
           
           else{
               System.out.println("valor inexistente");
           }
        }
      }
    }
   