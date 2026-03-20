package app;

import java.util.Scanner;
import modelos.Livro;
import util.ValidacoesLivro;

public class testesLivro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Exemplo de livro inicial
        Livro livro = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 223);
        int opcao;

        do {
            imprimirMenu();
            opcao = recebeOp(scanner);

            switch (opcao) {
                case 1:
                    System.out.println(livro.toString());
                    break;
                case 2:
                    alterarTitulo(livro, scanner);
                    break;
                case 3:
                    alterarAutor(livro, scanner);
                    break;
                case 4:
                    alterarPaginas(livro, scanner);
                    break;
                case 0:
                    System.out.println("Programa finalizado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void imprimirMenu() {
        System.out.println("\n=== Menu de Acesso ao Livro ===");
        System.out.println("1. Mostrar dados do livro");
        System.out.println("2. Alterar título");
        System.out.println("3. Alterar autor");
        System.out.println("4. Alterar número de páginas");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static int recebeOp(Scanner scanner){
        int opcao;
        try {
            opcao = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Por favor, digite um número válido!");
            opcao = -1;
        }
        return opcao;
    }

    public static void alterarTitulo(Livro livro, Scanner scanner) {
        System.out.print("Digite o novo título: ");
        String novoTitulo = scanner.nextLine();
        if (ValidacoesLivro.tituloValido(novoTitulo)) {
            livro.setTitulo(novoTitulo);
            System.out.println("Título alterado com sucesso!");
        } else {
            System.out.println(ValidacoesLivro.mensagemErroTitulo(novoTitulo));
        }
    }

    public static void alterarAutor(Livro livro, Scanner scanner) {
        System.out.print("Digite o novo autor: ");
        String novoAutor = scanner.nextLine();
        if (ValidacoesLivro.autorValido(novoAutor)) {
            livro.setAutor(novoAutor);
            System.out.println("Autor alterado com sucesso!");
        } else {
            System.out.println(ValidacoesLivro.mensagemErroAutor(novoAutor));
        }
    }

    public static void alterarPaginas(Livro livro, Scanner scanner) {
        System.out.print("Digite o novo número de páginas: ");
        String paginasStr = scanner.nextLine();
        if (ValidacoesLivro.paginasValidas(paginasStr)) {
            int novasPaginas = Integer.parseInt(paginasStr);
            livro.setPaginas(novasPaginas);
            System.out.println("Número de páginas alterado com sucesso!");
        } else {
            System.out.println(ValidacoesLivro.mensagemErroPaginas(paginasStr));
        }
    }
}
