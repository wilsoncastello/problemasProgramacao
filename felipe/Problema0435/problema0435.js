const prompt = require("prompt-sync")({ sigint: true })

function vetor (v){
    var temp;

    for(let i = 0; i < v.length; i++ ){
        for(let j = i+1; j < v.length; j++){
            if(v[i]>v[j]){
            temp = v[i];
            v[i] = v[j];
            v[j] = temp;
            }
        }
    }
    return v[0];
}

function lerDados() {

    var n = 0;
    var v = new int[20];

    console.log("Digite -1 para sair");

    for (let i = 0; i < v.length; i++) {
        System.out.println(i + 1 + "° valor: ");
        v[i] = Integer.parseInt(input.nextLine());
        
        if (v[i] > 0) {
            n++;
        } else {
            System.out.println("sair selecionado! ");
            break;
        }
    }
    
    var x = new int[n];
    for (let i = 0; i < x.length; i++) {
        x[i] = v[i];
    }
    return x;
}

function mostrarDados(x) {
    for (let i = 0; i < x.length; i++) {
        System.out.println(x[i] + " ");
    }
    return x;
}

    console.log(vetor(lerDados()));