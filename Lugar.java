package teletuber;

public class Lugar {
	
	private String identificadorLugar;
	private String endereço;
	
	//Construtor da classe Lugar.
	public Lugar(String identificadorLugar, String endereço) {
		this.identificadorLugar = identificadorLugar;
		this.endereço = endereço;
	}
	
	public String getIdentificadorLugar() {
		return identificadorLugar;
	}
	public void setIdentificadorLugar(String identificadorLugar) {
		this.identificadorLugar = identificadorLugar;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	

}
