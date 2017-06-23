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
			relatorio.setId(rs.getInt("d.codigo"));
			relatorio.setValortotalnota(rs.getFloat("d.valor"));
			relatorio.setNome(rs.getString("e.nome"));
			relatorio.setParcela(rs.getString("c.descricao"));
			relatorio.setEmissao(rs.getDate("d.data"));
			relatorio.setEndereco(rs.getString("d.enderecoentrega"));
			relatorio.setBairro(rs.getString("d.bairroentrega"));
			relatorio.setComplemento(rs.getString("d.complemento"));
			relatorio.setCep(rs.getString("d.cepentrega"));
			relatorio.setCidade(rs.getString("ci.nome"));
			relatorio.setEstado(rs.getString("es.nome"));
			relatorio.setCnpjcpf(rs.getString("e.cnpjcpf"));
			relatorio.setTelefone(rs.getString("e.telefone"));
			relatorio.setNumeroendereco(rs.getString("e.numeroenderecoentrega"));
			
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
