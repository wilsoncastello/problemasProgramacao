package Problema0258;

import java.util.Scanner;

public class problema0258{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Quantidade de voos oferecidos: ");
        int qVoos = Integer.valueOf(input.nextLine());

        int vN[] = new int[qVoos];
        String vOrigem[] = new String[qVoos];
        String vDestino[] = new String[qVoos];
        int vLugares[] = new int[qVoos];

        for(int i = 0; i < qVoos; i++){
            System.out.println("Numero do voo " + (i+1) + ": ");
            vN[i] = Integer.valueOf(input.nextLine());
            System.out.println("Origem do voo " + (i+1) + ": ");
            vOrigem[i] = input.nextLine();
            System.out.println("Destino do voo " + (i+1) + ": ");
            vDestino[i] = input.nextLine();
            System.out.println("Lugares do voo " + (i+1) + ": ");
            vLugares[i] = Integer.valueOf(input.nextLine());
        }

        System.out.println("\nSELECIONE UMA OPÇÃO \n1- Consultar; \n2- Efetuar Reserva; \n3- Sair.");
        int resposta = Integer.valueOf(input.nextLine());

        while(resposta != 3){
            if(resposta == 1){
                System.out.println("\nSELECIONE UMA CONSULTA \n1 - Pelo número do voo; \n2 - Pela origem; \n3 - Por destino.");
                int consulta = Integer.valueOf(input.nextLine());
                switch(consulta){
                    case 1:
                        System.out.println("Digite o numero do voo: ");
                        int nVoo = Integer.valueOf(input.nextLine());
                        for(int i = 0; i < qVoos; i++){
                            if(vN[i] == nVoo){
                                System.out.println("Numero do voo: " + nVoo);
                                System.out.println("Origem do voo: " + vOrigem[i]);
                                System.out.println("Destino do voo: " + vDestino[i]);
                                System.out.println("Lugares disponíveis: " + vLugares[i]);
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Digite a origem: ");
                        String origem = input.nextLine();
                        for(int i = 0; i < qVoos; i++){
                            if(origem.equalsIgnoreCase(vOrigem[i])){
                                System.out.println("\nNumero do voo: " + vN[i]);
                                System.out.println("Origem do voo: " + origem);
                                System.out.println("Destino do voo: " + vDestino[i]);
                                System.out.println("Lugares disponíveis: " + vLugares[i]);
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Digite o destino: ");
                        String destino = input.nextLine();
                        for(int i = 0; i < qVoos; i++){
                            if(destino.equalsIgnoreCase(vDestino[i])){
                                System.out.println("\nNumero do voo: " + vN[i]);
                                System.out.println("Origem do voo: " + vOrigem[i]);
                                System.out.println("Destino do voo: " + destino);
                                System.out.println("Lugares disponíveis: " + vLugares[i]);
                            }
                        }
                        break;
                }
            }else if(resposta == 2){
                System.out.println("Numero do voo para a reserva: ");
                int vooReserva = Integer.valueOf(input.nextLine());
                boolean vooReservaB = false;
                for(int i = 0; i < qVoos; i++){
                    if(vN[i] == vooReserva){
                        vooReservaB = true;
                        if(vLugares[i] > 0){
                            System.out.println("Reserva confirmada.");
                            vLugares[i]--;
                        }else{
                            System.out.println("Voo lotado.");
                        }
                    }
                }
                if(vooReservaB == false){
                    System.out.println("Voo inexistente.");
                }
            }

            System.out.println("\nSELECIONE UMA OPÇÃO \n1- Consultar; \n2- Efetuar Reserva; \n3- Sair.");
            resposta = Integer.valueOf(input.nextLine());
        }
    }
}