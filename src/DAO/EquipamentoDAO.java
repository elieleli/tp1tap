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
        java.sql.Date dataSql = new java.sql.Date(eq.getData().getTime());
        String sql = "INSERT INTO equipamentos (tombamento, tipo, descricao, data, responsavel, local) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, Integer.toString(eq.getTombamento()));
        ps.setString(2, eq.getTipo());
        ps.setString(3, eq.getDescricao());
        ps.setDate(4, dataSql);
        ps.setString(5, eq.getResponsavel());
        ps.setString(6, eq.getLocal());
        ps.executeUpdate();
        return true;
    } catch (SQLException e) { 
        e.printStackTrace();
        return false; 
    }
}

public boolean editarEquipamento(Equipamento eq){
  try{
    java.sql.Date dataSql = new java.sql.Date (eq.getData().getTime());
    String comando = "UPDATE equipamentos SET tipo = ?, descricao = ?, data = ?, responsavel = ?, local = ? WHERE tombamento = ?";
    PreparedStatement ps = conexao.prepareStatement(comando);

    ps.setString(1, eq.getTipo());
    ps.setString(2, eq.getDescricao());
    ps.setDate(3, dataSql);
    ps.setString(4, eq.getResponsavel());
    ps.setString(5, eq.getLocal());
    ps.setString(6, Integer.toString(eq.getTombamento()));
    ps.executeUpdate();
    return true;

  } catch (Exception e){
    e.printStackTrace();
    return false;
  }
}

public boolean deletarEquipamento(Equipamento eq){
  try{
    String comando = "DELETE FROM equipamentos WHERE tombamento = ?";
    PreparedStatement ps = conexao.prepareStatement(comando);
    ps.setString(1, Integer.toString(eq.getTombamento()));
    ps.executeUpdate();
    return true;
  } catch (SQLException e) {
    e.printStackTrace();
    return false;
  }
}


}
