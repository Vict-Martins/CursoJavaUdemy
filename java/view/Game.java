package view;

import model.Calcular;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Game {

    static Scanner teclado = new Scanner(System.in);
    static int pontos = 0;
    static Calcular calc;

    public static void main(String[] args) {
        Game.jogar();
    }

    public static void jogar() {
        System.out.println("Informe o nivel de dificuldade desejado [1, 2, 3 ou 4]: ");
        int dificuldade = Game.teclado.nextInt();

        Game.calc = new Calcular(dificuldade);

        System.out.println("Informe o resultado para a seguinte operação: ");
        if (calc.getOperacao() == 0) {
            System.out.println(calc.getValor1() + " + " + calc.getValor2());
            int resposta = Game.teclado.nextInt();

            if (calc.somar(resposta)) {
                Game.pontos += 1;
                System.out.println("Você tem " + Game.pontos + " ponto(s).");
            }
        }
        else if (calc.getOperacao() == 1) {
            System.out.println(calc.getValor1() + " - " + calc.getValor2());
            int resposta = Game.teclado.nextInt();

            if (calc.diminuir(resposta)) {
                Game.pontos += 1;
                System.out.println("Você tem " + Game.pontos + " ponto(s).");
            }
        }

        else if (calc.getOperacao() == 2) {
            System.out.println(calc.getValor1() + " * " + calc.getValor2());
            int resposta = Game.teclado.nextInt();

            if (calc.multiplicar(resposta)) {
                Game.pontos += 1;
                System.out.println("Você tem " + Game.pontos + " ponto(s).");
            }
        }
        else {
            System.out.println("Operação inválida");
        }
        System.out.println("Deseja continuar? [1] - Sim, [0] - não");
        int continuar = Game.teclado.nextInt();

        if (continuar == 1){
            Game.jogar();
        }else {
            System.out.println("Pontuação: " + Game.pontos + " Pontos ");
            System.out.println("Até a próxima!");
            System.exit(0);
        }
    }

}