package academy.guih.poo.javacore.classes.Jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PessoaRepository {

    public void salvar(Pessoa pessoa) {
        String sql = "INSERT INTO dados (nome,profissao, sexo, altura, peso, nascimento, nacionalidade) VALUES (?, ?, ?, ?, ?, ?,?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Troca os '?' pelos valores do objeto pessoa
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getProfissao());
            stmt.setString(3, pessoa.getSexo());
            stmt.setDouble(4, pessoa.getAltura());
            stmt.setDouble(5, pessoa.getPeso());
            stmt.setString(6, pessoa.getNascimento());
            stmt.setString(7, pessoa.getNacionalidade());

            //Executa o comando no banco
            stmt.executeUpdate();
            System.out.println("Registro salvo com sucesso: " + pessoa.getNome());

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
