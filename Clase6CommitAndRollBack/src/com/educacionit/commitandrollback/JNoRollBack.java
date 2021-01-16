package com.educacionit.commitandrollback;

import java.sql.*;

public class JNoRollBack {

	public static void main(String[] args) {
		Connection connection = DataBase.getConnection();

		PreparedStatement stmt1 = null;
		PreparedStatement stmt2 = null;

		try {
			// se preparan las sentencias SQL
			stmt1 = connection.prepareStatement("INSERT INTO mitabla VALUES (? ,?)");
			stmt2 = connection.prepareStatement("INSERT INTO miotratabla VALUES (?, ? ,?)");

			System.out.println("Primer INSERT en MITABLA");
			stmt1.setInt(1, 444);
			stmt1.setString(2, "adeassis@gmail.com");
			stmt1.executeUpdate();

			System.out.println("Segundo INSERT en MITABLA");
			stmt1.setInt(1, 555);
			stmt1.setString(2, "ezequiel@gmail.com");
			stmt1.executeUpdate();

			System.out.println("Tercer INSERT en MITABLA");
			stmt1.setInt(1, 666);
			stmt1.setString(2, "juancarlos@gmail.com");
			stmt1.executeUpdate();

			System.out.println("Primer INSERT en MIOTRATABLA");
			stmt2.setString(1, "Alex");
			stmt2.setString(2, "Gonzalez");

			//stmt2.setInt(3, 35);
			//forzamos un error
			stmt2.setString(3, "ERRORRRRRR");
			stmt2.executeUpdate();

		} catch (SQLException e) {
			System.out.println("ERROR : " + e.getMessage());
			e.printStackTrace();
		} finally {
			// liberamos los recursos en caso de ser necesario
			try {
				if (stmt1 != null)
					stmt1.close();
				if (stmt2 != null)
					stmt2.close();
				if (connection != null)
					connection.close();
				
			} catch (SQLException e) {
				System.out.println("ERROR 2 " + e.getMessage());
				e.printStackTrace();

			}

		}
	}
}
