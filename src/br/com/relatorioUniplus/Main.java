package br.com.relatorioUniplus;

import br.com.relatorioUniplus.Dao.RelatorioDao;
import br.com.relatorioUniplus.Dao.RelatorioDaoImpl;
import br.com.relatorioUniplus.model.Relatorio;

public class Main {

	public static void main(String[] args) {
		
		RelatorioDao dao = new RelatorioDaoImpl();
		
		Relatorio relatorio = dao.buscar("353");
		
		System.out.println(relatorio.toString());
	}
}
