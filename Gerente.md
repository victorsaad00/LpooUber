# LpooUber
Starting.
package Uber;

//Comentarios sobre a classe no feichamento da classe.

//Todos os metodos estão com retorno void porque não foi especificado seu retorno ainda.

public class Gerente {
	
	//Atributos da classe gerente.
	private long id;
	private String cpf;
	private String nome;
	private String senha;
	private String email;
	private String genero; 	// Relacionado ao gêreno.
	
	Gerente (long id, String cpf, String nome, String senha, String email, String genero){
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.senha = senha;
		this.email = email;
		this.genero = genero;
	}

	//Os metodos a seguir estão com tipo de retorno "void" pois ainda não foi especificado o retorno.
	
	//O Método cadastrar gerente recebe como entrada o objeto Motorista.
	public void cadastrarGerente(long id, String cpf, String nome, String senha, String email, String genero){
	
		
	}

	public void removerMotorista(){
		
	}
	
	public void listarMotorista(){
		
	}
	
	public void listarClientes(){
		
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
}//Término da classe Gerente.
	

/*
classe Gerente que é o responsável, dentre outros, por cadastrar e remover Motoristas. 
*/
