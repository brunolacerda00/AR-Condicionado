package ArCondicionado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ControleArCondicionado controle = new ControleArCondicionado();
        Scanner scanner = new Scanner(System.in);
        boolean executando = true;

        while (executando) {
            System.out.println("\n1. Cadastrar Ar Condicionado");
            System.out.println("2. Gerar Relatório");
            System.out.println("3. Fechar programa");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    controle.cadastrarArCondicionado();
                    break;
                case 2:
                    controle.gerarRelatorio();
                    break;
                case 3:
                    System.out.println("Fechando o programa...");
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
