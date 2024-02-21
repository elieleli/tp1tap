package DAO;
import java.sql.*;

import conexao.BancoDeDados;
import entity.Equipamento;

public class EquipamentoDAO extends BancoDeDados{

    public void listarEquipamentos() {
    try {
      Statement st = conexao.createStatement();
      ResultSet rs = st.executeQuery("SELECT * FROM equipamentos");
      while (rs.next()) {
        System.out.println("tombamento " + rs.getString(1) + 
                           " responsavel " + rs.getString(5) + " " +
                           " tipo " + rs.getString(2));
      }
    }
    catch (SQLException e) { }
  }

    public boolean adicionarEquipamento(Equipamento eq) {
    try {
      Statement st = conexao.createStatement();
      st.executeUpdate("INSERT INTO equipamentos VALUES (NULL, '"
                       + eq.getTombamento() + "'," + " '" + eq.getTipo()
                       + "', '" + eq.getDescricao() + "', '"+eq.getData()+"', '"+eq.getResponsavel()
                       + "', '"+eq.getLocal()+")");
      return true;
    } catch (SQLException e) { return false; }
  }


}
