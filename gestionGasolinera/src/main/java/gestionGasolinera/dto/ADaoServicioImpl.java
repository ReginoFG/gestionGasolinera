/**
 * 
 */
package gestionGasolinera.dto;

import org.hibernate.type.CalendarType;

import gestionGasolinera.dal.RepostajeGasolinera;

/**
 * @author garfe
 * Implementación de la interfaz ADaoServicio
 */
public class ADaoServicioImpl implements ADaoServicio{
	
	@Override
	public RepostajeGasolinera RepostajeGasolineraNormalDTOADAO(RepostajeGasolineraDTO repostajeGasolineraDTO) {
		
		RepostajeGasolinera repostajeGasolinera = new RepostajeGasolinera();
		if(repostajeGasolineraDTO != null) {
	
			repostajeGasolinera.setImporteRespostajeGasolinera(repostajeGasolineraDTO.getImporteRespostajeGasolinera());
			repostajeGasolinera.setFchRepostajeGasolinera(repostajeGasolineraDTO.getFchRepostajeGasolinera());
			repostajeGasolinera.setEsFacturaRepostajeGasolinera(repostajeGasolineraDTO.isEsFacturaRepostajeGasolinera());
			
		}
		return repostajeGasolinera;
	}
}
