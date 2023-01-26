/**
 * 
 */
package gestionGasolinera.dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
		//em.close();
		
	}
	
	public List<RepostajeGasolinera> buscarRepostajeNormalPorImporte(double importe) {
		/*String jpql = "SELECT rg FROM RepostajeGasolinera rg WHERE rg.importeRespostajeGasolinera > :importeP";
		Query query = em.createQuery(jpql);
		query.setParameter("importeP", importe);
		return query.getResultList();*/
		
	    String jpql = "SELECT rg FROM RepostajeGasolinera rg WHERE rg.importeRespostajeGasolinera > ?1";
	    Query query = em.createQuery(jpql);
	    query.setParameter(1, importe);
	    return query.getResultList();
	}

}
