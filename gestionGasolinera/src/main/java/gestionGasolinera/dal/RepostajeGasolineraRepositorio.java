/**
 * 
 */
package gestionGasolinera.dal;

import java.util.List;

/**
 * @author garfe
 * RepostajeGasolineraRepositorio: Interfaz con las operaciones básicas contra base de datos para la tabla dlk_gga_tch_repostajeGasolinera.
 */
public interface RepostajeGasolineraRepositorio {
	
	/**
	 * insertarRepostajeGasolinera: inserta un nuevo repostaje
	 * @param repostajeGasolinera DAO con el nuevo repostaje
	 */
	public void insertarRepostajeGasolinera(RepostajeGasolinera repostajeGasolinera) throws Exception;

	/**
	 * buscarRepostajeNormalPorImporte: lista los repostajes con mayor importe al indicado por el usuario
	 * @param importe
	 * @return lista de repostajes normal que cumplen la condición de importe
	 */
	public List<RepostajeGasolinera> buscarRepostajeNormalPorImporte(double importe);
	
	public void updatePorImporte();
}
