package entidade;

public class Endereco {
	
	private Integer idEndereco;
	private String rua;
	private String bairro;
	private String cidade;
	
	
	public Endereco(Integer idEndereco, String rua, String bairro, String cidade) {
		super();
		this.idEndereco = idEndereco;
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
	}


	@Override
	public String toString() {
		return "Endereco [idEndereco=" + idEndereco + ", rua=" + rua + ", bairro=" + bairro + ", cidade=" + cidade
				+ "]";
	}


	public Integer getIdEndereco() {
		return idEndereco;
	}


	public void setIdEndereco(Integer idEndereco) {
		this.idEndereco = idEndereco;
	}


	public String getRua() {
		return rua;
	}


	public void setRua(String rua) {
		this.rua = rua;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	
	
	

}
