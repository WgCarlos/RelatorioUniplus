package br.com.relatorioUniplus.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.relatorioUniplus.Factory.ConnectionFactory;
import br.com.relatorioUniplus.model.Relatorio;

public class RelatorioDaoImpl extends ConnectionFactory implements relatorioDao {
	private static final String TABLE = "notafiscal";
	private static final String COLUMNS = "numeronotafiscal";
	
	@Override
	public Relatorio buscar(int id) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		StringBuilder sql = new StringBuilder();
		
		sql.append("SELECT * FROM");
		sql.append(TABLE);
		sql.append(" ");
		sql.append("WHERE numeronotafiscal = ?");
		try {
			con = getConnection();
			Relatorio relatorio = new Relatorio();
			ps = con.prepareStatement(sql.toString());
			rs = ps.executeQuery();
			
			rs.next();
			relatorio.setNumeronotafiscal(rs.getInt("numeronotafical"));
			
			ps.close();
			rs.close();
			con.close();
			return relatorio;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("erro ao buscar funcionario", e);
		}
	}

}
