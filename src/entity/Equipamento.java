package entity;

public class Equipamento {
	private int tombamento;
	private String tipo;
	private String descricao;
	private String data;
	private String responsavel;
	private String local;
	
		
	public Equipamento() {
		tombamento = 0;
		tipo = descricao = data = responsavel = local = null;
	}
	public Equipamento(int tombamento, String tipo, String descricao, String data, String responsavel, String local) {
		this.tombamento = tombamento;
		this.tipo = tipo;
		this.descricao = descricao;
		this.data = data;
		this.responsavel = responsavel;
		this.local = local;
	}
	public int getTombamento() {
		return tombamento;
	}
	public void setTombamento(int tombamento) {
		this.tombamento = tombamento;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	
	
}
