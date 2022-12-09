import java.util.Scanner;

public class Problema0345 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        /*Faça um programa que receba o nome completo de uma pessoa e reescreva-o como uma citação bibliográfica. 

Exemplo : 

Nome : Maria Silva Costa 
Saída : Costa , M. S. 

Nome : João Carlos Gomes Marques 
Saída : Marques , J. C. G.  */
        String nome;
        String ultimoNome="";
        String primeiroNome="";
        String meio="";
        int espacos=0;
        System.out.println("Digite seu nome completo: ");
        nome=input.nextLine();
        for(int i=nome.length()-1;i>nome.lastIndexOf(" ");i--){
            ultimoNome=nome.charAt(i)+ultimoNome;
        }
        primeiroNome=nome.charAt(0)+primeiroNome;
        
        for(int i=0;i<nome.length();i++){
           
           
          
            if(nome.charAt(i)==' '){
                espacos++;
            }
        }
        
            for(int j=nome.lastIndexOf(" ")-1;j>=nome.indexOf(" ");j=nome.lastIndexOf(" ", j-1)){
                
                meio=nome.charAt(j+1)+". "+meio;
            }

        
        System.out.println("Referencia bibliografica: "+ultimoNome+" , "+primeiroNome+". "+meio);
    }
}
