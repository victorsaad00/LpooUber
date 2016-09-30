package teletuber;

import java.util.Date;

public class Solicitante {

	Date Data = new Date();
	
	//declara��o de atributos.
	private long id;
	private String cpf;
	private String email;
	private String senha;
	private String nome;
	private String sexo;
	private Date dataNascimento;
	private int numeroCelular;
	private Lugar[] lugares;
	private Viagem[] viagens;

	public Solicitante(long id, String cpf, String email, String senha, String nome, String sexo, Date dataNascimento, int numeroCelular) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.email = email;
		this.senha = senha;
		this.nome = nome;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.numeroCelular = numeroCelular;
		
	}//t�rmino do construtor.

	//declara��o do metodo solicitarCarona. Tipo de retorno void porque n�o se foi espeficiado o retorno ainda.
	public void solicitarCarona(){

	}
	/*
 	Esse m�todo deve cancelar uma requisi��o de carona. Se o cancelamento ocorrer ap�s um definido per�odo de tempo, o
	Cliente deve pagar um valor padr�o.
	 */
	public void cancelarCarona(){

	}

	//Lista de todas as viagens do usu�rio.
	public void historico(){

	}
}
