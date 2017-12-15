package Factory;

import java.util.ArrayList;
import java.util.List;

public class DAOBuscaLivrosBanco implements IDAOLivro{

	@Override
	public List<String> getBuscaPorAutor() {
		List<String> livros = new ArrayList<String>();
		
		livros.add("Livro no banco de dados!");
		return livros;
	}
	
}
