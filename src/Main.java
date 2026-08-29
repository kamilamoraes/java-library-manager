import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] livros = {"Dom Casmurro", "O Hobbit", "1984", "Harry Potter"};

        for (int i = 0; i < livros.length; i++) {
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