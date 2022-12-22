import java.util.Scanner;
public class Problema0422{

    public static void funcao(String []valor){
       
        if(valor[0].startsWith("a")||valor[0].startsWith("i")||valor[0].startsWith("u")||valor[0].startsWith("e")||valor[0].startsWith("o")){
        valor[0]="0";
        } else{
        if(valor[0].startsWith("b")||valor[0].startsWith("c")||valor[0].startsWith("d")||valor[0].startsWith("f")||valor[0].startsWith("g")||valor[0].startsWith("h")||valor[0].startsWith("j")||valor[0].startsWith("k")||valor[0].startsWith("l")||valor[0].startsWith("m")||valor[0].startsWith("n")||valor[0].startsWith("p")||valor[0].startsWith("q")||valor[0].startsWith("r")||valor[0].startsWith("s")||valor[0].startsWith("t")||valor[0].startsWith("u")||valor[0].startsWith("v")||valor[0].startsWith("w")||valor[0].startsWith("x")||valor[0].startsWith("y")||valor[0].startsWith("z")){
        valor[0]="1";    
        } else{
            valor[0]="-1";
        }

    }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String [] valor=new String[1];

        System.out.println("Digite um caractere: ");
        valor[0]=input.nextLine();
        funcao(valor);
        System.out.println("Resultado: "+valor[0]);
    }
}