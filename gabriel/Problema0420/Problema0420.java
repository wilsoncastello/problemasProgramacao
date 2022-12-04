package Problema0420;

public class Problema0420 {
    public static int tirarRaiz(int radicando, int indice){
        int raiz = -1, variavel = 1;
        
        for(int i=0; i<radicando; i++){
            variavel = 1;
            for(int j=0; j<indice; j++){
                variavel = variavel * i;
            }
            if(variavel == radicando){
                raiz = i;
            }
        }
        return raiz;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int radicando, indice;
        
        System.out.println("Digite um radicando inteiro: ");
        radicando = Integer.valueOf(input.nextLine());
        
        while(radicando < 0){
            System.out.println("Invalido");
            System.out.println("Digite um radicando inteiro: ");
            radicando = Integer.valueOf(input.nextLine());
        }
        
        System.out.println("Digite um indice: ");
        indice = Integer.valueOf(input.nextLine());
        
        while(indice < 2){
            System.out.println("Invalido");
            System.out.println("Digite um indice: ");
            indice = Integer.valueOf(input.nextLine());
        }
        
        int raiz = tirarRaiz(radicando, indice);
        
        if(radicando == 0){
            System.out.println("Resultado: 0");
        }
        
        else if(radicando == 1){
            System.out.println("Resultado: 1");
        }
        
        else if(raiz == -1){
            System.out.println("Não existe raiz exata");
        }
        
        else{
            System.out.println("Resultado: "+raiz);
        }
        
    }
}
