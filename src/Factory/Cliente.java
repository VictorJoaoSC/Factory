package Factory;

import java.util.Scanner;

public class Cliente {

	private IDAOLivro daoLivro;
	private String fonte;
	public void busca() {
		
		Scanner reader = new Scanner(System.in);
		
		fonte = reader.next();
		
		this.setDaoLivro();
		
		System.out.println(daoLivro.getBuscaPorAutor());
		
	}

	private void setDaoLivro() {
		this.daoLivro = new FactoryDAOLivro().criaDAOILivro(fonte);
	}
	public Cliente() {}
	
}
