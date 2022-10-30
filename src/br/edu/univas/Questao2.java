package br.edu.univas;

import java.util.Scanner;

public class Questao2 {

    public static void main (String[] args) {

        Scanner leitura = new Scanner(System.in);

        int pontuacao = 0;
        int saldoGols = 0;
        int brasil;
        int outroTime;

        for (int i = 0; i < 3; i++) {

            if (i == 0) {
                System.out.println("Digite o resultado do jogo Brasil x Sérvia:");
                brasil = leitura.nextInt();
                outroTime = leitura.nextInt();
            } else if (i == 1) {
                System.out.println("Digite o resultado do jogo Brasil x Suíça:");
                brasil = leitura.nextInt();
                outroTime = leitura.nextInt();
            } else {
                System.out.println("Digite o resultado do jogo Camarões x Brasil:");
                outroTime = leitura.nextInt();
                brasil = leitura.nextInt();
            }

            if (brasil > outroTime) {
                saldoGols += brasil - outroTime;
                pontuacao += 3;
            } else if (brasil == outroTime) {
                pontuacao += 1;
            } else {
                saldoGols -= (outroTime - brasil);
            }
        }

        System.out.println("Pontuação: " + pontuacao);
        System.out.println("Saldo de gols: " + saldoGols);
    }
}
