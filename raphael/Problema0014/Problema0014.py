# -*- coding: utf-8 -*-
# 
# #Faça um programa que receba o número de horas trabalhadas e o valor do salário mínimo, calcule e mostre o salário a receber, seguindo estas regras:
    #a) a hora trabalhada vale a metade do salário mínimo. 
    #b) o salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da hora trabalhada. 
    #c) o imposto equivale a 3% do salário bruto. 
    #d) o salário a receber equivale ao salário bruto menos o imposto.

horasTrabalhadas = float(input("Digite o numero de horas trabalhadas: "))

salarioMinimo = float(input("Digite o valor do salário minimo: "))

horaTrabalhada = salarioMinimo / 2
bruto = horasTrabalhadas * horaTrabalhada
imposto = (bruto * 3) / 100
receber = bruto - imposto

print("")
print("Saldo atual: {}".format(receber))