package Problema0367;

class Problema0367{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
  
      int matriz[][] = new int[4][4];
      boolean pontoDeSela = false;
  
      for(int i=0; i<4; i++){
        for(int j=0; j<4; j++){
          System.out.println("Digite o valor da linha "+i+ " e da coluna "+j);
          matriz[i][j] = Integer.valueOf(input.nextLine());
        }
      }
      
      
      for(int i=0; i<4; i++){
          int menorDaLinha = matriz[i][0]; int indiceColuna = 0; int indiceLinha = 0;
          for(int j=1; j<4; j++){
              if(menorDaLinha > matriz[i][j]){
                  menorDaLinha = matriz[i][j];
                  indiceColuna = j;
                  indiceLinha = i;
              }
          }
          int k;
          for(k=0; k<4; k++){
              if(menorDaLinha < matriz[k][indiceColuna]){
                  break;
              }
          }
          
          if(k == 4){
              pontoDeSela = true;
              System.out.println("Existe ponto de sela na posição: linha: " +indiceLinha+ " coluna: "+indiceColuna );
              System.out.println("O valor é "+ menorDaLinha);
              
          }
    
      }
      
      if(pontoDeSela == false){
          System.out.println("Não existe ponto de sela na matriz");
      }
     }
}