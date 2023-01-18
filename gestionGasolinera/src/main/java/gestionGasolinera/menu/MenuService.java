/**
 * 
 */
package gestionGasolinera.menu;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author garfe
 * MenuService: Interfaz que define las acciones del menú.
 */
public interface MenuService {
	
	/**
	 * mostrarMenu: método que muestra en consola las acciones posibles y recoge la opción
	 * seleccionada por el usuario.
	 * @return opción elegida por el usuario
	 */
	public int mostrarMenu(Scanner entradaOpcion);

	/**
	 * repostajeNormal: registrar un repostaje normal (sin factura)
	 * @param fecha actual del sistema
	 * @return true si la inserción en base de datos ha sido correcta, false en caso contrario
	 */
	public boolean repostajeNormal(Calendar fch_actual, ConsultasService consultas);
}
