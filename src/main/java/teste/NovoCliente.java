package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelos.Cliente;

public class NovoCliente {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("bancoloja");
		EntityManager em = emf.createEntityManager();
		
		Cliente novoCliente = new Cliente("Cliente Padrão","98765-4321");
		
	
		em.getTransaction().begin();
		em.persist(novoCliente);
		em.getTransaction().commit();
		
		System.out.println("Cliente gerado com código" + novoCliente.getId());
		
		em.close();
		emf.close();
	}

}
