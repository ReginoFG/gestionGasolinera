package gestionGasolinera.menu;

import java.util.Calendar;

import gestionGasolinera.dal.RepostajeGasolinera;

/**
 * @author garfe
 * Consultas: Interfaz que define los métodos específicos de consulta sobre base de datos.
 */
public interface ConsultasService {
	
	/**
	 * insertarRepostajeNormal: Inserta en base de datos un nuevo repostaje normal
	 * @param nuevo repostaje normal
	 * @return true si la inserción en base de datos ha sido correcta, false en caso contrario
	 */
	boolean insertarRepostajeNormal (RepostajeGasolinera repostajeGasolinera);

}
