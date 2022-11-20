package generation.italy.shop;

public class Cuffie extends Prodotto {
	private String Colore;
	private boolean wireless;
	
	public Cuffie(int Codice, String Nome, String Marca, int Prezzo, int Iva, String Colore, boolean b) {
		super(Codice, Nome, Marca, Prezzo, Iva);
		this.Colore = Colore;
		this.wireless = wireless;
	}

	public String getColore() {
		return Colore;
	}

	public void setColore(String colore) {
		Colore = colore;
	}

	public boolean isWireless() {
		return wireless;
	}

	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}
	
	@Override
	public String toString() {
		
		return "Cuffie:"
				+ "\n" + super.toString()
				+ "\ncolore: " + getColore()
				+ "\nwireless: " + ( isWireless() ? "si'" : "no" );
	}
}
