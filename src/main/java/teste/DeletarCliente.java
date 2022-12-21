package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelos.Cliente;

public class DeletarCliente {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bancoloja");
		EntityManager em = emf.createEntityManager();
		
		Cliente cliente = em.find(Cliente.class, 2L);
		
		if(cliente != null) {
			em.getTransaction().begin();
			em.remove(cliente);
			em.getTransaction().commit();
		}
	
		em.close();
		emf.close();

	}

}
