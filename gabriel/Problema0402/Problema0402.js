function somarElementos(a, b, c){
    var soma = 0;
    
    for(var i = b; i<c+1; i++){
      if(i % a == 0){
        soma = soma + i;
      }
    }
    return soma;
  }

    

    var a, b, c;

    a = parseInt(prompt("Digite o valor de 'a', sendo um valor maior que 1: "));

    while(a <= 1){
        console.log("Digite um valor valido")
        a = parseInt(prompt("Digite o valor de 'a', sendo um valor maior que 1: "));
    }

    b = parseInt(prompt("Digite o valor de 'b': "));

    c = parseInt(prompt("Digite o valor de 'c': "));

    var soma = somarElementos(a, b, c);

    console.log("Soma dos valores entre b e c, que são divisíveis por a: " + soma);
