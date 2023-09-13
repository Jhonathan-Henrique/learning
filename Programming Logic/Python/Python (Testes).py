# Primeiros exemplo em Python
print("Hello World, bem vindo aos meus testes de estudo em Python")

#Comando input
nome = input("Qual é o seu nome? ")
print(nome)

#Pegar o nome armazenado e dizer olá usando ele
print(f"Olá {nome} seja bem vindo aos meus estudos de python")

#Começa perguntando o nome do produto, quantidade em estoque e seu preço.
nome = input("Qual o nome do produto? ")
qtde = int(input("Qual a quantidade do produto? "))
preco = float(input("Qual o valor do produto? "))

print(f"O produto {nome} tem {qtde} unidades,no valor de R$ {preco} a unidade.")