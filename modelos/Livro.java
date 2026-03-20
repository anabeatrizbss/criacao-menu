package modelos;  // Declaração do pacote

public class Livro {
    
    private String titulo;  
    private String autor;  
    private int paginas;  

    // Construtor que recebe título e autor
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = 100; // valor padrão
    }

    // Construtor padrão
    public Livro() {
        this.titulo = "Livro aleatório";
        this.autor = "Autor Desconhecido";
        this.paginas = 200;
    }

    // Construtor completo
    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    // Método que exibe informações do livro
    public void exibirInfo() {
        System.out.println("Livro: " + titulo + " | Autor: " + autor + " | Páginas: " + paginas);
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Livro [titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + "]";
    }
}
