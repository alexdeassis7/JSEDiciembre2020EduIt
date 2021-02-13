package com.educacionit.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.educacionit.daos.PersonaDAO;
import com.educacionit.modelo.PersonaVO;

@WebServlet("/AbmPersonaController")
public class AbmPersonaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AbmPersonaController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// CAPTURAMOS LOS PARAMETROS QUE NOS VIENEN EN EL REQUEST
//				String nombre = request.getParameter("nombre");
//				int edad = Integer.parseInt(request.getParameter("edad"));
//				String profesion = request.getParameter("profesion");
//				int telefono = Integer.parseInt(request.getParameter("telefono"));
//				
//				PersonaVO  miPersona = new PersonaVO(edad, telefono, nombre, profesion);
//				
//				System.out.println(miPersona.toString());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// CAPTURAMOS LOS PARAMETROS QUE NOS VIENEN EN EL REQUEST
		String nombre = request.getParameter("nombre");
		int edad = Integer.parseInt(request.getParameter("edad"));
		String profesion = request.getParameter("profesion");
		int telefono = Integer.parseInt(request.getParameter("telefono"));
		
		PersonaVO  miPersona = new PersonaVO(edad, telefono, nombre, profesion);
		
		PersonaDAO pd = new PersonaDAO();
		pd.registrarPersona(miPersona);
		
		System.out.println(miPersona.toString());

		//redireccionamos del controller a una vista
		response.sendRedirect("vistas/About.html");
	}

}
