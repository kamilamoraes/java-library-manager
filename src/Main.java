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
            System.out.println((i + 1) + " - " + livros[i]);
    }
        
        break;

    case 2:

        if (quantidadeLivros < livros.length) {

        System.out.println("Digite o nome do livro:");

        scanner.nextLine();

        String novoLivro = scanner.nextLine();

        livros[quantidadeLivros] = novoLivro;

        quantidadeLivros++;

        } else {
        System.out.println("A biblioteca está cheia.");
    }
        
        break;

    case 3:

        System.out.println("Digite o nome do livro:");

        scanner.nextLine();

        String busca = scanner.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < quantidadeLivros; i++) {
            
            if (livros[i].equals(busca)) {
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
