public class Biblioteca {
    
    private Livro[] livros;
    private int quantidadeLivros;

    public Biblioteca(Livro[] livros, int quantidadeLivros) {
        this.livros = livros;
        this.quantidadeLivros = quantidadeLivros;
    }

    public void listarLivros() {
        for (int i = 0; i < quantidadeLivros; i++) {
            System.out.println((i + 1) + " - " + livros[i].getTitulo());
        }
    }

    public void cadastrarLivro(String titulo, String autor, int anoPublicacao) {
    if (quantidadeLivros < livros.length) {
        int id = quantidadeLivros + 1;

        livros[quantidadeLivros] = new Livro(titulo, autor, anoPublicacao, id);

        quantidadeLivros++;

        System.out.println("Livro cadastrado com sucesso!");
    } else {
        System.out.println("A biblioteca está cheia.");
    }

    }

    public void buscarLivro(String titulo) {
    boolean encontrado = false;

    for (int i = 0; i < quantidadeLivros; i++) {
        if (livros[i].getTitulo().equalsIgnoreCase(titulo)) {
            System.out.println("Livro encontrado!");
            encontrado = true;
        }
    }

    if (!encontrado) {
        System.out.println("Livro não encontrado.");
    }
    
    }

}
