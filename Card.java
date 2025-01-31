package baraja;

public class Card {
	private String Palo; 
	private String Color;
	private String Valor;
	
	public Card() {}
	
	
	public Card(String Palo, String Color, String Valor) {
		this.Palo = Palo; 
		this.Color = Color;
		this.Valor = Valor;
	}
	public String getPalo() {
		return Palo;
	}
	public String getColor() {
		return Color;
	}
	public String getValor() {
		return Valor;
	}
}
