package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelos.Cliente;

public class AlterarCliente {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bancoloja");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		Cliente cliente = em.find(Cliente.class, 3L);
		System.out.println(cliente.getTelefone());
		
		cliente.setNome("Leandro Teixeira ");
		cliente.setTelefone("99090-0000");
		em.merge(cliente);
		
		System.out.println(cliente.getNome());
		System.out.println(cliente.getTelefone());
		
		em.getTransaction().commit();

			em.close();
			emf.close();

	}

}
