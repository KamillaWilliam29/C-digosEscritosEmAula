package br.com.senac.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "file_model")
public class ArquivoModel {

//ArquivoModel trará as informações de dentro do arquivo, como imagem e nome.
	@Id
	@GeneratedValue
	@Column(name="id")
	private Long id;
			
	@Column(name = "name")
	private String name;

	@Column(name="mimetype")
	private String mimeType;
	
	@Lob
	@Column(name="pic")
	private byte []pic;

	//constructor
	public ArquivoModel(String name, String mimeType, byte[] pic) {
		this.name = name;
		this.mimeType = mimeType;
		this.pic = pic;
	}

	//getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public byte[] getPic() {
		return pic;
	}

	public void setPic(byte[] pic) {
		this.pic = pic;
	}

}