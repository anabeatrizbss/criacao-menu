package util;

public class ValidacoesLivro {

    public static boolean tituloValido(String titulo) {
        return !(titulo == null || 
                 titulo.trim().isEmpty() || 
                 titulo.length() < 3);
    }

    public static String mensagemErroTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            return "Erro: O título não pode estar vazio";
        } else if (titulo.length() < 3) {
            return "Erro: O título deve ter pelo menos 3 caracteres";
        }
        return "";
    }

    public static boolean autorValido(String autor) {
        return !(autor == null || 
                 autor.trim().isEmpty() || 
                 autor.matches(".*\\d.*")); // não pode ter números
    }

    public static String mensagemErroAutor(String autor) {
        if (autor == null || autor.trim().isEmpty()) {
            return "Erro: O autor não pode estar vazio";
        } else if (autor.matches(".*\\d.*")) {
            return "Erro: O autor não pode conter números";
        }
        return "";
    }

    public static boolean paginasValidas(String paginas) {
        return !(paginas == null || 
                 paginas.trim().isEmpty() || 
                 !paginas.matches("\\d+")); // só números
    }

    public static String mensagemErroPaginas(String paginas) {
        if (paginas == null || paginas.trim().isEmpty()) {
            return "Erro: O número de páginas não pode estar vazio";
        } else if (!paginas.matches("\\d+")) {
            return "Erro: O número de páginas deve conter apenas dígitos";
        }
        return "";
    }
}
