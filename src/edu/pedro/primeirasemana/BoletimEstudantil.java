package edu.pedro.primeirasemana;

public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 10;
        if (mediaFinal < 6) {
            System.err.println("REPROVADO");
        } else if (mediaFinal == 6) {
            System.out.println("RECUPERAÇÃO");
        } else {
            System.out.println("APROVADO");
        }
    }
}
