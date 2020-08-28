package com.spring.instagram.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "Instagrams")
public class Instagram {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	//@Column(columnDefinition = "bytea")
	//private byte[] file;
	
	//@Transient
	private String pathFile;
	
	private String curtida;
	private String comentario;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	/*public byte[] getFile() {
		return file;
	}
	public void setFile(byte[] file) {
		this.file = file;
	}*/
	
	public String getPathFile() {
		return pathFile;
	}
	public void setPathFile(String pathFile) {
		this.pathFile = pathFile;
	}
	
	public String getCurtida() {
		return curtida;
	}
	public void setCurtida(String curtida) {
		this.curtida = curtida;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
}
