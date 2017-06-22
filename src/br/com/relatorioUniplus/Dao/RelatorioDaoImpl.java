package br.com.relatorioUniplus.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.relatorioUniplus.Factory.ConnectionFactory;
import br.com.relatorioUniplus.model.Relatorio;

public class RelatorioDaoImpl extends ConnectionFactory implements relatorioDao {
	
	@Override
	public Relatorio buscar(int id) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		
		try {
			con = getConnection();
			Relatorio relatorio = new Relatorio();
			String SQL = "SELECT d.codigo, d.valor, e.nome, c.descricao, d.data, d.enderecoentrega, d.bairroentrega, d.complementoentrega, d.cepentrega, ci.nome, es.nome, e.cnpjcpf, e.telefone, e.numeroenderecoentrega FROM dav d join entidade e on d.idcliente = e.id and d.codigo = ? join condicaopagamento c on d.idcondicaopagamento = c.id join cidade ci on d.idcidadeentrega = ci.id join estado es on d.idestadoentrega = es.id"; 
			ps = con.prepareStatement(SQL);
			rs = ps.executeQuery();
			
			rs.next();
			relatorio.setId(rs.getInt("codigo"));
			relatorio.setValortotalnota(rs.getFloat("valor"));
			relatorio.setNome(rs.getString("nome"));
			
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
