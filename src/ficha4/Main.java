package ficha4;

public class Main {
	public static void main(String[] args) {
		Fruta banana1 = new FrutaUnidade("Banana", 0.5, 3);
		Fruta maca1 = new FrutaPeso("Maçã", 0.9, 1);
		Fruta groselha1 = new FrutaVolume("Groselha", 7, .250);
		Fruta maracuja1 = new FrutaUnidade("Maracujá", 1.99, 3);

		Cesto cesto1 = new Cesto();

		cesto1.addFruta(banana1);
		cesto1.addFruta(groselha1);
		cesto1.addFruta(maca1);
		cesto1.addFruta(maracuja1);

	}
}
