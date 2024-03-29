package conexao;

import java.sql.*;

public class BancoDeDados {
  private static String url = "jdbc:mysql://localhost:3306/EquipamentosBD";
  private static String user = "equipamentos_admin";
  private static String pass = "1234";
  protected static Connection conexao = null;

  public BancoDeDados() {
    if (conexao == null) conecta();
  }

  private static boolean conecta() {
    try {
      conexao = DriverManager.getConnection(url, user, pass);
      return true;
    } catch (SQLException e) { return false; }
  }

  public static boolean desconecta() {
    try {
      conexao.close();
      return true;
    } catch (SQLException e) { return false; }
  }
}
