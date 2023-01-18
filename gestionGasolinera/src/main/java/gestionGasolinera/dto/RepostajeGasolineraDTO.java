package gestionGasolinera.dto;

import java.util.Calendar;

import org.springframework.stereotype.Component;

@Component
public class RepostajeGasolineraDTO {

	//ATRIBUTOS
	private double importeRespostajeGasolinera;

	private String dniUsuarioRepostajeGasolinera;

	private String matriculaVehiculoRepostajeGasolinera;
	
	private Calendar fchRepostajeGasolinera;
	
	private boolean esFacturaRepostajeGasolinera;
	
	//GETTERS Y SETTERS
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

	//CONSTRUCTOR
	public RepostajeGasolineraDTO(double importeRespostajeGasolinera, String dniUsuarioRepostajeGasolinera,
			String matriculaVehiculoRepostajeGasolinera, Calendar fchRepostajeGasolinera,
			boolean esFacturaRepostajeGasolinera) {
		super();
		this.importeRespostajeGasolinera = importeRespostajeGasolinera;
		this.dniUsuarioRepostajeGasolinera = dniUsuarioRepostajeGasolinera;
		this.matriculaVehiculoRepostajeGasolinera = matriculaVehiculoRepostajeGasolinera;
		this.fchRepostajeGasolinera = fchRepostajeGasolinera;
		this.esFacturaRepostajeGasolinera = esFacturaRepostajeGasolinera;
	}	

	public RepostajeGasolineraDTO(double importeRespostajeGasolinera, Calendar fchRepostajeGasolinera,
			boolean esFacturaRepostajeGasolinera) {
		super();
		this.importeRespostajeGasolinera = importeRespostajeGasolinera;
		this.fchRepostajeGasolinera = fchRepostajeGasolinera;
		this.esFacturaRepostajeGasolinera = esFacturaRepostajeGasolinera;
	}	

	public RepostajeGasolineraDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	//TOSTRING
	@Override
	public String toString() {
		return "RepostajeGasolineraDTO [importeRespostajeGasolinera=" + importeRespostajeGasolinera
				+ ", dniUsuarioRepostajeGasolinera=" + dniUsuarioRepostajeGasolinera
				+ ", matriculaVehiculoRepostajeGasolinera=" + matriculaVehiculoRepostajeGasolinera
				+ ", fchRepostajeGasolinera=" + fchRepostajeGasolinera + ", esFacturaRepostajeGasolinera="
				+ esFacturaRepostajeGasolinera + "]";
	}
	
	
	
	
	
	
	
}
