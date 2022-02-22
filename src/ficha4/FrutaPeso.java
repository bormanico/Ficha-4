package ficha4;

public class FrutaPeso extends Fruta {
	private double peso;

	public FrutaPeso(String aNome, double aPrecoBase, double aPeso) {
		super(aNome, aPrecoBase);
		this.peso = aPeso;
	}

	public double pagar() {
		double preco = this.peso * getPrecoBase();
		return preco;
	}
}
