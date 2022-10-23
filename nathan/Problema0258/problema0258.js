const prompt = require("prompt-sync")({ sigint: true });

        var qVoos = Number(prompt("Quantidade de voos oferecidos: "));

        var vN = [qVoos];
        var vOrigem = [qVoos];
        var vDestino = [qVoos];
        var vLugares = [qVoos];

        for(i = 0; i < qVoos; i++){            
            vN[i] = Number(prompt("Numero do voo " + (i+1) + ": "));
            vOrigem[i] = prompt("Origem do voo " + (i+1) + ": ");
            vDestino[i] = prompt("Destino do voo " + (i+1) + ": ");
            vLugares[i] = Number(prompt("Lugares disponíveis " + (i+1) + ": "));
        }

        var resposta = Number(prompt("\nSELECIONE UMA OPÇÃO \n1- Consultar; \n2- Efetuar Reserva; \n3- Sair."));

        while(resposta != 3){
            if(resposta == 1){
                var consulta = Number(prompt("\nSELECIONE UMA CONSULTA \n1 - Pelo número do voo; \n2 - Pela origem; \n3 - Por destino."));
                switch(consulta){
                    case 1:
                        var nVoo = Number(prompt("Digite o numero do voo: "))
                        for(i = 0; i < qVoos; i++){
                            if(vN[i] == nVoo){
                                console.log("Numero do voo: " + nVoo);
                                console.log("Origem do voo: " + vOrigem[i]);
                                console.log("Destino do voo: " + vDestino[i]);
                                console.log("Lugares disponíveis: " + vLugares[i]);
                            }
                        }
                        break;
                    case 2:
                        var origem = prompt("Digite a origem: ")
                        for(i = 0; i < qVoos; i++){
                            if(origem == vOrigem[i]){
                                console.log("\nNumero do voo: " + vN[i]);
                                console.log("Origem do voo: " + origem);
                                console.log("Destino do voo: " + vDestino[i]);
                                console.log("Lugares disponíveis: " + vLugares[i]);
                            }
                        }
                        break;
                    case 3:
                        var destino = prompt("Digite o destino: ")
                        for(i = 0; i < qVoos; i++){
                            if(destino == vDestino[i]){
                                console.log("\nNumero do voo: " + vN[i]);
                                console.log("Origem do voo: " + vOrigem[i]);
                                console.log("Destino do voo: " + destino);
                                console.log("Lugares disponíveis: " + vLugares[i]);
                            }
                        }
                        break;
                }
            }else if(resposta == 2){                
                var vooReserva = Number(prompt("Numero do voo para a reserva: "));
                vooReservaB = false;
                for(i = 0; i < qVoos; i++){
                    if(vN[i] == vooReserva){
                        vooReservaB = true;
                        if(vLugares[i] > 0){
                            console.log("Reserva confirmada.");
                            vLugares[i]--;
                        }else{
                            console.log("Voo lotado.");
                        }
                    }
                }
                if(vooReservaB == false){
                    console.log("Voo inexistente.");
                }
            }

            resposta = Number(prompt("\nSELECIONE UMA OPÇÃO \n1- Consultar; \n2- Efetuar Reserva; \n3- Sair."));
        }