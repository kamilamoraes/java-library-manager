public class TesteLivro {

    public static void main(String[] args) {

        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", 1899, 1);

        System.out.println(livro.getTitulo());
        System.out.println(livro.getAutor());
        System.out.println(livro.getAnoPublicacao());
        System.out.println(livro.getId());

    }
}
