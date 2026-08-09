import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== LIBRARY MANAGER =====");
        System.out.println("1 - Verificar Livro");
        System.out.println("2 - Sair");
        System.out.print("Escolha uma opção: ");

        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.println("Você escolheu verificar um livro.");
        } else if (opcao == 2) {
            System.out.println("Saindo do Library Manager...");
        } else {
            System.out.println("Opção inválida!");
        }


    }
}