package teletuber;

public class Viagem {
	private long id;
	private Solicitante cliente;
	private Motorista motorista;
	private Lugar origem;
	private Lugar destino;
	private double valorViagem;
	private String formaPagamento;
	
	//Construtor da classe viagem.
	public Viagem(long id,Solicitante cliente,Motorista motorista,Lugar origem,Lugar destino, double valorViagem,String formaPagamento) {
		this.id = id;
		this.cliente = cliente;
		this.motorista = motorista;
		this.origem = origem;
		this.destino = destino;
		this.valorViagem = valorViagem;
		this.formaPagamento = formaPagamento;
	}
	
	//Gets e Sets.
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Solicitante getCliente() {
		return cliente;
	}

	public void setCliente(Solicitante cliente) {
		this.cliente = cliente;
	}

	public Lugar getOrigem() {
		return origem;
	}

	public void setOrigem(Lugar origem) {
		this.origem = origem;
	}

	public Lugar getDestino() {
		return destino;
	}

	public void setDestino(Lugar destino) {
		this.destino = destino;
	}

	public double getValorViagem() {
		return valorViagem;
	}

	public void setValorViagem(double valorViagem) {
		this.valorViagem = valorViagem;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public Motorista getMotorista() {
		return motorista;
	}

	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}
}
