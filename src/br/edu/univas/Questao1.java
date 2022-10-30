package br.edu.univas;

import java.util.Scanner;

public class Questao1 {

    public static void main (String[] args) {

        Scanner leitura = new Scanner(System.in);

        int nEleitores = 1500;
        int candidatoX = 0;
        int candidatoY = 0;
        int candidatoZ = 0;
        int branco = 0;
        int nulo = 0;

        for (int i = 0; i < nEleitores; i++) {
            System.out.println("Digite o número do candidato, sendo 111 para x, 222 para y, 333 para z, 0 para branco, e qualquer outro número para nulo!");
            double voto = leitura.nextDouble();

            if (voto == 111) {
                candidatoX++;
            } else if (voto == 222) {
                candidatoY++;
            } else if (voto == 333) {
                candidatoZ++;
            } else if (voto == 0) {
                branco++;
            } else {
                nulo++;
            }
        }
        System.out.println("Total de votos:");
        System.out.println("Candidato x: " + candidatoX);
        System.out.println("Candidato y: " + candidatoY);
        System.out.println("Candidato z: " + candidatoZ);
        System.out.println("Branco: " + branco);
        System.out.println("Nulo: " + nulo);
    }
}
