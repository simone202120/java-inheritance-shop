package generation.italy.shop;

public class Main {
	
	public static void main(String[] args) {
		
		Prodotto p = new Prodotto(67532, "aspirapolvere", "Dyson", 700, 22);
		System.out.println(p);
		System.out.println("---------------------------");
		Televisore t = new Televisore(51034, "Bravia", "Sony", 9000, 22, 500, 900, true);
		System.out.println(t);
		System.out.println("---------------------------");
		Cuffie c = new Cuffie(17536, "free buds pro", "huawei", 100, 22, "grigio", false);
		System.out.println(c);
		System.out.println("---------------------------");
		Smartphone s = new Smartphone(89532, "xperia", "Sony", 900, 22, "678083432", 500);
		System.out.println(s);
		System.out.println("---------------------------");


	}

}
