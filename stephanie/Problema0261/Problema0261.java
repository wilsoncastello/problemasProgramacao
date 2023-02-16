package stephanie.Problema0261;

public class Problema0261 {

public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] modelos = new String[5];
        boolean[] consumo = new boolean[5];
        String modeloEconomico;
        boolean litrosCombustivel, maisEconomico=1000;
        for(int i=0; i<5; i++){
            System.out.println("Digite o modelo do carro "+i+": ")
            modelos[i] = input.nextLine();
        }
        for(int i=0; i<5; i++){
            System.out.println("Digite o consumo do carro "+i+": ")
            consumo[i] = input.nextBoolean();
        }
        for (int i=0;i<5;i++){
            if(consumo[i]<maisEconomico){
                modeloEconomico = modelos[i];
            }
        }
        System.out.println("Modelo mais econômico:"+modeloEconomico);
        
        System.out.println("Quantos litros de combustível cada um dos carros cadastrados "+ 
        "consome para percorrer uma distância de 1.000 km:");
        for (int i=0;i<5;i++){
            litrosCombustivel = consumo[i]*1000;
            System.out.println(modelos[i]":"+litrosCombustivel);
        }
        
    }


}