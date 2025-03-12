package ArCondicionado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControleArCondicionado {
    private List<ArCondicionado> arCondicionados;
    private Scanner scanner;

    public ControleArCondicionado() {
        arCondicionados = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void cadastrarArCondicionado() {
        System.out.println("Digite o tipo de ar condicionado (1 para Splinter, 2 para Portátil): ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o código: ");
        String codigo = scanner.nextLine();

        System.out.print("Digite a marca: ");
        String marca = scanner.nextLine();

        System.out.print("Digite o modelo: ");
        String modelo = scanner.nextLine();

        System.out.print("Digite a potência (BTU): ");
        int btu = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Existe defeito? (Digite a descrição do defeito ou 'não' se não houver): ");
        String defeito = scanner.nextLine();

        if (tipo == 1) {
            System.out.print("Digite o tamanho do aparelho (ex: 9000, 12000): ");
            String tamanho = scanner.nextLine();
            arCondicionados.add(new Splinter(modelo, codigo, marca, btu, defeito, tamanho));
        } else if (tipo == 2) {
            System.out.print("Digite a voltagem: ");
            int voltagem = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Digite a cor do aparelho: ");
            String cor = scanner.nextLine();
            arCondicionados.add(new Portatil(modelo, codigo, marca, btu, defeito, voltagem, cor));
        }
    }

    public void gerarRelatorio() {
        if (arCondicionados.isEmpty()) {
            System.out.println("Nenhum ar condicionado cadastrado.");
        } else {
            System.out.println("Relatório de Ar Condicionados:");
            for (ArCondicionado ac : arCondicionados) {
                System.out.println(ac);
            }
        }
    }
}

