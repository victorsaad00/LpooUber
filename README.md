# LpooUber
Starting.
package Uber;

//Todos os metodos estão com retorno void porque não foi especificado seu retorno ainda.

public class Motorista {
	
	private long id;
	private String cpf;
	private String email;
	private String senha;
	private String nome;
	private String sexo;
	private boolean disponivel;
	//À conferir.
	private String[] viagens;

	public Motorista(long id, String cpf, String email, String senha, String nome, String sexo, boolean disponivel,
			String[] viagens) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.email = email;
		this.senha = senha;
		this.nome = nome;
		this.sexo = sexo;
		this.disponivel = disponivel;
		this.viagens = viagens;
	}
	
	//Nesse método o Motorista informa se pode fazer o não a viagem. Caso sim, é necessário criar um objeto Viagem.
	public void responderPedido(){
		
	}
	
	//Lista de todas as viagens do motorista.
	public void historico(){
		
	}
