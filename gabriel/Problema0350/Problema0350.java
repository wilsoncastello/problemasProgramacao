package Problema0350;

public class Problema0350 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
          System.out.println("Digite uma palavra");
          String palavra = input.nextLine();
          
          System.out.println("Digite outra palavra");
          String palavra2 = input.nextLine();
          
          char vetorPalavra[] = palavra.toCharArray();
          char vetorPalavra2[] = palavra2.toCharArray();
          boolean permuta = true;
          
          if(palavra.length() != palavra2.length()){
              permuta = false;
          }
          
          else{
          
              for(int i=0; i<palavra.length(); i++){
                  for(int j=0; j<palavra2.length(); j++){
                      if(vetorPalavra[i] == vetorPalavra2[j]){
                          vetorPalavra[i] = 0;
                          vetorPalavra2[j] = 0;
                      }
                  }
              }
          
              for(int i=0; i<palavra.length(); i++){
                  if(vetorPalavra[i] != 0 || vetorPalavra2[i] != 0){
                      permuta = false;
                  }
              }
          }   
          System.out.println("A primeira palavra é uma permutação da segunda? : " +permuta);
       
   }
  }
