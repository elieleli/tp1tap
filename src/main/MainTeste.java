package main;

import DAO.ChamadoDAO;
import DAO.EquipamentoDAO;
import entity.Chamado;
import entity.Equipamento;

public class MainTeste {
    public static void main(String[] args) {
        ChamadoDAO chamadoDAO = new ChamadoDAO();
        chamadoDAO.listarChamados();
        EquipamentoDAO equipamentoDAO = new EquipamentoDAO();
        equipamentoDAO.listarEquipamentos();

    
    }
}
