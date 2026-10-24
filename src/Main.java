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

        for (int i = 0; i < quantidadeLivros; i++) {
            System.out.println((i + 1) + " - " + livros[i].getTitulo());
    }
        
        break;

    case 2:

        if (quantidadeLivros < livros.length) {

        scanner.nextLine();

        System.out.println("Digite o nome do livro:");
        String novoLivro = scanner.nextLine();

        System.out.println("Digite o autor:");
        String autor = scanner.nextLine();

        System.out.println("Digite o ano de publicação:");
        int anoPublicacao = scanner.nextInt();

        int id = quantidadeLivros + 1;

        livros[quantidadeLivros] = new Livro(novoLivro, autor, anoPublicacao, id);

        quantidadeLivros++;

        System.out.println("Livro cadastrado com sucesso!");

    } else {
        System.out.println("A biblioteca está cheia.");
    }
        
        break;

    case 3:

       scanner.nextLine();

    System.out.println("Digite o nome do livro:");
    String busca = scanner.nextLine();

    boolean encontrado = false;

    for (int i = 0; i < quantidadeLivros; i++) {

        if (livros[i].getTitulo().equalsIgnoreCase(busca)) {
            System.out.println("Livro encontrado!");
            encontrado = true;
        }
    }

    if (!encontrado) {
        System.out.println("Livro não encontrado.");
    }
       
        break;

    case 0:

        System.out.println("Saindo do Library Manager...");
        
        break;

    default:
        
        }

    } while (opcao != 0);

    }

}
