package teletuber;

public class Lugar {
	
	private String identificadorLugar;
	private String enderešo;
	
	//Construtor da classe Lugar.
	public Lugar(String identificadorLugar, String enderešo) {
		this.identificadorLugar = identificadorLugar;
		this.enderešo = enderešo;
	}
	
	public String getIdentificadorLugar() {
		return identificadorLugar;
	}
	public void setIdentificadorLugar(String identificadorLugar) {
		this.identificadorLugar = identificadorLugar;
	}
	public String getEnderešo() {
		return enderešo;
	}
	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}
	

}
