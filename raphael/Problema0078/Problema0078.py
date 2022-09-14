# Elaborar um programa que leia uma medida em pés e apresente o seu valor convertido em metros, lembrando que um pé mede 0,3048 metro, ou seja, um pé é igual a 30,48 centímetros.

pes = float(input("Digite a medida em pés: "))

metros = pes * 0.3048

print("")
print("{} pés equivalem a {} metros".format(pes, metros))