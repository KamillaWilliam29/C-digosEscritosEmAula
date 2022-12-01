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


	@Id
	@GeneratedValue
	private Long id;
			
	@Column(name = "name")
	private String name;

	private String mimeType;
	
	@Lob
	private byte []pic;

	public ArquivoModel(String name, String mimeType, byte[] pic) {
		this.name = name;
		this.mimeType = mimeType;
		this.pic = pic;
	}

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