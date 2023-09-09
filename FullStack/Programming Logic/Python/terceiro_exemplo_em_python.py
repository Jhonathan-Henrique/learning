# -*- coding: utf-8 -*-
"""Terceiro exemplo em Python.ipynb

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/1VOLuJKiYelGt8vBuIdHsNvfZ7XAfc7qw
"""

# Começa perguntando o nome do produto, quantidade em estoque e seu preço.
nome = input("Informe o nome do produto: ")
qtde = int(input("Digite a quantidade deste produto no estoque: "))
preco = float(input("Digite o preço deste produto: "))

print(f"Nome do Produto: {nome}")
print(f"Quantidade disponivel: {qtde}")
print(f"Preço por unidade: {preco}")

# Se o estoque de produto estiver abaixo de 50,
# Exiba a frase "Estoque de produto está muito baixo! Providencie mais!"

if (qtde < 50):
  print(f"Estoque do {nome} está muito baixo! Temos apenas {qtde} Unidades, Providencie mais!")

# Calcule o valor do produto com o imposto que é seu valor Bruto mais 10% (imposto)
preco_com_imposto = preco * 1.1
print(f"Preço total (com imposto): {preco_com_imposto}")