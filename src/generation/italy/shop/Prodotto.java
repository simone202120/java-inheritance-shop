package generation.italy.shop;

public class Prodotto {
	
	 private int Codice;
	 private String Nome;
	 private String Marca;
	 private int Prezzo;
	 private int Iva;
	 
	 public Prodotto () {
	 
	 this.Codice=Codice;
	 this.Nome=Nome;
	 this.Marca=Marca;
	 this.Prezzo=Prezzo;
	 this.Iva=Iva;
	 }
	 public Prodotto (int Codice, String Nome, String Marca, int Prezzo, int Iva) {
		 
		 this.Codice=Codice;
		 this.Nome=Nome;
		 this.Marca=Marca;
		 this.Prezzo=Prezzo;
		 this.Iva=Iva;
	 }

	public int getCodice() {
		 return Codice;
	}

	public void setCodice(int codice) {
		Codice = codice;
	}
	
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String nome) {
		Nome = nome;
	}
	
	public String getMarca() {
		return Marca;
	}
	
	public void setMarca(String marca) {
		Marca = marca;
	}
	
	public int getPrezzo() {
		return Prezzo;
	}
	
	public void setPrezzo(int prezzo) {
		Prezzo = prezzo;
	}
	
	public int getIva() {
		return Iva;
	}
	
	public void setIva(int iva) {
		Iva = iva;
	}

	
	public double PrezzoIva() {
		int PrezzoIva= Prezzo + (Prezzo/100*Iva);
		return PrezzoIva;
	}
	
	@Override
	public String toString() {
		
		return  super.toString()
			+  "\nNome prodotto: " +getNome()
			+ "\nMarca: " + getMarca()
			+ "\nCodice prodotto: " + getCodice()
			+ "\nPrezzo senza IVA: " + getPrezzo()
			+ "\nPrezzo con IVA: " + PrezzoIva();

	}
}
