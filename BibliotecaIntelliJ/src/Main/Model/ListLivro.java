package Main.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

class ListLivro {
    static Connection connection = null;

    public static void adicionarLivro(Livro livro) {
        PreparedStatement stmt = null;

        try {
            connection = ConexaoBD.ConexaoBD();
            String sql = "INSERT INTO livro(titulo, autor, status) VALUES (?, ?, ?)";
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, livro.getTitulo());
            stmt.setString(2, livro.getAutor());
            stmt.setBoolean(3, livro.getStatus());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Livro> getListaDeLivros() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Livro> listaLivros = new LinkedList<>();

        try {
            connection = ConexaoBD.ConexaoBD();
            String sql = "SELECT * FROM acervo";
            stmt = connection.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                listaLivros.add(new Livro(rs.getInt("indice"), rs.getString("titulo"), rs.getString("autor"), rs.getBoolean("status")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return listaLivros;
    }

    public static void excluirLivro(int indice) {
        PreparedStatement stmt = null;

        try {
            connection = ConexaoBD.ConexaoBD();
            String sql = "DELETE FROM acervo WHERE indice = ?";
            stmt = connection.prepareStatement(sql);
            stmt.setLong(1, indice);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void alterarStatusLivro(Livro livro) {
        PreparedStatement stmt = null;

        try {
            connection = ConexaoBD.ConexaoBD();
            String sql = "UPDATE acervo SET status = ? where id = ?";
            stmt = connection.prepareStatement(sql);
            stmt.setBoolean(3, livro.getStatus());
            stmt.setInt(4, livro.getIndice());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}






