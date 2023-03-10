package gestionGasolinera.menu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gestionGasolinera.dal.RepostajeGasolinera;
import gestionGasolinera.dal.RepostajeGasolineraRepositorio;
/**
 * @author garfe
 * ConsultasServiceImpl: Implementa la interfaz ConsultasService
 */
@Service
public class ConsultasServiceImpl implements ConsultasService{

	@Autowired
	private RepostajeGasolineraRepositorio psi;
	
	@Override
	@Transactional
	public boolean insertarRepostajeNormal(RepostajeGasolinera repostajeGasolinera) {
		
		try {
			
		psi.insertarRepostajeGasolinera(repostajeGasolinera);
		
		}catch(Exception e) {
			System.out.println("[ERROR] - Error al insertar nuevo repostaje normal a guardar: " + e);
			return false;
		}
		return true;
		
	}

	@Override
	public List<RepostajeGasolinera> listarRepostajeNormalImporte(double importe) {
		List<RepostajeGasolinera> listaRepostaje = psi.buscarRepostajeNormalPorImporte(importe);
		return listaRepostaje;
	}

	@Override
	@Transactional
	public void updateRepostajeNormalImporte() {
		psi.updatePorImporte();
		
	}



}
