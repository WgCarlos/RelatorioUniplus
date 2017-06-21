package br.com.relatorioUniplus.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.relatorioUniplus.Factory.ConnectionFactory;
import br.com.relatorioUniplus.model.Relatorio;

public class RelatorioDaoImpl extends ConnectionFactory implements relatorioDao {
	private static final String TABLE = "notafiscal";
	private static final String COLUMNS = "";
	
	@Override
	public Relatorio buscar(int id) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		StringBuilder sql = new StringBuilder();
		
		
		return null;
	}

}
