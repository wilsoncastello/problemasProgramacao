package problema0332;

public class Problema0332 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
         System.out.println("Digite uma frase: ");
         String frase = input.nextLine();
         String fraseSemEspaco = frase.replace(" ", "");
         
         String fraseLower = fraseSemEspaco.toLowerCase();
         
         
         char vetorFrase[] = fraseLower.toCharArray();
         int vetorContador[] = new int [frase.length()];
        
         
         for(int i=0; i<fraseSemEspaco.length(); i++){
             vetorContador[i] = 1;
             for(int j=i+1; j<fraseSemEspaco.length(); j++){
             if(vetorFrase[i] == vetorFrase[j]){
                 vetorContador[i] = vetorContador[i] + 1;
                 vetorFrase[j] = 0;
             }
             
           }
             
         }
         
         for(int i=0; i<fraseSemEspaco.length(); i++){
                 if(vetorFrase[i] != 0 && vetorContador[i] > 1){
                     System.out.println("A letra "+vetorFrase[i] + " aparece " + vetorContador[i] + " vezes");
                 }
             }
         
         
     }
     
 }
