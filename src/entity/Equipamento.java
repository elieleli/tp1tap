package entity;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Equipamento {
	private int tombamento;
	private String tipo;
	private String descricao;
	private Date data;
	private String responsavel;
	private String local;
	
		
	public Equipamento() {
		tombamento = 0;
		tipo = descricao = responsavel = local = null;
		data = null;
	}
	public Equipamento(int tombamento, String tipo, String descricao, String data, String responsavel, String local) {
		try{
			this.tombamento = tombamento;
			this.tipo = tipo;
			this.descricao = descricao;
			SimpleDateFormat formatoData =  new SimpleDateFormat("dd-MM-yyyy");
			this.data = formatoData.parse(data);
			this.responsavel = responsavel;
			this.local = local;
		} catch (Exception e){
			e.printStackTrace();
		}

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
	public Date getData() {
		return data;
	}
	public void setData(String data) {
		try{
			SimpleDateFormat formatoData =  new SimpleDateFormat("dd-MM-yyyy");
			this.data = formatoData.parse(data);
		} catch (Exception e){
			e.printStackTrace();
		}
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
