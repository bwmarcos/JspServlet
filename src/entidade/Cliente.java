package entidade;

import java.util.Date;

public class Cliente {
	
	private Integer idCliente;
	private String nome;
	private String email;
	private String sexo;
	private Date nascimento;
	
	
	private Endereco endereco;
public Cliente() {
	// TODO Auto-generated constructor stub
}


public Cliente(Integer idCliente, String nome, String email, String sexo, Date nascimento) {
	super();
	this.idCliente = idCliente;
	this.nome = nome;
	this.email = email;
	this.sexo = sexo;
	this.nascimento = nascimento;
}



@Override
public String toString() {
	return "Cliente [idCliente=" + idCliente + ", nome=" + nome + ", email=" + email + ", sexo=" + sexo
			+ ", nascimento=" + nascimento + "]";
}

public Integer getIdCliente() {
	return idCliente;
}

public void setIdCliente(Integer idCliente) {
	this.idCliente = idCliente;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getSexo() {
	return sexo;
}

public void setSexo(String sexo) {
	this.sexo = sexo;
}

public Date getNascimento() {
	return nascimento;
}

public void setNascimento(Date nascimento) {
	this.nascimento = nascimento;
}


public Endereco getEndereco() {
	return endereco;
}


public void setEndereco(Endereco endereco) {
	this.endereco = endereco;
}


	

}
