package Factory;

import java.util.ArrayList;
import java.util.List;

public class DAOBuscaLivroTxt implements IDAOLivro  {

	public List<String> getBuscaPorAutor() {
		List <String> livros = new ArrayList<String>();
		
		livros.add("Livro no arquivo txt!");
		return livros;
	}

}
