def funcao(y):
    if y[0].startswith("a")or y[0].startswith("i")or y[0].startswith("u")or y[0].startswith("e")or y[0].startswith("o"):
        y[0]="0"
    else:
        if y[0].startswith("b")or y[0].startswith("c")or y[0].startswith("d")or y[0].startswith("f")or y[0].startswith("g")or y[0].startswith("h")or y[0].startswith("j")or y[0].startswith("k")or y[0].startswith("l")or y[0].startswith("m")or y[0].startswith("n")or y[0].startswith("p")or y[0].startswith("q")or y[0].startswith("r")or y[0].startswith("s")or y[0].startswith("t")or y[0].startswith("u")or y[0].startswith("v")or y[0].startswith("w")or y[0].startswith("x")or y[0].startswith("y")or y[0].startswith("z"):
            y[0]="1"
        else:
            y[0]="-1"
    



def main():
    
    y=[]
    x=input("Digite um caractere: ")
    
    y.insert(0,x)
    funcao(y)
    print("Resultado: ",y[0])

main()

