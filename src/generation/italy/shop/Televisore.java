package generation.italy.shop;

public class  Televisore extends Prodotto {
	private int altezza;
	private int larghezza;
	private boolean smart;
	
	public Televisore (int Codice, String Nome, String Marca, int Prezzo, int Iva, int altezza, int larghezza,boolean smart) {
		super(Codice, Nome, Marca, Prezzo, Iva);
		this.altezza= altezza;
		this.larghezza=larghezza;
		this.smart=smart;
	}

	public int getAltezza() {
		return altezza;
	}

	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}

	public int getLarghezza() {
		return larghezza;
	}

	public void setLarghezza(int larghezza) {
		this.larghezza = larghezza;
	}

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}
	
	@Override
	public String toString() {
	return "TV:"
	+ "\n" + super.toString()
	+ "\nLarghezza: " + getLarghezza()
	+ "\nAltezza: " + getAltezza ()
	+ "\nsmart: " + ( isSmart() ? "si'" : "no" );
	}
}
