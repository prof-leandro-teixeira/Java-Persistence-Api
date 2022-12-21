package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelos.Cliente;

public class AlterarCliente3 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bancoloja");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		Cliente cliente = em.find(Cliente.class, 3L);
		System.out.println(cliente.getTelefone());
		//tirando o objeto do estado transacional e o merge será necessário para persistencia dos dados
		em.detach(cliente);
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
