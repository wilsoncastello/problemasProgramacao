const prompt = require("prompt-sync")({ sigint: true })

while (true){
    op = prompt("Menu de opções: \n\t1.Média aritmética \n\t2.Média ponderada \n\t3.Sair. \nDigite a opção desejada: ")

    if(op==1){
        nota1 = prompt("Insira a primeira nota: ")
        nota2 = prompt("Insira a segunda nota: ")
            
        mediaA = (nota1 + nota2)/2
        console.log("Média aritmetica: ",mediaA)
        break;
    }
    
    if(op==2){
        n1 = prompt("Insira a primeira nota: ")
        n2 = prompt("Insira a segunda nota: ")
        n3 = prompt("Insira a terceira nota: ")
        p1 = prompt("Insira o primeiro peso: ")
        p2 = prompt("Insira o segundo peso: ")
        p3 = prompt("Insira o terceiro peso: ")
        mediaP = (n1*p1 + n2*p2 + n3*p3) / (p1 + p2 + p3)
        console.log("Média ponderada: ",mediaP,"\n")
        break;
    }  
    
    if(op==3){
        console.log("Sair\n");
        break;
    }
    
    if(op>3){
    console.log("Digite uma opção valida\n")
    }

}