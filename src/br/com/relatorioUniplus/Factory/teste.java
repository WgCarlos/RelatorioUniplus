package br.com.relatorioUniplus.Factory;

import java.sql.Connection;

public class teste extends ConnectionFactory {

	public static void main(String[] args) {
		ConnectionFactory con = new ConnectionFactory();
		System.out.println("Conectado");
	}

}
