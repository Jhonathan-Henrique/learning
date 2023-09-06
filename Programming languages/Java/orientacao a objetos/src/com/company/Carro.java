package com.company;

public class Carro {

    //Atributos - caracteristicas
    public String nome;
    public String cor;
    public float peso;
    public int velocidade;

    // construtor
    public Carro(int velocidade, int tempo) {
        this.movimentar(velocidade);
        this.frear(tempo);
    }


    // Metodos - açoes
    public void movimentar(int velocidade) { //parametro dentro do metodo
        System.out.println("O carro esta se movimentando velocidade: " + velocidade + " km/h");
    }

    public void frear(int tempo) {
        System.out.println("O carro freou" + tempo + "Segundos");
    }

}