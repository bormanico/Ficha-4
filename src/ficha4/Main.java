package ficha4;

public class Main {
	public static void main(String[] args) {
		Fruta banana1 = new FrutaUnidade("Banana", 0.5, 3);
		Fruta maca1 = new FrutaPeso("Ma��", 0.9, 1);
		Fruta groselha1 = new FrutaVolume("Groselha", 7, .250);
		Fruta maracuja1 = new FrutaUnidade("Maracuj�", 1.99, 3);

		Cesto cesto1 = new Cesto();

		cesto1.addFruta(banana1);
		cesto1.addFruta(groselha1);
		cesto1.addFruta(maca1);
		cesto1.addFruta(maracuja1);

		System.out.println("o tamanho do cesto � " + cesto1.getTotalItems());
		System.out.println("O valor total do cesto �: " + cesto1.valorCesto());
		System.out.println("o cesto cont�m " + cesto1.contaTipo("FrutaUnidade") + " frutas do tipo FrutaUnidade");
		System.out.println("o cesto cont�m " + cesto1.contaTipo("FrutaPeso") + " frutas do tipo FrutaPeso");
		System.out.println("o cesto cont�m " + cesto1.contaTipo("FrutaVolume") + " frutas do tipo FrutaVolume");
	}

}
