import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        Livro[] livros = new Livro[10];

        livros[0] = new Livro("Dom Casmurro", "Machado de Assis", 1899, 1);
        livros[1] = new Livro("O Hobbit", "J. R. R. Tolkien", 1937, 2);
        livros[2] = new Livro("1984", "George Orwell", 1949, 3);
        livros[3] = new Livro("Harry Potter", "J. K. Rowling", 1997, 4);

        int quantidadeLivros = 4;

        Biblioteca biblioteca = new Biblioteca(livros, quantidadeLivros);

        int opcao;
    
        do {
            System.out.println("===== LIBRARY MANAGER =====");
            System.out.println("1 - Listar livros");
            System.out.println("2 - Cadastrar livro");
            System.out.println("3 - Procurar livro");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

           switch (opcao) {
    case 1:

        biblioteca.listarLivros();
        
        break;

    case 2:

        scanner.nextLine();

        System.out.println("Digite o nome do livro:");
        String novoLivro = scanner.nextLine();

        System.out.println("Digite o autor:");
        String autor = scanner.nextLine();

        System.out.println("Digite o ano de publicação:");
        int anoPublicacao = scanner.nextInt();

        biblioteca.cadastrarLivro(novoLivro, autor, anoPublicacao);

        break;

    case 3:

        scanner.nextLine();

        System.out.println("Digite o nome do livro:");
        String busca = scanner.nextLine();

        biblioteca.buscarLivro(busca);   

        break;

    case 0:

        System.out.println("Saindo do Library Manager...");
        
        break;

    default:

        System.out.println("Opção inválida! Tente novamente.");
        
    }

    } while (opcao != 0);

    }

}
