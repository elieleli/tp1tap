package main;

import DAO.EquipamentoDAO;
import entity.Equipamento;

public class MainTeste {
    public static void main(String[] args) {
        EquipamentoDAO equipamentoDAO = new EquipamentoDAO();
        Equipamento eq1 = new Equipamento(19785,  "celular", "preto com maça atrás", 
        "'2023-04-03'", "Arrascaeta", "manaus");

        if(equipamentoDAO.adicionarEquipamento(eq1)){System.err.println("deucerto");};
        equipamentoDAO.listarEquipamentos();
    
    }
}
