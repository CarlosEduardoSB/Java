package entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Computador {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE) 
	private Integer id;
	@Column(name = "marca_computador" , nullable = false)
	private String marca;
	private String modelo;
	@Column(name = "qtd_memoria", length = 30)
	private String qtdMemoria;
	@Transient
	private String corTampa;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getQtdMemoria() {
		return qtdMemoria;
	}
	public void setQtdMemoria(String qtdMemoria) {
		this.qtdMemoria = qtdMemoria;
	}
	
	
	
	
	

}
