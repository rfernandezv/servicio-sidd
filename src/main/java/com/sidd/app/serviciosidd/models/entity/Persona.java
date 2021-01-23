package com.sidd.app.serviciosidd.models.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "persona")
public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nro_documento")
	private String nroDocumento;
	
	@Column(name = "nombres")
	private String nombres;
	
	@Column(name = "apellidos")
	private String apellidos;
	
	@Column(name = "marca")
	private String marca;
	
	@Column(name = "modelo")
	private String modelo;
	
	@Column(name = "calibre")
	private String calibre;
	
	@Column(name = "activo")
	private Integer activo;
        
        @Column(name = "habilitado_examen")
	private String habilitadoExamen;
	
	@Column(name = "aud_fecha")
	@Temporal(TemporalType.DATE)
	private Date audFecha;
	
	@Column(name = "aud_num_ip")
	private String audNumIp;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNroDocumento() {
		return nroDocumento;
	}

	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
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

	public String getCalibre() {
		return calibre;
	}

	public void setCalibre(String calibre) {
		this.calibre = calibre;
	}

	public Integer getActivo() {
		return activo;
	}

	public void setActivo(Integer activo) {
		this.activo = activo;
	}

	public Date getAudFecha() {
		return audFecha;
	}

	public void setAudFecha(Date audFecha) {
		this.audFecha = audFecha;
	}

	public String getAudNumIp() {
		return audNumIp;
	}

	public void setAudNumIp(String audNumIp) {
		this.audNumIp = audNumIp;
	}

        public String getHabilitadoExamen() {
            return habilitadoExamen;
        }

        public void setHabilitadoExamen(String habilitadoExamen) {
            this.habilitadoExamen = habilitadoExamen;
        }

	
}
