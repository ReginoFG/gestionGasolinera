/**
 * 
 */
package gestionGasolinera.dto;

import java.util.Calendar;

import gestionGasolinera.dal.RepostajeGasolinera;

/**
 * @author garfe
 * ADtoServicio: Interfaz con los métoso que pasan de DAO a DTO.
 */
public interface ADtoServicio {

	/**
	 * Convierte la información insertada en RepostajeGasolineraDTO
	 * @param fch_actual fecha actual del sistema
	 * @param importeRepostaje importe repostaje normal
	 * @param esRepostajeNormal indica si es repostaje normal
	 * @return
	 */
	public RepostajeGasolineraDTO ARepostajeGasolineraDTONormal (Calendar fch_actual, double importeRepostaje, boolean esRepostajeNormal);
	

}
