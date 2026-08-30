import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] livros = new String[10];

        livros[0] = "Dom Casmurro";
        livros[1] = "O Hobbit";
        livros[2] = "1984";
        livros[3] = "Harry Potter";

        int quantidadeLivros = 4;

        System.out.println("Digite o nome do livro:");

        String novoLivro = scanner.nextLine();

        livros[quantidadeLivros] = novoLivro;

        quantidadeLivros++;

        for (int i = 0; i < quantidadeLivros; i++) {
            System.out.println((i + 1) + " - " + livros[i]);
        }

        System.out.println("Digite o número do livro:");

        int escolha = scanner.nextInt();

        if (escolha >= 1 && escolha <= livros.length) {
                System.out.println(livros[escolha - 1]);
            } else {
                System.out.println("Opção inválida.");
            }


        int opcao;
    
        do {
            System.out.println("===== LIBRARY MANAGER =====");
            System.out.println("1 - Verificar Livro");
            System.out.println("2 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Você escolheu verificar um livro.");
            } else if (opcao == 2) {
                System.out.println("Saindo do Library Manager...");
            } else {
                System.out.println("Opção inválida!");
            }

        } while (opcao != 2);

    }
}