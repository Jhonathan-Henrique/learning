# -*- coding: utf-8 -*-
"""Python (Array & laço for).ipynb

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/1koamj9c27oy6xst85uwzNWounAvW8pRH
"""

fruta = "morango"
print(fruta)

#Iniciar o arrays fruta informando o nome das frutas selecionadas..
frutas = ["laranja", "maçã", "Banana"]

#Exibir o conteudo do array frutas.
print(frutas)

#Exiba o nome da segunda fruta armazenada do array frutas
print(frutas[1])

#Quantas frutas temos no array frutas?
qtd_frutas = len(frutas)
print(qtd_frutas)

#função chamada append()
frutas.append("abacate")

#Quantas frutas temos?
print(len(frutas))
print(frutas)

#Quero apagar a quarta fruta (abacate)
frutas.pop(3)

#Quantas frutas temos?
print(len(frutas))
print(frutas)

#Adiciona romã na lista de frutas
frutas.append("romã")
#Remove Banana
frutas.remove("Banana")

frutas.insert(1,"morango")

#Quantas frutas temos?
print(len(frutas))
print(frutas)

# Exibir cada uma das frutas da seguinte forma:
# primeira fruta: {nome da primeira fruta}


for fruta in frutas:
  print(f"{fruta}")

# Exibir cada uma das frutas da seguinte forma:
# primeira fruta: {nome da primeira fruta}
numerador = 1

for fruta in frutas:
  print(f"{numerador}a. fruta: {fruta}")
  numerador = numerador + 1

frutas_ordenadas = frutas.copy()
frutas_ordenadas.sort()

print(frutas_ordenadas)