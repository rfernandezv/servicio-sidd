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

public class Examen {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "fecha_examen")
	@Temporal(TemporalType.DATE)
	private Date fechaExamen;
	
	@Column(name = "tiros_realizados")
	private Integer tirosRealizados;
	
	@Column(name = "tiros_acertados")
	private Integer tirosAcertados;
	
	@Column(name = "tipo_evaluacion")
	private Integer tipoEvaluacion;
	
	@Column(name = "estado")
	private Boolean estado;
	
	@Column(name = "path_img")
	private String pathImg;
	
	@Column(name = "observacion")
	private String observacion;
	
	@Column(name = "activo")
	private Boolean activo;
	
	@Column(name = "aud_fecha")
	@Temporal(TemporalType.DATE)
	private Date audFecha;
	
	@Column(name = "aud_num_ip")
	private String audNumIp;
    	
	private Tirador tirador;
	private Usuario usuario;
 
}
