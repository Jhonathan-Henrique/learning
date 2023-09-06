package com.company;

public class Main {
    public static void main(String[] args){

        professor jose = new professor();
        jose.nome = "Jose";
        jose.idade = 30;
        jose.materia = "portugues";

        Aluno marcos = new Aluno();
        marcos.matricula = "A5A5S";
        marcos.nome = "Marcos";
        marcos.idade = 19;

        System.out.println("nome: " + marcos.nome);
        System.out.println("idade: " + marcos.idade);
        System.out.println("matricula: " + marcos.matricula);
    }
}