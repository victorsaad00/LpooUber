package teletuber;

public class Gerente {

	//Atributos da classe gerente.
	private long id;
	private String cpf;
	private String nome;
	private String senha;
	private String email;
	private String sexo; 

	public Gerente (long id, String cpf, String nome, String senha, String email, String sexo){
	    this.id = id;
	    this.cpf = cpf;
	    this.nome = nome;
	    this.senha = senha;
	    this.email = email; 
	    this.sexo = sexo;
	}
	//Os metodos a seguir est�o com tipo de retorno "void" pois ainda n�o foi especificado o retorno.
	//O M�todo cadastrar gerente recebe como entrada o objeto Motorista.
	public void cadastrarMotorista(Motorista Motorista){

	}

	public void removerMotorista(long id){

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

	public String getSexo() {
	    return sexo;
	}

	public void setSexo(String sexo) {
	    this.sexo = sexo;
	}
}

