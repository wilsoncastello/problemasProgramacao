package Problema0357;

import java.util.Scanner;
public class Problema0357 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma mensagem: ");
        String mensagem = input.nextLine();
        String novaMensagem = mensagem.toLowerCase();
        
        
        String letra[] = new String[26];
        String ASCII[] = new String[26];
        
        letra[0] = "a"; letra[1] = "b"; letra[2] = "c"; letra[3] = "d"; letra[4] = "e"; letra[5] = "f"; letra[6] = "g"; letra[7] = "h"; letra[8] = "i"; letra[9] = "j"; letra[10] = "k";
        letra[11] = "l"; letra[12] = "m"; letra[13] = "n"; letra[14] = "o"; letra[15] = "p"; letra[16] = "q"; letra[17] = "r"; letra[18] = "s"; letra[19] = "t"; letra[20] = "u";
        letra[21] = "v"; letra[22] = "w"; letra[23] = "x"; letra[24] = "y"; letra[25] = "z";
        
        ASCII[0] = "65 "; ASCII[1] = "66 "; ASCII[2] = "67 "; ASCII[3] = "68 "; ASCII[4] = "69 "; ASCII[5] = "70 "; ASCII[6] = "71 "; ASCII[7] = "72 "; ASCII[8] = "73 "; ASCII[9] = "74 ";
         ASCII[10] = "75 "; ASCII[11] = "76 "; ASCII[12] = "77 "; ASCII[13] = "78 "; ASCII[14] = "79 "; ASCII[15] = "80 "; ASCII[16] = "81 "; ASCII[17] = "82 "; ASCII[18] = "83 "; ASCII[19] = "84 ";
          ASCII[20] = "85 "; ASCII[21] = "86 "; ASCII[22] = "87 "; ASCII[23] = "88 "; ASCII[24] = "89 "; ASCII[25] = "90 ";
          
           
          System.out.println("Mensagem digitada: "+ novaMensagem);
           
           
          for(int i=0; i<26; i++){
              novaMensagem = novaMensagem.replace(letra[i], ASCII[i]);
          }
          
          System.out.println("Mensagem criptografada: "+novaMensagem);
          
          
          for(int i=0; i<26; i++){
              novaMensagem = novaMensagem.replace(ASCII[i], letra[i]);
          }
          
          System.out.println("Mensagem descriptografada: "+novaMensagem);
           
            
    }
 }
