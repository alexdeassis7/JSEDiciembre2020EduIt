package com.educacionit.daos;

import javax.swing.JOptionPane;
import com.educacionit.modelos.PersonaVO;

public class AppPrincipal {

	public static void main(String[] args) {

//		Integer idIngresado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Id de la persona"));
//		Integer edadIngresada = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Edad de la persona"));
//		Integer telefonoIngresado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el telefono de la persona"));
//		String nombreIngresado = JOptionPane.showInputDialog("Ingrese el nombre de la persona");
//		String profesionIngresada = JOptionPane.showInputDialog("Ingrese la profesion de la persona");
//
//		PersonaVO objetoPersona = new PersonaVO(idIngresado, edadIngresada, telefonoIngresado, nombreIngresado,
//				profesionIngresada);
		// PersonaVO objetoPersona = new PersonaVO(200 ,15,999999, "Alejandro"
		// ,"Licenciado En Casi Todo");
		PersonaDAO dao = new PersonaDAO();
		// dao.modificarPersona(objetoPersona, 458);

//		dao.registrarPersona(objetoPersona);
		PersonaVO objetoPersona = new PersonaVO();
		Integer idIngresado = Integer
				.parseInt(JOptionPane.showInputDialog("Ingrese el Id de la persona que necesita conocer"));
		objetoPersona = dao.buscarPersona(idIngresado);

		if (objetoPersona == null) {
			JOptionPane.showMessageDialog(null, "no exite la persona con id " + idIngresado);
		} else {
			JOptionPane.showMessageDialog(null,
					"Nombre :" + objetoPersona.getNombrePersona() + "\n Edad : " + objetoPersona.getEdadPersona()
							+ "\n Telefono : " + objetoPersona.getTelefonoPersona() + "\n Profesion : "
							+ objetoPersona.getProfesionPersona() + "\n ID : " + objetoPersona.getIdPersona());
		}

		// Eliminar registro mediante un id

		String id = JOptionPane.showInputDialog("Ingrese el id de la persona que quiere eliminar ");
		dao.eliminarPersona(id);

	}

}
