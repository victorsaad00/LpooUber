package teletuber;

public class Motorista {
		
		private long id;
		private String cpf;
		private String email;
		private String senha;
		private String nome;
		private String sexo;
		private boolean disponivel;
		private Viagem[] viagens;

		public Motorista(long id, String cpf, String email, String senha, String nome, String sexo, boolean disponivel) {
			this.id = id;
			this.cpf = cpf;
			this.email = email;
			this.senha = senha;
			this.nome = nome;
			this.sexo = sexo;
			this.disponivel = disponivel;
		}
		
		//Nesse m�todo o Motorista informa se pode fazer o n�o a viagem. Caso sim, � necess�rio criar um objeto Viagem.
		public void responderPedido(){
			
		}
		
		//Lista de todas as viagens do motorista.
		public void historico(){
			
		}
}
