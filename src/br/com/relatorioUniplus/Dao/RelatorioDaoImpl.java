package br.com.relatorioUniplus.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.relatorioUniplus.Factory.ConnectionFactory;
import br.com.relatorioUniplus.model.Relatorio;

public class RelatorioDaoImpl extends ConnectionFactory implements RelatorioDao {
	
	@Override
	public Relatorio buscar(String id) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = getConnection();
			Relatorio relatorio = new Relatorio();
			String SQL = "SELECT n.numeronotafiscal, n.valortotalnota, e.nome, co.descricao, n.emissao, n.enderecoentrega, "
					+ "n.bairroentrega, n.complementoentrega, n.cepentrega, ci.nome, es.nome, e.cnpjcpf, e.telefone, "
					+ "e.numeroendereco FROM notafiscal n "
					+ "join entidade e on n.identidade = e.id and n.numeronotafiscal = ? "
					+ "join financeiro f on n.id = f.idorigem "
					+ "join cidade ci on n.idcidadeentrega = ci.id "
					+ "join estado es on n.idestadoentrega = es.id "
					+ "join condicaopagamento co on n.idcondicaopagto = co.id"; 
			
			ps = con.prepareStatement(SQL);
			ps.setString(1, id);
			rs = ps.executeQuery();
			rs.next();
			relatorio.setId(rs.getInt("numeronotafiscal")); 
			relatorio.setValortotalnota(rs.getFloat("valortotalnota"));
			relatorio.setNome(rs.getString("nome"));
			relatorio.setParcela(rs.getString("descricao"));
			relatorio.setEmissao(rs.getDate("emissao"));
			relatorio.setEndereco(rs.getString("enderecoentrega"));
			relatorio.setBairro(rs.getString("bairroentrega"));
			relatorio.setComplemento(rs.getString("complementoentrega"));
			relatorio.setCep(rs.getString("cepentrega"));
			relatorio.setCidade(rs.getString("nome"));
			relatorio.setEstado(rs.getString("nome"));
			relatorio.setCnpjcpf(rs.getString("cnpjcpf"));
			relatorio.setTelefone(rs.getString("telefone"));
			relatorio.setNumeroendereco(rs.getString("numeroendereco"));
			
			ps.close();
			rs.close();
			con.close();
			return relatorio;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("erro ao buscar Nota", e);
		}
	}

}
