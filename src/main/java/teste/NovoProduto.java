package teste;

import DAO.DAO;
import modelos.Produto;

public class NovoProduto {

	public static void main(String[] args) {
		
		Produto produto = new Produto("Violão Aço","Taylor E615",10250.00);
		DAO<Produto> dao = new DAO<>(Produto.class);
		dao.abrirT().incluir(produto).fecharT().fechar();;
		
		System.out.println("ID do produto: " + produto.getId());
	}

}
