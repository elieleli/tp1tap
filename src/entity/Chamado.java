package entity;

public class Chamado {
    private int id;
    private Equipamento equipamento;
    private String defeito;
    private String dataChamado;
    private String nomeSolicitante;
    private String emailSolicitante;
    private int status;
    private String solucao;

    

    public Chamado() {
        id = status = 0;
        defeito = dataChamado = nomeSolicitante = emailSolicitante = solucao = null;
        equipamento = null;
    }
    public Chamado(int id, Equipamento equipamento, String defeito, String dataChamado, String nomeSolicitante,
            String emailSolicitante, int status, String solucao) {
        this.id = id;
        this.equipamento = equipamento;
        this.defeito = defeito;
        this.dataChamado = dataChamado;
        this.nomeSolicitante = nomeSolicitante;
        this.emailSolicitante = emailSolicitante;
        this.status = status;
        this.solucao = solucao;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Equipamento getEquipamento() {
        return equipamento;
    }
    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }
    public String getDefeito() {
        return defeito;
    }
    public void setDefeito(String defeito) {
        this.defeito = defeito;
    }
    public String getDataChamado() {
        return dataChamado;
    }
    public void setDataChamado(String dataChamado) {
        this.dataChamado = dataChamado;
    }
    public String getNomeSolicitante() {
        return nomeSolicitante;
    }
    public void setNomeSolicitante(String nomeSolicitante) {
        this.nomeSolicitante = nomeSolicitante;
    }
    public String getEmailSolicitante() {
        return emailSolicitante;
    }
    public void setEmailSolicitante(String emailSolicitante) {
        this.emailSolicitante = emailSolicitante;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public String getSolucao() {
        return solucao;
    }
    public void setSolucao(String solucao) {
        this.solucao = solucao;
    }

    
}
