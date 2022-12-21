package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelos.Cliente;

public class AlterarCliente2 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bancoloja");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		Cliente cliente = em.find(Cliente.class, 3L);
		System.out.println(cliente.getTelefone());
		
		cliente.setNome("Leandro Teixeira ");
		cliente.setTelefone("99090-0000");
		//em.merge(cliente);
		//Mesmo sem utilizar o método merge, o JPA entende 
		//e grava as alterações realizadas por estar em um contexto transacional
		
		System.out.println(cliente.getNome());
		System.out.println(cliente.getTelefone());
		
		em.getTransaction().commit();

			em.close();
			emf.close();

	}

}
