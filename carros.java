/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

class Carro {
    String modelo;
    String cor;
    int ano;
    int velocidade;
    double combustivel;
    int aceleracao;
    boolean ligado = false; // novo atributo

    void mostrarDetalhes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade: " + velocidade + " km/h");
        System.out.println("Combustível: " + combustivel + " L");
        System.out.println("Aceleração: " + aceleracao + " km/h em 10s");
        System.out.println("Status: " + (ligado ? "Ligado" : "Desligado"));
    }

    void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println(modelo + " está ligado agora.");
        } else {
            System.out.println(modelo + " está ligado.");
        }
    }

    void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println(modelo + " foi desligado.");
        } else {
            System.out.println(modelo + "  está desligado.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Carro[] carros = {
            criarCarro("Landau", "Azul metálico", 1983, 100, 5.0, 100),
            criarCarro("Opala", "Verde", 1968, 100, 5.0, 100),
            criarCarro("Corvette", "Laranja fogo", 2025, 250, 6.0, 200),
            criarCarro("Monza", "Vermelho", 1968, 130, 5.0, 120),
            criarCarro("GOL GTI", "Preto", 1988, 130, 5.0, 130)
        };

        System.out.println("Escolha um carro:");
        for (int i = 0; i < carros.length; i++) {
            System.out.println((i + 1) + " - " + carros[i].modelo);
        }

        System.out.print("Digite o número do carro: ");
        int escolha = scanner.nextInt();

        if (escolha >= 1 && escolha <= carros.length) {
            Carro selecionado = carros[escolha - 1];

            System.out.println("\n--- Detalhes do carro ---");
            selecionado.mostrarDetalhes();

            System.out.print("\nDeseja ligar o carro? (s/n): ");
            String resposta = scanner.next();

            if (resposta.equalsIgnoreCase("s")) {
                selecionado.ligar();
            } else {
                selecionado.desligar();
            }

        } else {
            System.out.println("Escolha inválida.");
        }

        scanner.close();
    }

    static Carro criarCarro(String modelo, String cor, int ano, int velocidade, double combustivel, int aceleracao) {
        Carro c = new Carro();
        c.modelo = modelo;
        c.cor = cor;
        c.ano = ano;
        c.velocidade = velocidade;
        c.combustivel = combustivel;
        c.aceleracao = aceleracao;
        return c;
    }
}
