package com.educacionit.commitandrollback;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//En el siguiente link encontraran el mismo ejemplo pero con una DB SQLITE!
//https://github.com/alexdeassis7/JSE-2020-Sabado-EduIt/tree/master/Clase6COmmitAndRollBack/src/clase7/commitrollbacki/eduit

//esta clase tendra la conexion a la db 
public class DataBase {
	private final static String db = "personas";
	private final static String login = "root";
	private final static String password = "";
	private final static String url = "jdbc:mysql://localhost/" + db;

	public static Connection getConnection() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, login, password);
			if (conn != null) {
				System.out.println("Success con la DataBase " + db);
			}
			return conn;
			
		} catch (SQLException e) {
			
			System.out.println("Mensaje : " + e.getMessage());
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			System.out.println("Mensaje : " + e.getMessage());
			e.printStackTrace();
		}
		
		return null;
	}
	public static void main(String[] args) {
	 DataBase.getConnection();
	}

}
