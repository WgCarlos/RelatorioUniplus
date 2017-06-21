package br.com.relatorioUniplus.Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private static String STR_CONEXAO = "jdbc:postgresql://locahost/unico";
	private static String USUARIO = "servidor";
	private static String SENHA = "postgres";
	
		public static Connection getConnection(){
			try {
				return DriverManager.getConnection(STR_CONEXAO, USUARIO, SENHA);
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}		
}
