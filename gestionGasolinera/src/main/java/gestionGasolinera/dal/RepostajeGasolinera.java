package gestionGasolinera.dal;

import java.util.Calendar;

import javax.persistence.*;

import org.hibernate.type.CalendarType;

/**
 * @author garfe
 * RepostajeGasolinera: Entidad que refiera a la tabla de base de datos dlk_gga_tch_repostajeGasolinera.
 * Registros de la recepción de combustible de la gasolinera.
 */

/*
 * IMPORTANTE: La base de datos y el esquema si hay que crearlo. La tabla se generará sola.
 */

@Entity
@Table(name="dlk_gga_tch_repostajeGasolinera",schema="dlk_gestionGasolinera")
public class RepostajeGasolinera {

	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_rg")
	private int idRepostajeGasolinera;

	@Column(name="importe_rg")
	private double importeRespostajeGasolinera;
	
	@Column (name="dni_usuario_rg")
	private String dniUsuarioRepostajeGasolinera;
	
	@Column (name="matricula_vehiculo_rg")
	private String matriculaVehiculoRepostajeGasolinera;
	
	@Column(name="fch_repostaje_rg")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fchRepostajeGasolinera;
	
	@Column(name="es_factura_rg")
	private boolean esFacturaRepostajeGasolinera;
	
	@Column(name="ficticio", insertable=false)
	private int ficticio;
	
	//GETTERS SETTERS
	public int getIdRepostajeGasolinera() {
		return idRepostajeGasolinera;
	}

	public void setIdRepostajeGasolinera(int idRepostajeGasolinera) {
		this.idRepostajeGasolinera = idRepostajeGasolinera;
	}

	public double getImporteRespostajeGasolinera() {
		return importeRespostajeGasolinera;
	}

	public void setImporteRespostajeGasolinera(double importeRespostajeGasolinera) {
		this.importeRespostajeGasolinera = importeRespostajeGasolinera;
	}

	public String getDniUsuarioRepostajeGasolinera() {
		return dniUsuarioRepostajeGasolinera;
	}

	public void setDniUsuarioRepostajeGasolinera(String dniUsuarioRepostajeGasolinera) {
		this.dniUsuarioRepostajeGasolinera = dniUsuarioRepostajeGasolinera;
	}

	public String getMatriculaVehiculoRepostajeGasolinera() {
		return matriculaVehiculoRepostajeGasolinera;
	}

	public void setMatriculaVehiculoRepostajeGasolinera(String matriculaVehiculoRepostajeGasolinera) {
		this.matriculaVehiculoRepostajeGasolinera = matriculaVehiculoRepostajeGasolinera;
	}

	public Calendar getFchRepostajeGasolinera() {
		return fchRepostajeGasolinera;
	}

	public void setFchRepostajeGasolinera(Calendar fchRepostajeGasolinera) {
		this.fchRepostajeGasolinera = fchRepostajeGasolinera;
	}

	public boolean isEsFacturaRepostajeGasolinera() {
		return esFacturaRepostajeGasolinera;
	}

	public void setEsFacturaRepostajeGasolinera(boolean esFacturaRepostajeGasolinera) {
		this.esFacturaRepostajeGasolinera = esFacturaRepostajeGasolinera;
	}

	@Override
	public String toString() {
		return "RepostajeGasolinera [idRepostajeGasolinera=" + idRepostajeGasolinera + ", importeRespostajeGasolinera="
				+ importeRespostajeGasolinera + ", dniUsuarioRepostajeGasolinera=" + dniUsuarioRepostajeGasolinera
				+ ", matriculaVehiculoRepostajeGasolinera=" + matriculaVehiculoRepostajeGasolinera
				+ ", fchRepostajeGasolinera=" + fchRepostajeGasolinera + ", esFacturaRepostajeGasolinera="
				+ esFacturaRepostajeGasolinera + "]";
	}	
	
}
