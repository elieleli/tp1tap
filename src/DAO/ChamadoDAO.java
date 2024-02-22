package DAO;

import conexao.BancoDeDados;
import entity.Chamado;
import java.sql.*;
import java.text.SimpleDateFormat;

public class ChamadoDAO extends BancoDeDados {
    public Boolean adicionarChamado(Chamado c){
        try{
            java.sql.Date dataSql = new java.sql.Date(c.getDataChamado().getTime());
            String comando = "INSERT INTO chamados (tombamentoEqp, defeito, dataChamado, nomeSolicitante, emailSolicitante, status, solucao, chaveChamado) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conexao.prepareStatement(comando);
            ps.setString(1, Integer.toString(c.getEquipamento().getTombamento()));
            ps.setString(2, c.getDefeito());
            ps.setDate(3, dataSql);
            ps.setString(4, c.getNomeSolicitante());
            ps.setString(5, c.getEmailSolicitante());
            ps.setString(6, Integer.toString(c.getStatus()));
            ps.setString(7, c.getSolucao());
            ps.setString(8, Integer.toString(c.getChave()));
            ps.executeUpdate();
            return true;
        } catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    public Boolean editarChamado(Chamado c){
        try{
            java.sql.Date dataSql = new java.sql.Date(c.getDataChamado().getTime());
            String comando = "UPDATE chamados SET defeito = ?, dataChamado = ?, status = ?, solucao = ? WHERE tombamento = ? AND chaveChamado = ?";
            PreparedStatement ps = conexao.prepareStatement(comando);
            ps.setString(1, c.getDefeito());
            ps.setDate(2, dataSql);
            ps.setString(3, Integer.toString(c.getStatus()));
            ps.setString(4, c.getSolucao());
            ps.setString(5, Integer.toString(c.getEquipamento().getTombamento()));
            ps.setString(6, Integer.toString(c.getChave()));
            ps.executeUpdate();
            return true;
        } catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    
    
    public void listarChamados(){
        try{
            String comando = "SELECT * FROM chamados";
            PreparedStatement ps = conexao.prepareStatement(comando);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String id = rs.getString("chaveChamado");
                String tombamento = rs.getString(2);
                Date dataChamado1 = rs.getDate("dataChamado");
                SimpleDateFormat novoFormato = new SimpleDateFormat("dd/MM/yyyy");
                String dataChamado = novoFormato.format(dataChamado1);
                String nome = rs.getString("nomeSolicitante");
                System.out.println("Id: "+id);
                System.out.println("Tombamento: " + tombamento);
                System.out.println("Data: " + dataChamado);
                System.out.println("Nome: " + nome);
                System.out.println("-------------------------");
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public Boolean deletarChamado(Chamado c){
        try{
            String comando = "DELETE FROM chamados WHERE tombamentoEqp = ? AND chaveChamado = ?";
            PreparedStatement ps = conexao.prepareStatement(comando);
            ps.setString(1, Integer.toString(c.getEquipamento().getTombamento()));
            ps.setString(2, Integer.toString(c.getChave()));
            ps.executeUpdate();
            return true;
        } catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }


}
