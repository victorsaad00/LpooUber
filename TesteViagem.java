package teletuberTeste;

import teletuber.*;

public class TesteViagem {
	public static void main(String[] args){
		Lugar origem = new Lugar("Poli","Rua benfica");
		Lugar destino = new Lugar("Casa","Qualquer Rua");
		Motorista motorista = new Motorista(10,"111.111.111.11","Victor","123456","motoristaemail.com","H", true);
		Solicitante solicitante = new Solicitante(10,"222.222.222.22","Victor","123123","victorsaad.150@gmail.com","M",null ,12345612);
		Viagem viagem = new Viagem(0, solicitante, motorista, origem, destino, 100, "Dinheiro");
	}
}
