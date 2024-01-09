package model;

import java.util.Random;

public class Calcular {

    private int dificuldade;
    private int valor1, valor2;
    private int operacao;
    private int resultado;

    public Calcular(int dificuldade) {
        Random rand = new Random();
        this.operacao = rand.nextInt(3);
        this.dificuldade = dificuldade;
        if (dificuldade == 1) {
            this.valor1 = rand.nextInt(10);
            this.valor1 = rand.nextInt(10);
        } else if (dificuldade == 2) {
            this.valor1 = rand.nextInt(100);
            this.valor2 = rand.nextInt(100);
        } else if (dificuldade == 3) {
            this.valor1 = rand.nextInt(1000);
            this.valor2 = rand.nextInt(1000);
        } else if (dificuldade == 4) {
            this.valor1 = rand.nextInt(10000);
            this.valor2 = rand.nextInt(10000);
        } else {
            this.valor1 = rand.nextInt(100000);
            this.valor2 = rand.nextInt(100000);
        }
    }

    public String toString() {
        String op;
        if (this.getOperacao() == 0) {
            op = "somar";
        } else if (this.getOperacao() == 1) {
            op = "Diminuir";
        } else if (this.getOperacao() == 2) {
            op = "Multiplicar";
        } else {
            op = "Operação desconhecida";
        }
        return "valor 1: " + this.getValor1() +
                "\nValor2: " + this.getValor2() +
                "\nDificuldade: " + this.getDificuldade() +
                "\nOperação" + this.dificuldade +
                "\nOperaçào: " + op;
    }

    public boolean somar(int resposta) {
        this.resultado = this.getValor1() + this.getValor2();
        boolean certo = false;

        if (resposta == this.getResultado()) {
            System.out.println("Resposta correta");
            certo = true;
        } else {
            System.out.println("Resposta errada");
        }
        System.out.println(this.getValor1() + " + " + this.getValor2() + " = " + this.getResultado());
        return certo;
    }

    public boolean diminuir(int resposta) {
        this.resultado = this.getValor1() - this.getValor2();
        boolean certo = false;

        if (resposta == this.getResultado()) {
            System.out.println("Resposta correta");
            certo = true;
        } else {
            System.out.println("Resposta errada");
        }
        System.out.println(this.getValor1() + " - " + this.getValor2() + " = " + this.getResultado());
        return certo;
    }

    public boolean multiplicar(int resposta) {
        this.resultado = this.getValor1() * this.getValor2();
        boolean certo = false;

        if (resposta == this.getResultado()) {
            System.out.println("Resposta correta");
            certo = true;
        } else {
            System.out.println("Resposta errada");
        }
        System.out.println(this.getValor1() + " * " + this.getValor2() + " = " + this.getResultado());
        return certo;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public int getValor1() {
        return valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public int getOperacao() {
        return operacao;
    }

    public int getResultado() {
        return resultado;
    }

}
