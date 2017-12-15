package Factory;

public class FactoryDAOLivro {

	public IDAOLivro criaDAOILivro(String fonteDeDados) {
		
		IDAOLivro busca=null;
		
		if(fonteDeDados.equals("banco"))
			busca = new DAOBuscaLivrosBanco();
			
		if(fonteDeDados.equals("txt"))
			busca = new DAOBuscaLivroTxt();
		
		return busca;
	}
}
