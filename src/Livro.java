public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int id;

    public Livro(String titulo, String autor, int anoPublicacao, int id) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.id = id;


    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public int getId() {
        return id;
    }

}
