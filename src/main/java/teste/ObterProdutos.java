package teste;

import java.util.List;

import DAO.ProdutoDAO;
import modelos.Produto;

public class ObterProdutos {

	public static void main(String[] args) {

		ProdutoDAO dao = new ProdutoDAO();
		List<Produto> produtos = dao.obterTodos();
		
		for(Produto produto: produtos) {
			System.out.println("ID: " + produto.getId() 
					+ ", nome: " + produto.getNome() 
					+ ", Modelo: " + produto.getModelo()
					+", Preço: " + produto.getValor());
		}
		
		double precoTotal = produtos
				.stream()
				.map(p -> p.getValor())
				.reduce(0.0, (t, p) -> t + p)
				.doubleValue();
		System.out.println("Valor total dos produtos é R$" + precoTotal);
		dao.fechar();
	}
}