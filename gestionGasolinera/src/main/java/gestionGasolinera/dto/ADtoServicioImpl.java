/**
 * 
 */
package gestionGasolinera.dto;

import java.util.Calendar;

import org.springframework.stereotype.*;

import gestionGasolinera.dal.RepostajeGasolinera;

/**
 * @author garfe
 * Interfaz que implementa la case ADtoServicioImpl
 */
@Service
public class ADtoServicioImpl implements ADtoServicio{

	
	@Override
	public RepostajeGasolineraDTO ARepostajeGasolineraDTONormal(Calendar fch_actual, double importeRepostaje,
			boolean esFactura) {
		
		RepostajeGasolineraDTO rgDTONormal = new RepostajeGasolineraDTO(importeRepostaje,fch_actual,esFactura);
		
		return rgDTONormal;
	}



}
