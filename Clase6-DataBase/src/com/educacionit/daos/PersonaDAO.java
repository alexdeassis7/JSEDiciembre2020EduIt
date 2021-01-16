package com.educacionit.daos;

import com.educacionit.database.Conexion;
import com.educacionit.modelos.PersonaVO;

import java.sql.*;

import javax.print.attribute.standard.Sides;
import javax.swing.JOptionPane;

//CApa de acceso a datos 
//CRUD ' create read update delete
public class PersonaDAO {

	// metodo que me permite insertar una persona en mi DB
	public void registrarPersona(PersonaVO miPersona) {
		Conexion conex = new Conexion();
		try {
			// el metodo createStatement() se utiliza para crear un objecto
			// que modela la Query y nos brinda una estructura para ejecutar
			// setencias SQL contra una conexion a una DB
			Statement estatuto = conex.getConnection().createStatement();
			estatuto.executeUpdate("INSERT INTO persona VALUES('" + miPersona.getIdPersona() + "','"
					+ miPersona.getNombrePersona() + "','" + miPersona.getEdadPersona() + "','"
					+ miPersona.getProfesionPersona() + "','" + miPersona.getTelefonoPersona() + "')");
			System.out.println("Se registro correctamente a " + miPersona.getNombrePersona() + " en la db ");

		} catch (SQLException e) {

			System.out.println("ERROR : NO registro correctamente a " + miPersona.getNombrePersona() + " en la db ");
			System.out.println(e.getMessage());
			e.printStackTrace();
			e.getCause();
		} finally {
			conex.desconectar();
		}

	}

	// este metodo recibe un id de persona y lo busca en la base para retorname el
	// objeto (si es que existe ) o me
	// retorna null
	public PersonaVO buscarPersona(int codigo) {

		Conexion conex = new Conexion();
		PersonaVO persona = null;

		try {
			PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM persona WHERE id = ? ");
			consulta.setInt(1, codigo);
			// ejecutamos la query y guarmos el set de resultado obtenidos
			// en un objeto de tipo Resulset
			ResultSet res = consulta.executeQuery();
			while (res.next()) {

				persona = new PersonaVO();

				persona.setIdPersona(Integer.parseInt(res.getString("id")));
				persona.setNombrePersona(res.getString("nombre"));
				persona.setProfesionPersona(res.getString("profesion"));
				persona.setEdadPersona(Integer.parseInt(res.getString("edad")));
				persona.setTelefonoPersona(Integer.parseInt(res.getString("telefono")));
			}

			res.close();
			consulta.close();
			conex.desconectar();

		} catch (SQLException e) {
			System.out.println("Error no se logro obtener la person con id : " + codigo);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		return persona;

	}

	public void modificarPersona(PersonaVO miPersona, int idNuevo) {
		Conexion conex = new Conexion();

		try {

			String consulta = "UPDATE persona SET id = ? , nombre = ? , edad = ? , profesion = ? , telefono = ? WHERE id = ? ";
			PreparedStatement estatuto = conex.getConnection().prepareStatement(consulta);

			estatuto.setInt(1, idNuevo);
			estatuto.setString(2, miPersona.getNombrePersona());
			estatuto.setInt(3, miPersona.getEdadPersona());
			estatuto.setString(4, miPersona.getProfesionPersona());
			estatuto.setInt(5, miPersona.getTelefonoPersona());
			estatuto.setInt(6, miPersona.getIdPersona());

			estatuto.executeUpdate(); // ejecutamos la query

			System.out.println("se actualizo el registro de " + miPersona.getNombrePersona());
		} catch (SQLException e) {
			System.out.println("Error no se pudo ACTUALIZAR la persona con id" + miPersona.getIdPersona());
			System.out.println(e.getMessage());
		} finally {
			conex.desconectar();
		}

	}

	// procedimiento que me permite borrar un registro existente mediante su id
	public void eliminarPersona(String codigo) {
		Conexion conex = new Conexion();
		Statement estatuto = null;
		try {
			estatuto = conex.getConnection().createStatement();
			estatuto.executeUpdate("DELETE FROM persona WHERE id='" + codigo + "'");
			JOptionPane.showMessageDialog(null, " Se ha Eliminado Correctamente ", "Informacion",
					JOptionPane.INFORMATION_MESSAGE);
			conex.desconectar();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "No se ah logrado eliminar el registro cuyo id es :" + codigo);
		} finally {
			try {
				estatuto.close();
			} catch (SQLException e) {
				System.out.println("No se logro cerrar el Statement");
				e.printStackTrace();
			}
		}

		// ("DELETE FROM persona WHERE id = '" +codigo + "'")

	}

}
