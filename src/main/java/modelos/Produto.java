package modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//@Table(name = "tb_produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//@Column(name = "prod_nome", length = 100, nullable = false)
	private String nome;
	
	//@Column(name = "prod_modelo", length = 100, nullable = true)
	private String modelo;
	
	//@Column(name = "prod_preco", nullable = false, precision = 11, scale = 2)
	private double valor;
	
	public Produto() {
	}

	public Produto(String nome, String modelo, double valor) {
		super();
		this.nome = nome;
		this.modelo = modelo;
		this.valor = valor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
