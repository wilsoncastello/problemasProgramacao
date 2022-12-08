
    var n0 = (parseInt(prompt("Digite o primeiro valor de um intervalo fechado: ")));
    var nx = (parseInt(prompt("Digite o último valor de um intervalo fechado: ")));
    
    if(n0 < nx){
        for(var i = n0; i<nx + 1; i++){
            console.log(i);
        }
    }

    else{
        for(var i=nx; i<n0+1; i++){
            console.log(i);
        }
    }
 