const prompt = require("prompt-sync")({ sigint: true })

var m = [,]
var maiorAltura
for(let i = 0; i < 3; i++){
    maiorAltura = 0
    for(let j = 0; j < 4; j++){
        console.log("Digite a altura do "+j+"º atleta da "+i+"ª delegação")
        m[i,j] = Number(prompt())
        if(m[i,j] > maiorAltura)
            maiorAltura = m[i,j]
    }
    console.log("Maior altura da "+i+"ª delegação: "+maiorAltura)
}
