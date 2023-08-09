package com.company;

public class Carro {

    //Atributos
    public String nome;
    public String cor;
    public float peso;
    public int velocidade;


    // Metodos
    private void movimentar(int velocidade ) { //parametro dentro do metodo
        System.out.println("O carro esta se movimentando com a velocidade: " + velocidade + " KM/H");
    }

    public void frear(int tempo) {
        this.movimentar(85);
        System.out.println("O carro freou em " + tempo + " segundos");
    }
}