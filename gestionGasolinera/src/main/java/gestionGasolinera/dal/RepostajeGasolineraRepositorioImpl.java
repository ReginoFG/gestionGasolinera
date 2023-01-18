/**
 * 
 */
package gestionGasolinera.dal;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

/**
 * @author garfe
 * Implementación de la interfaz RepostajeGasolineraRepositorio
 */
@Repository
public class RepostajeGasolineraRepositorioImpl implements RepostajeGasolineraRepositorio{

	@PersistenceContext
	private EntityManager em;

	@Override
	public void insertarRepostajeGasolinera(RepostajeGasolinera repostajeGasolinera) throws Exception {
		
		em.persist(repostajeGasolinera);
		em.clear();
		em.close();
		
	}
	


}
