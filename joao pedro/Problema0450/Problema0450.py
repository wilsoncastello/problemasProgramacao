def funcao(x1,x2,simbolo):
    if simbolo.endswith("+"):
        return x1+x2
    else:
        if simbolo.endswith("-"):
            return x1-x2
        else:
            if simbolo.endswith("*"):
                return x1*x2
            else:
                if simbolo.endswith("/"):
                    return x1/x2
                else:
                    return 0






def main():
    simbolo=""
    while(simbolo!="#"):
        print("Digite dois numeros: ")
        x1=float(input(""))
        x2=float(input(""))
        print("Digite '+' para somar, '-' para subtrair, '*' para multiplicar, '/' para dividir ou '#' para finalizar o processo: ")
        simbolo=input("")
        funcao(x1,x2,simbolo)
        if simbolo!="#":
            print("Resultado: ",funcao(x1,x2,simbolo))
        else:
            print("--Finalizando programa--")

main()