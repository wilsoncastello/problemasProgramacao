const prompt = require("prompt-sync")({ sigint: true });
var vDiaria = [
    [], [], [], [], [],
  ];
  var totalVendasDia = [0, 0, 0, 0, 0, 0];
  var somaVendedor = 0, somaTotal = 0;
  for (var i = 0; i < 5; i++) {
    somaVendedor = 0;
    console.log("\nDados do vendedor " + (i + 1) + ": ");
    for (var j = 0; j < 6; j++) {
      vDiaria[i][j] = Number(prompt("Venda do " + (j + 1) + "° dia: "));
      somaVendedor = somaVendedor + vDiaria[i][j];
      somaTotal = somaTotal + vDiaria[i][j];
    }
    console.log("\nTotal de vendas da semana do vendedor " + (i + 1) + " é: " + somaVendedor);
  }
  for (var i = 0; i < 5; i++) {
    for (var j = 0; j < 6; j++) {
      totalVendasDia[j] = totalVendasDia[j] + vDiaria[i][j];
    }
  }
  
  console.log("\nVendas dos dias de todos os vendedores somados");
  for (var i = 0; i < 6; i++) {
    console.log("Vendas do " + (i + 1) + "° dia: " + totalVendasDia[i]);
  }
  
  console.log("\nSoma total das vendas: " + somaTotal);