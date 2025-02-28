import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDbConnection {
    public static void main(String[] args) {
        // Dados de conexão
        String url = "jdbc:postgresql://localhost:5432/meubanco";
        String user = "root";
        String password = "root";

        // Consulta SQL
        String sql = "SELECT * FROM minha_tabela";
        // String insertData = "INSERT INTO minha_tabela (nome,idade) VALUES ('testonis',24)";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            System.out.println("Conexão bem-sucedida!");

            // Processar o resultado
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                int idade = resultSet.getInt("idade");

                System.out.println("ID: " + id + ", Nome: " + nome + ", Idade: " + idade);
            }

        } catch (SQLException e) {
            System.err.println("Erro ao conectar ou executar a consulta: " + e.getMessage());
        }
    }
}