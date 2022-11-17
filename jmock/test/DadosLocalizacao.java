package jmock.jmock2;

public class DadosLocalizaçao {
	private String uf;
	private String cidade;
	private String logradouro;
	private String complemento;
	private String bairro;
	
	
	public void DadosLocalizacao(final String uf, final String cidade, final String logradouro, final String complemento, final String bairro) {
		this.uf = uf;
		
		this.cidade = cidade;
		
		this.logradouro = logradouro;
		
		this.complemento = complemento;
		
		this.bairro = bairro;
	}
	
	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

}