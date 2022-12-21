package teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelos.Cliente;

public class ListarClientes {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bancoloja");
		EntityManager em = emf.createEntityManager();

//		String jpql = "select u from Cliente u";
//		TypedQuery<Cliente> query = em.createQuery(jpql, Cliente.class);
//		query.setMaxResults(20);

		List<Cliente> clientes = em
				.createQuery("select u from Cliente u", Cliente.class)
				.setMaxResults(3)
				.getResultList();

		for (Cliente cliente : clientes) {
			System.out.println(
					"ID: " + cliente.getId() + ", Nome: " + cliente.getNome() + ", Telefone: " + cliente.getTelefone());

			em.close();
			emf.close();
		}
	}
}