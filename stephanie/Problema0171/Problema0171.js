const prompt = require("prompt-sync")({ sigint: true });

contSim = 0;
contNao = 0;
contSimFem = 0;
contNaoMas = 0;
contMas = 0;
for(i=0; i<10; i++){
  var sexo = prompt("Digite o sexo do entrevistado(M/F):");
  var resposta = prompt("Digite a resposta do entrevistado(S/N):");
  if(resposta.equals("N") || resposta.equals("n")){
      contNao++;
      if(sexo.equals("M") || sexo.equals("m")){
          contNaoMas++;
      }
  }else if(resposta.equals("S")  || resposta.equals("s") ){
      contSim++;
      if(sexo.equals("F")  || sexo.equals("f") ){
          contSimFem++;
      }
  }if(sexo.equals("M") || sexo.equals("m") ){
      contMas++;
  }
}

porcentagem = (contNaoMas*contMas);
console.log("O número de pessoas que responderam sim: "+contSim);
console.log("O número de pessoas que responderam não: "+contNao);
console.log("O número de mulherem que responderam sim: "+contSimFem);
console.log("A porcentagem de homens que responderam não, entre todos os homens analisados: "+porcentagem+"%");