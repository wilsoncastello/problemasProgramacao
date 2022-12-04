
    function calcularVenda(produtoA, produtoB){
        var precoFinal;
        

        if(produtoA > 0  && produtoB > 0){
          precoFinal = (produtoA * 10 + produtoB * 20) * 0.85;
        }
        else{
          precoFinal = (produtoA * 10 + produtoB * 20) * 0.9;
        }
        return precoFinal;
    }

   
    var a = prompt("Digite a quantidade comprada do produto A: ");

    var b = prompt("Digite a quantidade comprada do produto B: ");

    var precoFinal = calcularVenda(a, b);
    console.log("Preço final da compra: "+precoFinal);
 