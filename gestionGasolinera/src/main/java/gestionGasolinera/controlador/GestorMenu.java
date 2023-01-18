/**
 * 
 */
package gestionGasolinera.controlador;

import java.util.Calendar;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import gestionGasolinera.menu.*;

/**
 * @author garfe
 * GestorMenu: Controlador de interacción con la aplicación.
 */
@Controller
public class GestorMenu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Contexto
		ApplicationContext context = new ClassPathXmlApplicationContext("contexto.xml"); 
		ConsultasService consulta = (ConsultasService) context.getBean(ConsultasService.class);
		
		//Inicialización variables útiles
		MenuService ms = new MenuServiceImpl();
		Scanner entradaOpcion = new Scanner(System.in);
		Calendar fch_actual = Calendar.getInstance();
		Boolean cerrarMenu = false;
		int opcion;

		//El menú se mostrará tras cada selección hasta que se marque la opción 0.
		while(!cerrarMenu) {			
			
			//Mostramos el menú
			opcion = ms.mostrarMenu(entradaOpcion);
			System.out.println("[INFO] - Has seleccionado la opcion " + opcion);
			
			switch (opcion) {			
				case 0:
					cerrarMenu = true;
					System.out.println("[INFO] - Aplicación cerrada" + opcion);
					break;
				case 1:
					if(ms.repostajeNormal(fch_actual, consulta)) {
						System.out.println("[INFO] - Inserción de nuevo repostaje normal correcta");
					}else {
						System.out.println("[INFO] - Inserción de nuevo repostaje normal fallida");
					}
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				case 7:
					break;
				default:
					opcion = ms.mostrarMenu(entradaOpcion);	
			}

		}	

	}

}
