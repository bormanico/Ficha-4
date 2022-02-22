package ficha4;

public class FrutaVolume extends Fruta {

	private double volume;

	public FrutaVolume(String aNome, double aPrecoBase, double aVolume) {
		super(aNome, aPrecoBase);
		this.volume = aVolume;
	}

	public double pagar() {
		double preco = this.volume * getPrecoBase();
		return preco;
	}
}
