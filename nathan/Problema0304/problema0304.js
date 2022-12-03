const prompt = require("prompt-sync")({ sigint: true });
var vCodigo = [50];
var vNome = [50];
var vQuant = [50];
var vPreco = [50];
var auxNome;
var i = 0, auxQuant, auxCodigo, auxPreco, nProdutos = 0;
var somaVendas = 0;
var produtoVendido = false;

vCodigo[i] = Number(prompt("Digite o código do produto(-1 Para cancelar): "));

while (vCodigo[i] != -1) {
  nProdutos++;
  vNome[i] = prompt("Digite o nome do produto: ");
  vQuant[i] = Number(prompt("Digite a quantidade em estoque: "));
  vPreco[i] = Number(prompt("Digite o preço de venda: "));
  i++;

  vCodigo[i] = Number(prompt("Digite o código do produto(-1 Para cancelar): "));
}

var codigo = Number(prompt("Digite o código do produto para realizar a venda(0 para cancelar): "));

while (codigo != 0) {
  var quant = Number(prompt("Digite a quantidade requerida: "));
  for (j = 0; j < 50; j++) {
    if (codigo == vCodigo[j]) {
      produtoVendido = true;
      if (quant <= vQuant[j]) {
        vQuant[j] = vQuant[j] - quant;
        somaVendas = somaVendas + (vPreco[j] * quant);
        console.log("Venda do " + vNome[j] + " com sucesso.");
      } else {
        console.log("Estoque insuficiente.");
      }
      break;
    }
  }
  if (produtoVendido = false)
    console.log("Produto nao cadastrado");

  codigo = prompt("Digite o código do produto para realizar a venda(0 para cancelar): ");
}
console.log("Total vendido: " + somaVendas);
for (j = 0; j < nProdutos; j++) {
  for (k = 0; k < nProdutos; k++) {
    if (vQuant[j] > vQuant[k]) {
      auxCodigo = vCodigo[j];
      vCodigo[j] = vCodigo[k];
      vCodigo[k] = auxCodigo;

      auxNome = vNome[j];
      vNome[j] = vNome[k];
      vNome[k] = auxNome;

      auxQuant = vQuant[j];
      vQuant[j] = vQuant[k];
      vQuant[k] = auxQuant;

      auxPreco = vPreco[j];
      vPreco[j] = vPreco[k];
      vPreco[k] = auxPreco;
    }
  }
}
for (j = 0; j < nProdutos; j++) {
  console.log(vCodigo[j] + " " + vNome[j] + " " + vQuant[j] + " " + vPreco[j]);
}