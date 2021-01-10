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
@Table(name = "tirador")
public class Tirador {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "id_sucamec")
	private String idSucamec;
	
	@Column(name = "nro_documento")
	private String nroDocumento;
	
	@Column(name = "nombres")
	private String nombres;
	
	@Column(name = "apellidos")
	private String apellidos;
		
	@Column(name = "activo")
	private Boolean activo;
	
	@Column(name = "aud_fecha")
	@Temporal(TemporalType.DATE)
	private Date audFecha;
	
	@Column(name = "aud_num_ip")
	private String audNumIp;
}
