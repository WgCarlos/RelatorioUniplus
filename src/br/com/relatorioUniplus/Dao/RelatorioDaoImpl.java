package br.com.relatorioUniplus.Dao;

import java.sql.Connection;

import br.com.relatorioUniplus.Factory.ConnectionFactory;
import br.com.relatorioUniplus.model.Relatorio;

public class RelatorioDaoImpl extends ConnectionFactory implements relatorioDao {

	@Override
	public Relatorio buscar(int identidade) {
		Connection con = null;
		
		return null;
	}

}
