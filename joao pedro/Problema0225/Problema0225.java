import java.util.Scanner;

public class Problema0225 {
    public static void main(String[] args) {
        
    Scanner input=new Scanner(System.in);
    int quantidade,tipo,naoAsfaltado=0,maisQue15=0;
    double varanista,distancia;
    String nome,C="";
    System.out.println("Digite a quantidade de praias na regiao:");
    quantidade=Integer.valueOf(input.nextLine());

    for(int i=0;i<quantidade;i++){
        System.out.println("Digite o nome da praia "+i);
        nome=input.nextLine();
        System.out.println("Digite o numero medio de varanistas: ");
        varanista=Double.valueOf(input.nextLine());
        System.out.println("Digite o tipo de praia('0' - acesso nao asfaltado/ '1' - acesso asfaltado)");
        tipo=Integer.valueOf(input.nextLine());
        if(tipo==0){
            naoAsfaltado++;
        }
        System.out.println("Digite a distancia entre a praia e o centro(km): ");
        distancia=Double.valueOf(input.nextLine());
        if(distancia>15){
            maisQue15++;
        }
        if(varanista<1000){
            C=C+nome+" ";
            C=" "+C+distancia+". ";
        }

    }
        System.out.println("Numero de praias que distam mais de 15km: "+maisQue15);
        System.out.println("A quantidade media de veranistas , na ultima temporada , nas praias com acesso nao asfaltado: "+naoAsfaltado);
        System.out.println("O nome e a distancia do centro , em km , de todas as praias de acesso asfaltado que tiveram menos de 1000 veranistas: "+C);
    
    
    
    
    }



}
