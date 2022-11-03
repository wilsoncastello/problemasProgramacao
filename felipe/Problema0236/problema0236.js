a = 0;
numerador = -1
denominador = 0;

for (i = 1; i <= 25; i++){
    numerador = numerador + 2;
    denominador = i;
}

a = a + (numerador/denominador);

console.log("A = 49/25 = " + a);