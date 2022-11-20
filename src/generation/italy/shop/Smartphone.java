package generation.italy.shop;

public class Smartphone extends Prodotto {
	private String IMEI;
	private int Memoria;
	
	public Smartphone (int Codice, String Nome, String Marca, int Prezzo, int Iva, String IMEI, int Memoria) {
		super (Codice, Nome,Marca, Prezzo, Iva);
		this.IMEI=IMEI;
		this.Memoria=Memoria;
		
	}
	public String getIMEI() {
		return IMEI;
	}
	public void setIMEI(int iMEI) {
		IMEI = IMEI;
	}
	public int getMemoria() {
		return Memoria;
	}
	public void setMemoria(int memoria) {
		Memoria = memoria;
	}
	
	
	@Override
	public String toString() {
		
		return super.toString()
			+"\nImei: " + getIMEI()
			+ "\nMemoria: " + getMemoria();
	}

}
