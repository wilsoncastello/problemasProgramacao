const prompt = require("prompt-sync")({ sigint: true })

const num = []

for(i = 1; i <= 9; i++){
    num[i] = prompt("Digite "+(i)+" :");
}

for(i = 1; i <= 9; i++){
    cont = 0;
    for (j = 1; j <= num[i]; j++) {
        if(num[i] % j == 0){
            cont = cont + 1;
        }
                
    }
    if(cont == 2){
        console.log(num[i]," posição ",(i)," é primo.");
    }
    
}