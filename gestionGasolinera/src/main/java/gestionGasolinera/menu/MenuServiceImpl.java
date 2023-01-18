/**
 * 
 */
package gestionGasolinera.menu;

import java.util.Calendar;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import gestionGasolinera.dal.RepostajeGasolinera;
import gestionGasolinera.dto.ADaoServicio;
import gestionGasolinera.dto.ADaoServicioImpl;
import gestionGasolinera.dto.ADtoServicio;
import gestionGasolinera.dto.ADtoServicioImpl;
import gestionGasolinera.dto.RepostajeGasolineraDTO;

/**
 * @author garfe
 * Implementa la interfaz MenuService
 */
@Service
public class MenuServiceImpl implements MenuService{
		
	ADtoServicio aDto = new ADtoServicioImpl();
	ADaoServicio aDao = new ADaoServicioImpl();
	
	@Override
	public int mostrarMenu(Scanner entradaOpcion) {
		int opcion;
		System.out.println("#################");
		System.out.println("##### MENU ######");
		System.out.println("#################");
		System.out.println("1. Repostaje normal");
		System.out.println("2. Repostaje factura");
		System.out.println("3. Ver todos los repostajes");
		System.out.println("4. Importe total combustible vendido");
		System.out.println("5. Llenado de deposito");
		System.out.println("6. Eliminar ultimo llenado de deposito");
		System.out.println("7. Ver todos los llenados de deposito");		
		System.out.println("0. Cerrar menu.");
		System.out.println("[INFO] - Escriba el numero de la opcion deseada: ");
        opcion = entradaOpcion.nextInt();
		return opcion;
	}

	@Override
	public boolean repostajeNormal(Calendar fch_actual, ConsultasService consultas) {
		System.out.println("[INFO] - REPOSTAJE NORMAL");
		Boolean resultadoInsercionRepostajeNormal = false;
		
		boolean esFactura = false;
		Scanner entradaImporteRepostaje = new Scanner(System.in);
		System.out.println("[INFO] - Escriba el importe del repostaje: ");
		double importeRepostaje = entradaImporteRepostaje.nextDouble();
		
		//Si tuvieramos que trabajar con los datos que se han introducido, se pasaría a DTO
		RepostajeGasolineraDTO rgDTONormal = aDto.ARepostajeGasolineraDTONormal(fch_actual, importeRepostaje, esFactura);
		
		//Una vez tenemos en el DTO los datos modificados y correctamente formateados se pasaría a DAO
		RepostajeGasolinera repostajeGasolinera = aDao.RepostajeGasolineraNormalDTOADAO(rgDTONormal);
		System.out.println("[INFO] - Nuevo repostaje normal a insertar: " + repostajeGasolinera);
		
		//Inserción del DAO en base de datos
		resultadoInsercionRepostajeNormal = consultas.insertarRepostajeNormal(repostajeGasolinera);
		System.out.println("[INFO] - Resultado inserción nuevo repostaje normal: " + resultadoInsercionRepostajeNormal);
		
		return resultadoInsercionRepostajeNormal;
		
	}

}
