package com.educacionit.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FormController")
//localhost:8080/miPrimerProyectoWeb/FormController
public class FormController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FormController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Llego el Request del Front End");
		String em = request.getParameter("email");
		String un = request.getParameter("uname");
		String pa = request.getParameter("pass");
		String ge = request.getParameter("gender");
		String[] co = request.getParameterValues("course");

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.write("<h2>Recibimos tu formulario correctamente en el back end , estos son los datos que nos llegaron:</h2>");
		pw.write("<h3> Email Recibido:" + em + " </h3>");
		pw.write("<h3> User Name Recibido:" + un + " </h3>");
		pw.write("<h3> Password Recibida:" + pa + " </h3>");
		pw.write("<h3> Genero Recibido:" + ge + " </h3>");
		pw.write("<h3> Cursos:");
		for (String c : co) {
			pw.write(c + " ");
		}
		pw.write("</h3>");
		
		
		

		// response.getWriter().append("te respondio el request el servlet de la app:
		// ").append(request.getContextPath());

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
