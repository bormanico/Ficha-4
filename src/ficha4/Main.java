package ficha4;

public class Main {
	public static void main(String[] args) {
		Fruta banana1 = new FrutaUnidade("Banana", 0.5, 3);
		Fruta maca1 = new FrutaPeso("Maçã", 0.9, 1);
		FrutaVolume groselha1 = new FrutaVolume("Groselha", 7, .250);
		Fruta maracuja1 = new FrutaUnidade("Maracujá", 1.99, 3);

		Cesto cesto1 = new Cesto();

		cesto1.addFruta(banana1);
		cesto1.addFruta(groselha1);
		cesto1.addFruta(maca1);
		cesto1.addFruta(maracuja1);

		System.out.println("o tamanho do cesto é " + cesto1.getTotalItems());
		System.out.println("O valor total do cesto é: " + cesto1.valorCesto());
		System.out.println("o cesto contém " + cesto1.contaTipo("FrutaUnidade")
				+ " frutas do tipo FrutaUnidade no valor de " + cesto1.valorPorTipo("FrutaUnidade") + " euros.");
		System.out.println("o cesto contém " + cesto1.contaTipo("FrutaPeso") + " frutas do tipo FrutaPeso no valor de "
				+ cesto1.valorPorTipo("FrutaPeso") + " euros.");
		System.out.println("o cesto contém " + cesto1.contaTipo("FrutaVolume")
				+ " frutas do tipo FrutaVolume no valor de " + cesto1.valorPorTipo("FrutaVolume") + " euros.");

		System.out.println("Preço da maçã sem desconto é: " + maca1.pagar());
		/*
		 * downcasting porque o método setPercentagemDesconto não está disponível para a
		 * classe Fruta
		 */
		((FrutaPeso) maca1).setPercentagemDesconto(.15);

		System.out.println("Preço da maçã com desconto é: " + maca1.pagar());

		System.out.println("Preço da groselha sem desconto é: " + groselha1.pagar());

		groselha1.setPercentagemDesconto(.251);

		System.out.println("Preço da groselha com desconto é: " + groselha1.pagar());

	}

}
