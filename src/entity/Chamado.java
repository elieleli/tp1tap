package entity;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.security.SecureRandom;

public class Chamado {
    private int id;
    private Equipamento equipamento;
    private String defeito;
    private Date dataChamado;
    private String nomeSolicitante;
    private String emailSolicitante;
    private int status;
    private String solucao;
    private int chaveChamado;

    

    public Chamado() {
        id = status = 0;
        defeito = nomeSolicitante = emailSolicitante = solucao = null;
        equipamento = null;
        dataChamado = null;
        SecureRandom random = new SecureRandom();
        chaveChamado = random.nextInt();
    }
    public Chamado(int id, Equipamento equipamento, String defeito, String dataChamado, String nomeSolicitante,
            String emailSolicitante, int status, String solucao) {
        try {
            this.id = id;
            this.equipamento = equipamento;
            this.defeito = defeito;
            SimpleDateFormat formatoData = new SimpleDateFormat("dd-MM-yyyy");
            this.dataChamado = formatoData.parse(dataChamado);
            this.nomeSolicitante = nomeSolicitante;
            this.emailSolicitante = emailSolicitante;
            this.status = status;
            this.solucao = solucao;
            SecureRandom random = new SecureRandom();
            chaveChamado = random.hashCode();
        } catch (Exception e){
            e.printStackTrace();

        }
    }

    public int getChave(){
        return chaveChamado;
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
    public Date getDataChamado() {
        return dataChamado;
    }
    public void setDataChamado(String dataChamado) {
        try{
            SimpleDateFormat formatoData = new SimpleDateFormat("dd-MM-yyyy");
            this.dataChamado = formatoData.parse(dataChamado);
        } catch (Exception e){
            e.printStackTrace();
        }
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
