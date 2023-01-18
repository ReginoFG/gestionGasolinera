/**
 * 
 */
package gestionGasolinera.dal;

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

}
